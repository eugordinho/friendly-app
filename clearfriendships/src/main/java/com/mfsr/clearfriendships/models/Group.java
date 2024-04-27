package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

import java.util.List;

@Entity
public class Group {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String groupName, description;
    private double groupBalance;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private User owner;
    @OneToMany(mappedBy = "group")
    private List<Membership> groupMembers;


}
