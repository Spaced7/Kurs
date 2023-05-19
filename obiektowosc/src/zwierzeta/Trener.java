package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Trener {

    private String imie;
    private String nazwisko;
    private String adres;

    private List<Kot> koty = new ArrayList<>();
    private List<Pies> psy = new ArrayList<>();
    private List<Pterodaktyl> pterodaktyle = new ArrayList<>();

    private List<Sprzet> sprzety = new ArrayList<>();

    private static List<Trener> ekstensja = new ArrayList<>();

    public Trener(String imie, String nazwisko, String adres) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;

        ekstensja.add(this);
    }

    public void dodajSprzet(Sprzet sprzet) {
        if (sprzet.getTrener() != null) {
            throw new IllegalArgumentException("Sprzęt jest aktualnie zajęty");
        }
        sprzety.add(sprzet);
        sprzet.setTrener(this);
    }


    public int liczbaTrenowanychZwierzat() {
        return koty.size() + psy.size() + pterodaktyle.size();
    }

    public static List<Trener> ktoTrenowalSpaniele(List<Trener> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista nie może być pusta");
        }
        List<Trener> wynik = new ArrayList<>();
        for (Trener trener : list) {
            for (Pies pies : trener.getPsy()) {
                if (pies.getGatunek().equalsIgnoreCase("spaniel")) {
                    wynik.add(trener);
                    break;
                }
            }
        }
        return wynik;
    }

    public static Trener ktoTrenowalNajwiecejZwierzat(List<Trener> list) {
        if (list == null || list.isEmpty()) {
            throw new IllegalArgumentException("Lista nie może być pusta!");
        }
        Trener najwiecejWytrenowanych = list.get(0);
        for (Trener trener : list) {
            if (trener.liczbaTrenowanychZwierzat() > najwiecejWytrenowanych.liczbaTrenowanychZwierzat()) {
                najwiecejWytrenowanych = trener;
            }
        }
        return najwiecejWytrenowanych;

    }

    public void dodajPterodaktyla(Pterodaktyl pterodaktyl) {
        if (pterodaktyl.getTrener() != null) {
            throw new IllegalArgumentException("zwierz ma już przypisanego trenera!");
        }
        pterodaktyle.add(pterodaktyl);
        pterodaktyl.setTrener(this);
    }

//    public static List<Pterodaktyl> znajdzNietrenowane(List<Pterodaktyl> list) {
//        List<Pterodaktyl> wynik = new ArrayList<>();
//        for (Pterodaktyl pterodaktyl : list) {
//            if (pterodaktyl.getTrener() == null) {
//                wynik.add(pterodaktyl);
//            }
//        }
//        return wynik;
//    }


    public void dodajPsa(Pies pies) {
        if (pies.getTrener() != null) {
            throw new IllegalArgumentException("zwierz ma już przypisanego trenera!");
        }
        psy.add(pies);
        pies.setTrener(this);
    }

    public void dodajKota(Kot kot) {
        if (kot.getTrener() != null) {
            throw new IllegalArgumentException("zwierz ma już przypisanego trenera!");
        }
        koty.add(kot);
        kot.setTrener(this);
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

    public String getAdres() {
        return adres;
    }

    public void setAdres(String adres) {
        this.adres = adres;
    }

    public List<Kot> getKoty() {
        return koty;
    }

    public void setKoty(List<Kot> koty) {
        this.koty = koty;
    }

    public static List<Trener> getEkstensja() {
        return ekstensja;
    }

    public static void setEkstensja(List<Trener> ekstensja) {
        Trener.ekstensja = ekstensja;
    }

    public List<Pies> getPsy() {
        return psy;
    }

    public void setPsy(List<Pies> psy) {
        this.psy = psy;
    }

    public List<Pterodaktyl> getPterodaktyle() {
        return pterodaktyle;
    }

    public void setPterodaktyle(List<Pterodaktyl> pterodaktyle) {
        this.pterodaktyle = pterodaktyle;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
