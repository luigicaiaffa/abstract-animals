package org.lessons.java;

public abstract class AbstractAnimale {

    // # Variabili di istanza
    protected String name;
    protected int age;

    // # Costruttori
    public AbstractAnimale(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public AbstractAnimale() {
        this.name = "Unnamed";
        this.age = 0;
    }

    // # Metodi

    // * Getter e Setter
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return this.age;
    }

    // * Metodi aggiuntivi
    public void dormi() {
        System.out.println("Zzzz...");
    }

    public abstract void verso();

    public abstract void mangia();
}
