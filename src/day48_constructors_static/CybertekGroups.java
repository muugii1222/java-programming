package day48_constructors_static;

import day41_arraylist.ArraysAsList;

import java.util.ArrayList;
import java.util.Arrays;

public class CybertekGroups {
    public static void main(String[] args) {
        Group group1 = new Group("Cyberbugs");
        //print size of members
        System.out.println(group1.getMembers().size());
        group1.addMember("Berk");
        group1.addMember("Pavel");
        group1.addMember("Elvin");
        group1.addMember("Ali");
        group1.addMember("Parvin");
        group1.addMember("Rasim");
        group1.addMember("Maria");

        System.out.println(group1.getMembers().size());
        System.out.println(group1);

        Group group2 = new Group("CyberCats");
        group2.setMembers(Arrays.asList("Stephan", "Wakshum", "Akrem", "Bulent", "Andrea", "Andrei"));
        System.out.println(group2.getMembers());

        if (group2.getMembers().contains("Akrem")){
            System.out.println("Akrem is here!");
        } else {
            System.out.println("Akrem is group member");
        }
    }
}
