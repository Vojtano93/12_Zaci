package Zaci;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class Student {
    private String jmeno;
    private String prijmeni;
    private int rokNarozeni;

    public Student(String jmeno, String prijmeni, int rokNarozeni) {
        this.jmeno = jmeno;
        this.prijmeni = prijmeni;
        this.rokNarozeni = rokNarozeni;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
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

    public static void main(String[] args) {
        List<Student> zaciRozsireni = new ArrayList<>();
        Student petr = new Student("Petr", "Novák", 2000);
        Student radek = new Student("Radek", "Horský", 1999);
        Student jana = new Student("Jana", "Sklářská", 2002);

        zaciRozsireni.add(petr);
        zaciRozsireni.add(radek);
        zaciRozsireni.add(jana);

        System.out.println("\nÚkol 2");

        System.out.println("\nOvěření existence studentů");
        System.out.println("Petr je student = " + zaciRozsireni.contains(petr));
        System.out.println("Radek je student = " + zaciRozsireni.contains(radek));
        System.out.println("Jana je studentka = " + zaciRozsireni.contains(jana));
    }
}
