package przyklady.uml;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Szkola {

    // atrybuty proste - zwykle Stringi, inty bez dodatkowych wymagan
    private String nazwa;
    private int rokWybudowania;

    // atrybut powtarzalny, moze miec wiecej niz jedna wartosc, na UML: [1..*]
    private List<String> profile = new ArrayList<>();

    //atrybut opcjonalny, nie kazdy obiekt ma wartosc tego atrybutu, na UML: [0..1]
    private String wyroznienie;

    // atrybut unikalny, unikalna wartosc w ramach danej ekstensji, na UML {unique}
    private int numer;

    // atrybut klasowy, taki sam dla kazdego obiektu danej klasy, na UML: podkreslenie
    private static int minLiczbaUczniow = 150;

    private static List<Szkola> ekstensja = new ArrayList<>();

    //lista uczniow dla asocjacji *
    private List<Uczen> uczniowie = new ArrayList<>();

    public Szkola(String nazwa, int rokWybudowania, int numer) {
        this.nazwa = nazwa;
        this.rokWybudowania = rokWybudowania;
        setNumer(numer);

        ekstensja.add(this);
    }

    public Szkola(String nazwa, int rokWybudowania, String wyroznienie, int numer) {
        this.nazwa = nazwa;
        this.rokWybudowania = rokWybudowania;
        this.wyroznienie = wyroznienie;
        setNumer(numer);

        ekstensja.add(this);

    }

    //metoda towrzaca asocjacje
    public void dodajUcznia(Uczen uczen) {
        if (uczen.getSzkola() != null) {
            throw new IllegalArgumentException("Uczen ma juz przypisana Szkole!");
        }
        //dodajemy ucznia do listy uczniow, tworzymy asocjacje w pierwsza strone
        uczniowie.add(uczen);

        //informacja zwrotna, asocjacja MUSI byc stworzona w dwie strony
        uczen.setSzkola(this); //w miejsce slowa kluczowego this wchodzi obiekt na ktorym wywolujemy metode
    }

    public void wyswietlUczniow() {
        for (Uczen uczen : uczniowie) {
            System.out.println(uczen);
        }
    }

    //dodanie profilu
    public void dodajProfil(String profil) {
        profile.add(profil);
    }

    public void usunProfil(String profil) {
        profile.remove(profil);
    }

    public void wyswietlProfile() {
        for (String profil : profile){
            System.out.println(profil + " ");
        }
    }

    //atrybut wyliczalny, obliczany za pomoca metody
    public int obliczWiek() {
        return LocalDate.now().getYear() - rokWybudowania;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getRokWybudowania() {
        return rokWybudowania;
    }

    public void setRokWybudowania(int rokWybudowania) {
        this.rokWybudowania = rokWybudowania;
    }

    public List<String> getProfile() {
        return profile;
    }

    public void setProfile(List<String> profile) {
        this.profile = profile;
    }

    public String getWyroznienie() {
        return wyroznienie;
    }

    public void setWyroznienie(String wyroznienie) {
        this.wyroznienie = wyroznienie;
    }

    public int getNumer() {
        return numer;
    }

    public void setNumer(int numer) {
        for (Szkola szkola : ekstensja) {
            if (szkola.getNumer() == numer) {
                throw new IllegalArgumentException("Numer nie jest unikalny!");
            }
        }
        this.numer = numer;
    }

    public static int getMinLiczbaUczniow() {
        return minLiczbaUczniow;
    }

    public static void setMinLiczbaUczniow(int minLiczbaUczniow) {
        Szkola.minLiczbaUczniow = minLiczbaUczniow;
    }

    public static List<Szkola> getEkstensja() {
        return ekstensja;
    }

    public static void setEkstensja(List<Szkola> ekstensja) {
        Szkola.ekstensja = ekstensja;
    }

    @Override
    public String toString() {
        return nazwa + " " + numer;
    }
}
