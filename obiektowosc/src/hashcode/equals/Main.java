package hashcode.equals;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        Pracownik pracownik1 = new Pracownik("Jan", "Kowalski", 5000);
        Pracownik pracownik2 = new Pracownik("Jan", "Kowalski", 5001);

        Set<Pracownik> pracownicy = new HashSet<>(Arrays.asList(pracownik1,pracownik2));

        // == porownuje referencje obiektu a nie wartosci struktralne
        System.out.println(pracownik1 == pracownik2);

        // metoda equals() dopoki nie przeslonimy metody to dziala jako operator ==
        System.out.println(pracownik1.equals(pracownik2)); //true

        System.out.println(pracownicy.size()); //1

        System.out.println(pracownik1.hashCode());
        System.out.println(pracownik2.hashCode());

    }
}
