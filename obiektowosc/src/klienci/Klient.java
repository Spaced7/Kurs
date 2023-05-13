package klienci;

import java.util.ArrayList;
import java.util.List;

public class Klient {

    private String imie;
    private String nazwisko;
    private int rozmiarButa;


    private static List<Klient> ekstensja = new ArrayList<>();

    private List<Produkt> produkty = new ArrayList<>();

    public Klient(String imie, String nazwisko, int rozmiarButa) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.rozmiarButa = rozmiarButa;

        ekstensja.add(this);
    }

    public boolean czyKupiliButy(String nazwa) {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase(nazwa))
                return true;
        }
        return false;
    }

    public static List<Klient> KlienciKupujacyButy(List<Klient> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista nie moze byc pusta");
        }
        List<Klient> wynik = new ArrayList<>();
        for (Klient klient : list) {
            if (klient.czyKupiliButy("buty")) {
                wynik.add(klient);
            }
        }
        return wynik;
    }


    public boolean czyDobryRozmiarButa() {
        for (Produkt produkt : produkty) {
            if (produkt.getNazwa().equalsIgnoreCase("Buty") && produkt.getRozmiarButa() == rozmiarButa) {
                return true;
            }
        }
        return false;
    }


    public static List<Klient> kupujacyNiewlasciowyRozmiar(List<Klient> list) {
        List<Klient> wynik = new ArrayList<>();
        for (Klient klient : list) {
            if (klient.czyKupiliButy("Buty") && !klient.czyDobryRozmiarButa()) {
                wynik.add(klient);
            }
        }
        return wynik;
    }


    public void dodajProdukt(Produkt produkt) {
        if (produkt.getKlient() != null) {
            throw new IllegalArgumentException("Produkt ma już swojego klienta!");
        }
        produkty.add(produkt);
        produkt.setKlient(this);
    }

    public int sumaWydatkow() {
        int suma = 0;
        for (Produkt produkt : produkty) {
            suma += produkt.getCena();
        }
        return suma;
    }

    public static Klient klientKtoryNajwiecejWydal(List<Klient> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista nie może być pusta");
        }
        Klient wynik = list.get(0);
        for (Klient klient : list) {
            if (klient.sumaWydatkow() > wynik.sumaWydatkow()) {
                wynik = klient;
            }
        }
        return wynik;
    }
    //if klientIlewydalklient > maxwydatek to zamienimay
    //robic na dwie metody -> ileWydalKlient()
    public static Klient najwiecejWydal(List<Klient> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista nie moze byc pusta");
        }
        Klient wynik = list.get(0);
        int maxWydatek = 0;
        for (Klient klient : list) {
            int sumaWydatkow = klient.sumaWydatkow();
            if (sumaWydatkow > maxWydatek) {
                maxWydatek = sumaWydatkow;
                wynik = klient;
            }
        }
        return wynik;
    }

    public void wyswietlProdukt() {
        for (Produkt produkt : produkty) {
            System.out.println(produkt);
        }
    }

    public String getImie() {
        return imie;
    }

    public void setImie(String imie) {
        this.imie = imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public void setNazwisko(String nazwisko) {
        this.nazwisko = nazwisko;
    }

    public int getRozmiarButa() {
        return rozmiarButa;
    }

    public void setRozmiarButa(String rozmiarButa) {
        this.rozmiarButa = Integer.parseInt(rozmiarButa);
    }

    public static List<Klient> getEkstencja() {
        return ekstensja;
    }


    public List<Produkt> getProdukty() {
        return produkty;
    }

    public void setProdukty(List<Produkt> produkty) {
        this.produkty = produkty;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko + " " + rozmiarButa;
    }
}
