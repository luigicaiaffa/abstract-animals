package org.lessons.java;

public class Passerotto extends AbstractAnimale {

    public Passerotto(String name, String spec, int age) {
        this.name = name;
        this.spec = spec;
        this.age = age;
    }

    @Override
    public void verso() {
        System.out.println("Cip cip");
    }

    @Override
    public void mangia() {
        System.out.println("Semi");
    }
}
