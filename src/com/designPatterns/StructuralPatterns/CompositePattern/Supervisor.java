package com.designPatterns.StructuralPatterns.CompositePattern;

import java.util.ArrayList;
import java.util.List;

// composite component
public class Supervisor implements Faculty{
    private String name;
    private int id;
    private String department;
    private List<Faculty> membersList;

    public Supervisor(String name, int id, String department) {
        this.name = name;
        this.id = id;
        this.department = department;
        membersList = new ArrayList<>();
    }

    public void addMember(Faculty member) {
        membersList.add(member);
    }

    public void removeMember(Faculty member) {
        membersList.remove(member);
    }

    @Override
    public void getDetails() {
        System.out.printf("\n\nName: %s\n", name);
        System.out.printf("ID: %d\n", id);
        System.out.printf("department: %s\n", department);
        System.out.println("==============================");

        for(Faculty member : membersList) {
            member.getDetails();
        }
    }
}
