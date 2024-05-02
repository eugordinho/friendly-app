package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

@Entity
public class Membership {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "group_id")
    private FriendGroup friendGroup;
    @ManyToOne
    @JoinColumn(name = "member_id")
    private Member member;

    public Membership() {}
    public Membership(FriendGroup friendGroup, Member member) {
        this.friendGroup = friendGroup;
        this.member = member;
    }
    public Long getId() {
        return id;
    }
    public FriendGroup getGroup() {
        return friendGroup;
    }
    public Member getMember() {
        return member;
    }
    public void setGroup(FriendGroup friendGroup) {
        this.friendGroup = friendGroup;
    }
    public void setMember(Member member) {
        this.member = member;
    }

/*    @Override
    public String toString() {
        return "Membership{" +
                "id=" + id +
                ", friendGroup=" + friendGroup +
                ", member=" + member +
                '}';
    }*/
}
