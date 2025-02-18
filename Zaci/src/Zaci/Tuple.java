import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Tuple<E1, E2> {
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

    public static void main(String[] args) {
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

        // Odstranění duplicitního Petra
        tupleSet.remove(tuple1);
        System.out.println("\nVelikost množiny po odebrání duplicitního Petra: " + tupleSet.size());
        System.out.println("Obsahuje množina Petra po odebrání? " + tupleSet.contains(tuple1));
    }
}
