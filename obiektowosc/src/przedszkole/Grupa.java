package przedszkole;

import java.util.ArrayList;
import java.util.List;

public class Grupa {

    private String nazwaGrupy;
    private static int maxLiczbadzieci = 15;

    private static List<Grupa> ekstensja = new ArrayList<>();

    private List<Dziecko> dzieci = new ArrayList<>();

    private Wychowawca wychowawca;

    private Sala sala;
    public Grupa(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;

        ekstensja.add(this);
    }

    public void dodajDziecko(Dziecko dziecko) {
        if (dziecko.getGrupa() != null) {
            throw new IllegalArgumentException("Dziecko ma już przypisaną grupę !");
        }
        dzieci.add(dziecko);
        dziecko.setGrupa(this);
    }
    public void wyswietlDziecko() {
        for (Dziecko dziecko : dzieci) {
            System.out.println(dziecko);
        }
    }
    public String getNazwaGrupy() {
        return nazwaGrupy;
    }


    public void setNazwaGrupy(String nazwaGrupy) {
        this.nazwaGrupy = nazwaGrupy;
    }

    public static int getMaxLiczbadzieci() {
        return maxLiczbadzieci;
    }

    public static void setMaxLiczbadzieci(int maxLiczbadzieci) {
        Grupa.maxLiczbadzieci = maxLiczbadzieci;
    }

    public static List<Grupa> getEkstansja() {
        return ekstensja;
    }

    public static void setEkstansja(List<Grupa> ekstansja) {
        Grupa.ekstensja = ekstansja;
    }

    public Wychowawca getWychowawca() {
        return wychowawca;
    }

    public void setWychowawca(Wychowawca wychowawca) {
        this.wychowawca = wychowawca;
    }

    public Sala getSala() {
        return sala;
    }

    public void setSala(Sala sala) {
        for (Grupa grupa : ekstensja) {
            if (grupa.getSala() == sala) {
                throw new IllegalArgumentException("Grupa ma już przypisaną sale !");
            }
        }
        this.sala = sala;
    }

    @Override
    public String toString() {
        return nazwaGrupy;
    }
}

/*
 * Stwórz system do zarządzania przedszkolem. W przedszkolu mamy dzieci oraz
 * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
 * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
 *
 * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
 * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych.
 *
 * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
 * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce.
 *
 * Kazda grupa ma przypisana sale (nazwa, kolor scian).
 *
 * -narysuj poprawny diagram uml do teog zagadnienia -napisz metode która zwraca
 * dziecko ktore ma najwiecej przewinien -napisz metode ktora zwroci wychowawcow
 * kwliafikowanych z pensja wieksza niz podany parametr

 */