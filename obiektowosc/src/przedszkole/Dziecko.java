package przedszkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Dziecko extends Person {

    private int iloscOdznak;
    private int iloscPrzewinien;

    private static List<Dziecko> ekstensja = new ArrayList<>();

    private Grupa grupa;


    public Dziecko(String imie, String nazwisko, LocalDate dataUrodzenia, int iloscOdznak, int iloscPrzewinien) {
        super(imie, nazwisko, dataUrodzenia);
        this.iloscOdznak = iloscOdznak;
        this.iloscPrzewinien = iloscPrzewinien;

        ekstensja.add(this);
    }

    public static Dziecko zNajwiekszaIlosciaPrzewinien(List<Dziecko> list) {
        Dziecko najwiecej = list.get(0);
        for (Dziecko element : list) {
            if (element.getIloscPrzewinien() > najwiecej.getIloscPrzewinien()) {
                najwiecej = element;
            }
        }
        return najwiecej;
    }

    public int getIloscOdznak() {
        return iloscOdznak;
    }

    public void setIloscOdznak(int iloscOdznak) {
        this.iloscOdznak = iloscOdznak;
    }

    public int getIloscPrzewinien() {
        return iloscPrzewinien;
    }

    public void setIloscPrzewinien(int iloscPrzewinien) {
        this.iloscPrzewinien = iloscPrzewinien;
    }

    public Grupa getGrupa() {
        return grupa;
    }

    public void setGrupa(Grupa grupa) {
        this.grupa = grupa;
    }

    public static List<Dziecko> getEkstencja() {
        return ekstensja;
    }

    public void setEkstencja(List<Dziecko> ekstencja) {
        this.ekstensja = ekstencja;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + " " + "ilość odznak: " + iloscOdznak + " ilość przewinień: " + iloscPrzewinien;
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