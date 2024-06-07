import React from "react";

const DEMO_USER = {
  name: "John Doe",
  img: "https://img.freepik.com/foto-gratis/retrato-hombre-reir_23-2148859448.jpg?t=st=1717706033~exp=1717709633~hmac=122021107cae28f8c0cf1eb969884dbb6e3246dfc5b3bfef736eb7157e7f4ad1&w=826",
  mail: "johndoe123@gmail.com",
  phone: "3001234567",
  password: "contrasena123",
};

function ProfileForm() {
  return (
    <div>
      <img src={DEMO_USER.img} alt={`foto de perfil de ${DEMO_USER.name}`} />
      <h2>{DEMO_USER.name}</h2>
      <h3>telefono</h3>
      <input type="text" value={DEMO_USER.phone} />
      <h3>email</h3>
      <input type="text" value={DEMO_USER.mail} />
      <h3>contraseña</h3>
      <input type="password" value={DEMO_USER.password} />
    </div>
  );
}

export default ProfileForm;
