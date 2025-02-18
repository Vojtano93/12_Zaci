import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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

    public static void main(String[] args) {
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
    }
}
