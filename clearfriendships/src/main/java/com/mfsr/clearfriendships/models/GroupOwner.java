package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class GroupOwner {

    @Id
    @GeneratedValue( strategy = GenerationType.IDENTITY )
    private String id;
    private String name, email, password;
    private double positiveBalance, negativeBalance;

    @OneToMany( mappedBy = "groupOwner" )
    private List<Group> group;

    public GroupOwner() {

    }
    public GroupOwner(String name, String email, String password, double positiveBalance, double negativeBalance) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.positiveBalance = positiveBalance;
        this.negativeBalance = negativeBalance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

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

    public double getPositiveBalance() {
        return positiveBalance;
    }

    public void setPositiveBalance(double positiveBalance) {
        this.positiveBalance = positiveBalance;
    }

    public double getNegativeBalance() {
        return negativeBalance;
    }

    public void setNegativeBalance(double negativeBalance) {
        this.negativeBalance = negativeBalance;
    }

    public List<Group> getGroup() {
        return group;
    }

    public void setGroup(List<Group> group) {
        this.group = group;
    }
}
