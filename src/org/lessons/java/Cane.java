package org.lessons.java;

public class Cane extends AbstractAnimale {

    public Cane(String name, String spec, int age) {
        this.name = name;
        this.spec = spec;
        this.age = age;
    }

    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Mangio carne, pesce, latticini, frutta e verdura");
    }

}
