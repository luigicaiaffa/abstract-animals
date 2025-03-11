package org.lessons.java;

public abstract class AbstractAnimale {

    // # Variabili di istanza
    protected String name;
    protected String spec;
    protected int age;

    // # Costruttori
    public AbstractAnimale(String name, String spec, int age) {
        this.name = name;
        this.spec = spec;
        this.age = age;
    }

    public AbstractAnimale() {
        this.name = "Unnamed";
        this.spec = "Undefined";
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

    public void setSpec(String spec) {
        this.spec = spec;
    }

    public String getSpec() {
        return this.spec;
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
