package org.lessons.java;

public class Cane extends AbstractAnimale {
    @Override
    public void verso() {
        System.out.println("Bau bau");
    }

    @Override
    public void mangia() {
        System.out.println("Carne, Pesce, Latticini, Frutta e Verdura");
    }

}
