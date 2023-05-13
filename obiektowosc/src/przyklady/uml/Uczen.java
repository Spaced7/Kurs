package przyklady.uml;

import java.util.ArrayList;
import java.util.List;

public class Uczen extends Osoba{

    private double stypendium;

    private List<Ocena> oceny = new ArrayList<>();
    // pole klasy Szkola dla asocjacji licznosci 1
    private Szkola szkola;

    public Uczen(String imie, String nazwisko, String adres, String dataUrodzenia, double stypendium) {
        super(imie, nazwisko, adres, dataUrodzenia);
        this.stypendium = stypendium;
    }

    public void dodajOcene(Ocena ocena) {
        oceny.add(ocena);
    }

    @Override
    public double obliczPrzychod() {
        return stypendium;
    }

    public double getStypendium() {
        return stypendium;
    }

    public void setStypendium(double stypendium) {
        this.stypendium = stypendium;
    }

    public Szkola getSzkola() {
        return szkola;
    }

    //setter dla asocjacji 1
    public void setSzkola(Szkola szkola) {
        this.szkola = szkola;
    }
}
