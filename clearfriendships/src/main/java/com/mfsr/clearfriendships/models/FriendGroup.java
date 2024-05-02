package com.mfsr.clearfriendships.models;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
public class FriendGroup {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String groupName, description;
    private double groupBalance;
    @ManyToOne
    @JoinColumn(name = "owner_id")
    private Member owner;
    @OneToMany(mappedBy = "friendGroup")
    private List<Membership> groupMembers = new ArrayList<>();

    public FriendGroup() {}
    public FriendGroup(String groupName, String description, double groupBalance, Member owner) {
        this.groupName = groupName;
        this.description = description;
        this.groupBalance = groupBalance;
        this.owner = owner;
    }
    public Long getId() {
        return id;
    }
    public String getGroupName() {
        return groupName;
    }
    public String getDescription() {
        return description;
    }
    public double getGroupBalance() {
        return groupBalance;
    }
    public Member getOwner() {
        return owner;
    }
    public List<Membership> getGroupMembers() {
        return groupMembers;
    }

    private void setId(Long id) {
        this.id = id;
    }
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public void setGroupBalance(double groupBalance) {
        this.groupBalance = groupBalance;
    }
    public void setOwner(Member owner) {
        this.owner = owner;
        owner.addGroup(this);
    }
    public void setGroupMembers(Membership groupMember) {
        this.groupMembers.add(groupMember);
    }

    @Override
    public String toString() {
        return "FriendGroup{" +
                "id=" + id +
                ", groupName='" + groupName + '\'' +
                ", description='" + description + '\'' +
                ", groupBalance=" + groupBalance +
                ", owner=" + owner +
                ", groupMembers=" + groupMembers +
                '}';
    }
}
