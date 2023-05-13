package przyklady.uml;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Szkola szkola = new Szkola("SP", 1999, 1);
        Szkola szkola1 = new Szkola("LO", 2001, 3);
        Uczen uczen = new Uczen("Jan", "Kowalski", "Polna 11, Zakopane", "11-12-1993", 500);

        System.out.println(szkola);
        System.out.println(szkola1);

        szkola.dodajProfil("Humanistyczny");

        System.out.println(szkola.getProfile());
        szkola.dodajUcznia(uczen);
        szkola.wyswietlUczniow();
        System.out.println(uczen.getSzkola());

        Szkolenie szkolenie = new Szkolenie("szkolenie");
        Nauczyciel nauczyciel = new Nauczyciel("Maciej", "Nowak","Sopot","11-20", 500,500);

        nauczyciel.dodajSzkolenie(szkolenie);
        System.out.println(nauczyciel.getSzkolenia());
        System.out.println(szkolenie.getNauczyciele());

        Sprawdzian sprawdzian = new Sprawdzian("polski");
        Ocena ocena = new Ocena(4, LocalDate.of(2022, 11, 6), uczen, sprawdzian);
        System.out.println(ocena);
    }
}
