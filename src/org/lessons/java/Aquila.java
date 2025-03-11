package org.lessons.java;

public class Aquila extends AbstractAnimale {

    public Aquila(String name, String spec, int age) {
        this.name = name;
        this.spec = spec;
        this.age = age;
    }

    @Override
    public void verso() {
        System.out.println("Kiiihhh");
    }

    @Override
    public void mangia() {
        System.out.println("Carne e Pesce");
    }
}
