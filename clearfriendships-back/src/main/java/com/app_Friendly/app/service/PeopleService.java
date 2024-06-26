package com.app_Friendly.app.service;

import com.app_Friendly.app.model.People;
import com.app_Friendly.app.repository.GroupRepository;
import com.app_Friendly.app.repository.PeopleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

@Service
public class PeopleService {

    @Autowired
    private final PeopleRepository peopleRepository;

    @Autowired
    private GroupRepository groupRepository;

    @Autowired
    private final BCryptPasswordEncoder bCryptPasswordEncoder;

    public PeopleService(PeopleRepository peopleRepository,BCryptPasswordEncoder bCryptPasswordEncoder){
        this.peopleRepository = peopleRepository;
        this.bCryptPasswordEncoder=bCryptPasswordEncoder;
    }

    public People registerPeople(String name, String email, String password){

        // Validar los datos de etrada
        if (name == null || name.isEmpty()){
            throw new IllegalArgumentException("El nombre no puede estar vacio");
        }
        if (email == null || email.isEmpty()){
            throw new IllegalArgumentException("El email no puede estar vacio");
        }
        if (password == null || password.isEmpty()){
            throw new IllegalArgumentException("La cotraseña no puede estar vacio");
        }

        //Verificar si el email ya esta registrado
        if (peopleRepository.findByEmail(email) != null){
            throw  new IllegalArgumentException("El correo electronico ya esta registrado");
        }

        //Hash la contraseña bcrypt
        String hashedPassword = bCryptPasswordEncoder.encode(password);
        People people= new People(name,email, hashedPassword);
        return peopleRepository.save(people);

    }

    public People updatePeople(String id, String name, String email, String password, String imageUrl) {
        People people = peopleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("La persona no existe"));

        if (name != null && !name.isEmpty()) {
            people.setName(name);
        }
        if (email != null && !email.isEmpty()) {
            // Verificar si el correo electrónico ya está registrado para otra persona
            if (!email.equals(people.getEmail()) && peopleRepository.findByEmail(email) != null) {
                throw new IllegalArgumentException("El correo electrónico ya está registrado");
            }
            people.setEmail(email);
        }
        if (password != null && !password.isEmpty()) {
            people.setPassword(password);
        }
        if (imageUrl != null && !imageUrl.isEmpty()){
            people.setImageUrl(imageUrl);
        }

        return peopleRepository.save(people);
    }

    public People findById(String id){
        return peopleRepository.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("La persona no existe"));
    }

    public People login(String email, String password){
        People people = peopleRepository.findByEmail(email);
        if (people != null && people.authenticate(email,password)){
            return people;
        }
        return null;
    }
    public List<People> getPeoples(){
        return peopleRepository.findAll();
    }

    public String uploadImage(MultipartFile file) {
        return "https://example.com/images/" + file.getOriginalFilename();
    }

}
