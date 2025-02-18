package Zaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;





public class Zaci {

    public static void main(String[] args) {

        List<String> seznamZaku = new ArrayList<>();
        seznamZaku.add("Petr");
        seznamZaku.add("Radek");
        seznamZaku.add("Jana");

        // Původní seznam žáků
        System.out.println("Úkol 1");
        System.out.println("Původní seznam žáků: " + seznamZaku);

        // Vyřazení Petra
        seznamZaku.remove(0);


        // Ověření, že Petr není v seznamu
        boolean petrNeniVKurzu = !seznamZaku.contains("Petr");
        System.out.println("Je Petr v kurzu? " + (petrNeniVKurzu ? "Ne" : "Ano"));

        System.out.println("Aktualizovaný seznam žáků: " + seznamZaku);

    }
}
