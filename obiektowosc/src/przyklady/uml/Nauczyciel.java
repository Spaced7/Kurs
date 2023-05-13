package przyklady.uml;

import java.util.ArrayList;
import java.util.List;

public class Nauczyciel extends Osoba {

    private double pensja;
    private double premia;

    private List<Szkolenie> szkolenia = new ArrayList<>();

    public Nauczyciel(String imie, String nazwisko, String adres, String dataUrodzenia, double pensja, double premia) {
        // metoda super() pozwala skopiowac konstruktor z nadklasy
        super(imie, nazwisko, adres, dataUrodzenia);
        this.pensja = pensja;
        this.premia = premia;
    }

    @Override
    public double obliczPrzychod() {
        return pensja + premia;
    }

    public void dodajSzkolenie (Szkolenie szkolenie) {
        szkolenia.add(szkolenie);
        szkolenie.dodajNauczyciela(this);
    }

    public List<Szkolenie> getSzkolenia() {
        return szkolenia;
    }

    public void setSzkolenia(List<Szkolenie> szkolenia) {
        this.szkolenia = szkolenia;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }

    public double getPremia() {
        return premia;
    }

    public void setPremia(double premia) {
        this.premia = premia;
    }


}
