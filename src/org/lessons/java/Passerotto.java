package org.lessons.java;

import org.lessons.java.interfaces.Volante;

public class Passerotto extends AbstractAnimale implements Volante {

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
        System.out.println("Mangio semi");
    }

    @Override
    public void vola() {
        System.out.println("Sto Volando");
    }
}
