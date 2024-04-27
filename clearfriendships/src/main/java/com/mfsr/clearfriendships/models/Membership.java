package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private Group group;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private User member;
}
