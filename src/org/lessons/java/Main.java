package org.lessons.java;

public class Main {
    public static void main(String[] args) {
        AbstractAnimale cane = new Cane("Pippo", "Mammifero", 15);
        AbstractAnimale passerotto = new Passerotto("Trilli", "Uccello", 3);
        AbstractAnimale aquila = new Aquila("Cesare", "Uccello", 7);
        AbstractAnimale delfino = new Delfino("Lucio", "Cetaceo", 30);
    
        System.out.println("\n");

        System.out.println("Cane: ");
        cane.verso();
        cane.mangia();
        cane.dormi();
        System.out.println("\n");

        System.out.println("Passerotto: ");
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();
        System.out.println("\n");

        System.out.println("Aquila: ");
        aquila.verso();
        aquila.mangia();
        aquila.dormi();
        System.out.println("\n");

        System.out.println("Delfino: ");
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
        System.out.println("\n");

    }
}
