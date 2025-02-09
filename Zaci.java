import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.*;


class ZaciRozsireni {
    private String jmeno;
    private String prijmeni;
    private int rokNarozeni;

    public ZaciRozsireni(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ZaciRozsireni student = (ZaciRozsireni) o;
        return rokNarozeni == student.rokNarozeni &&
                Objects.equals(jmeno, student.jmeno) &&
                Objects.equals(prijmeni, student.prijmeni);
    }

    @Override
    public int hashCode() {
        return Objects.hash(jmeno, prijmeni, rokNarozeni);
    }

    @Override
    public String toString() {
        return jmeno + " " + prijmeni + " (" + rokNarozeni + ")";
    }

    public String getJmeno() {
        return jmeno;
    }
}

class Tuple<E1, E2> {
    private E1 first;
    private E2 second;

    public Tuple(E1 first, E2 second) {
        this.first = first;
        this.second = second;
    }

    public E1 getFirst() {
        return first;
    }

    public E2 getSecond() {
        return second;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Tuple<?, ?> tuple = (Tuple<?, ?>) o;
        return Objects.equals(first, tuple.first) &&
                Objects.equals(second, tuple.second);
    }

    @Override
    public int hashCode() {
        return Objects.hash(first, second);
    }

    @Override
    public String toString() {
        return "(" + first + ", " + second + ")";
    }
}

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

        List<ZaciRozsireni> zaciRozsireni = new ArrayList<>();
    ZaciRozsireni petr = new ZaciRozsireni("Petr", "Novák", 2000);
    ZaciRozsireni radek = new ZaciRozsireni("Radek", "Horský", 1999);
    ZaciRozsireni jana = new ZaciRozsireni("Jana", "Sklářská", 2002);

        zaciRozsireni.add(petr);
        zaciRozsireni.add(radek);
        zaciRozsireni.add(jana);

        System.out.println("\nÚkol 2");


       System.out.println("\nOvěření existence studentů");
       System.out.println("Petr je student = " + zaciRozsireni.contains(petr));
       System.out.println("Radek je student = " + zaciRozsireni.contains(radek));
       System.out.println("Jana je studentka = " + zaciRozsireni.contains(jana));

// Úkol 3 + 4
    Set<Tuple<String, Integer>> tupleSet = new HashSet<>();

    Tuple<String, Integer> tuple1 = new Tuple<>("Petr", 2000);
    Tuple<String, Integer> tuple2 = new Tuple<>("Radek", 1999);
    Tuple<String, Integer> tuple3 = new Tuple<>("Jana", 2002);
    Tuple<String, Integer> tuple4 = new Tuple<>("Petr", 2000); // Duplicitní Petr

        tupleSet.add(tuple1);
        tupleSet.add(tuple2);
        tupleSet.add(tuple3);
        tupleSet.add(tuple4); // Přidání duplicitního Petra

        System.out.println("\nÚkol 3+4");
        System.out.println("\nObsah množiny Tuple:");
        for (Tuple<String, Integer> tuple : tupleSet) {
        System.out.println(tuple);
    }

        System.out.println("\nVelikost množiny Tuple: " + tupleSet.size());
        System.out.println("Obsahuje množina tuple1? " + tupleSet.contains(tuple1));
        System.out.println("Obsahuje množina tuple4? " + tupleSet.contains(tuple4));

        tupleSet.remove(tuple1);
        System.out.println("\nVelikost množiny po odebrání tuple1: " + tupleSet.size());
        System.out.println("Obsahuje množina tuple1 po odebrání? " + tupleSet.contains(tuple1));
}
}




