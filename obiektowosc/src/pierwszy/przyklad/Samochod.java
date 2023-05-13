package pierwszy.przyklad;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Samochod {

    //atrybuty (pola) klasy samochod

    //private - widocznosc tylko w klasie w ktorej jestesmy
    //final - oznacza ze pole jest niemodyfikowalne

    private final String marka;
    private final String model;
    private String kolor;
    private int przebieg;
    private final int rokProdukcji;

    //ekstensja klasy samochod
    private static List<Samochod> ekstensja = new ArrayList<>();

    //konstruktor klasy Samochod, uruchamiany w momencie tworzenia obiektu
    //za pomoca slowa kluczowego new - nic nie zwraca, nie deklaruje typu zwracanego -> nazwa musi byc identyczna jak
    //nazwa klasy (konstruktor wymusza odpowiednia budowe obiektu)
    public Samochod(String marka, String model, String kolor, int przebieg, int rokProdukcji) {
        // slowo kluczowe this wskazuje nam na pole klasy
        this.marka = marka;
        this.model = model;
        this.kolor = kolor;
        this.przebieg = przebieg;
        this.rokProdukcji = rokProdukcji;

        //automatyczne dodawanie tworznego obiektu do listy ekstensja
        //this oznacza ze wchodzi w jego miejsce obiekt na ktorym wywolywana jest metoda/konstruktor
        ekstensja.add(this);
    }

    //napisz metode która zwraca wiek auta
    public int zwrocWiek() {
        return LocalDate.now().getYear() - rokProdukcji;
    }

    //Napisz metode ktora zwraca najstarsze auto
    public static Samochod najstarszySamochod (List<Samochod> list) {
        Samochod najstarszy = list.get(0);
        for (Samochod element : list) {
            if (najstarszy.zwrocWiek() < element.zwrocWiek()) {
                najstarszy = element;
            }
        }
        return najstarszy;
    }

    //metoda zwracajaca samochody starsze niz 10 lat

    public static List<Samochod> samochodyStarszeNiz10Lat (List<Samochod> list) {
        List<Samochod> wynik = new ArrayList<>();
        for (Samochod element : list) {
            if (element.zwrocWiek() > 10) {
                wynik.add(element);
            }
        }
        return wynik;
    }

    // gettery i settery


    //gettery - zwracaja wartosc danego pola
    public String getMarka() {
        return marka;
    }

    public String getModel() {
        return model;
    }

    public String getKolor() {
        return kolor;
    }
    //setter - ustawiaja nowa wartosc dla danego pola
    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public int getPrzebieg() {
        return przebieg;
    }

    public void setPrzebieg(int przebieg) {
        this.przebieg = przebieg;
    }

    public int getRokProdukcji() {
        return rokProdukcji;
    }

    public static List<Samochod> getEkstensja() {
        return ekstensja;
    }

    //przesloniecie metody toString() - piszemy wlasna interpretacje istniejacej juz metody

    public String toString() {
        return marka + " " + model;
    }



}
