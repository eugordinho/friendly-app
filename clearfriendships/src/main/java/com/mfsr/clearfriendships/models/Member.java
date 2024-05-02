package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String name, email, password, cbu;
    @OneToMany(mappedBy = "owner")
    private List<FriendGroup> friendGroups;
    @OneToMany(mappedBy = "member")
    private List<Membership> groupMemberships = new ArrayList<>();

    public Member() {}
    public Member(String name, String email, String password, String cbu) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.cbu = cbu;
    }

    public String getCbu() {
        return cbu;
    }

    public void setCbu(String cbu) {
        this.cbu = cbu;
    }

    public Long getId() {
        return id;
    }

/*    public void setId(Long id) {
        this.id = id;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public List<FriendGroup> getGroups() {
        return friendGroups;
    }
    public void addGroup(FriendGroup friendGroup) {
        this.friendGroups.add(friendGroup);
    }
    public List<Membership> getGroupMemberships() {
        return groupMemberships;
    }
    public void addGroupMembership(Membership membership) {
        this.groupMemberships.add(membership);
    }

    @Override
    public String toString() {
        return "Member{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", cbu='" + cbu + '\'' +
                ", friendGroups=" + friendGroups +
                ", groupMemberships=" + groupMemberships +
                '}';
    }
}
