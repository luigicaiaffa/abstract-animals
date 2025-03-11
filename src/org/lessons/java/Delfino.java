package org.lessons.java;

public class Delfino extends AbstractAnimale {

    public Delfino(String name, String spec, int age) {
        this.name = name;
        this.spec = spec;
        this.age = age;
    }

    @Override
    public void verso() {
        System.out.println("Iiih iiiih");
    }

    @Override
    public void mangia() {
        System.out.println("Pesce e Crostacei");
    }
}
