package org.lessons.java;

import org.lessons.java.interfaces.Volante;

public class Aquila extends AbstractAnimale implements Volante {

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
        System.out.println("Mangio carne e pesce");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando");
    }
}
