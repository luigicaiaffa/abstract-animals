package org.lessons.java;

import org.lessons.java.interfaces.Nuotante;
import org.lessons.java.interfaces.Volante;

public class Main {
    public static void faiVolare(Volante animale) {
        animale.vola();
    }

    public static void faiNuotare(Nuotante animale) {
        animale.nuota();
    }

    public static void main(String[] args) {
        Cane cane = new Cane("Pippo", "Mammifero", 15);
        Passerotto passerotto = new Passerotto("Trilli", "Uccello", 3);
        Aquila aquila = new Aquila("Cesare", "Uccello", 7);
        Delfino delfino = new Delfino("Lucio", "Cetaceo", 30);

        System.out.println("\n");

        System.out.println("Cane: ");
        cane.verso();
        cane.mangia();
        cane.dormi();
        System.out.println("\n");

        System.out.println("Passerotto: ");
        faiVolare(passerotto);
        passerotto.verso();
        passerotto.mangia();
        passerotto.dormi();
        System.out.println("\n");

        System.out.println("Aquila: ");
        faiVolare(aquila);
        aquila.verso();
        aquila.mangia();
        aquila.dormi();
        System.out.println("\n");

        System.out.println("Delfino: ");
        faiNuotare(delfino);
        delfino.verso();
        delfino.mangia();
        delfino.dormi();
        System.out.println("\n");
    }
}
