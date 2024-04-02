package org.example;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Backender b1 = new Backender("Artem",34);
        Frontender f1 = new Frontender("Marianna",32);
        Fullstack full1 = new Fullstack("Anna",32);
        Backendable full2 = new Fullstack("Victoria",29);
        Developer f2 = new Frontender("Vladimir",23);
        Developer b2 = new Backender("Kirill", 23);
        ArrayList<Developer> developers = new ArrayList<>();
        developers.add(b1);
        developers.add(f1);
        developers.add(f2);
        developers.add(b2);



        Developer.developGUI(developers);
//        back.doBackendWork();
//        back.doFrontendWork();
//
//        front.doBackendWork();
//        front.doFrontendWork();
//
//        full.doBackendWork();
//        full.doFrontendWork();
//
//        full2.doBackendWork();

    }
}