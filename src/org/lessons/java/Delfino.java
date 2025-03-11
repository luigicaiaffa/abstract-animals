package org.lessons.java;

import org.lessons.java.interfaces.Nuotante;

public class Delfino extends AbstractAnimale implements Nuotante {

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
        System.out.println("Mangio pesce e crostacei");
    }

    @Override
    public void nuota() {
        System.out.println("Sto Nuotando");
    }
}
