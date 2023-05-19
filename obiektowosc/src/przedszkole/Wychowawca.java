package przedszkole;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Wychowawca extends Person {

    private boolean czyMaKwalifikacja;
    private String rodzajKwalifikacji;
    private double pensja;

    private static List<Wychowawca> ekstensja = new ArrayList<>();

    private List<Grupa> grupy = new ArrayList<>();

    public Wychowawca(String imie, String nazwisko, LocalDate dataUrodzenia, boolean czyMaKwalifikacja, String rodzajKwalifikacji, double pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.czyMaKwalifikacja = czyMaKwalifikacja;
        setRodzajKwalifikacji(rodzajKwalifikacji);
        setPensja(pensja);

        ekstensja.add(this);
    }

    public Wychowawca(String imie, String nazwisko, LocalDate dataUrodzenia, boolean czyMaKwalifikacja, double pensja) {
        super(imie, nazwisko, dataUrodzenia);
        this.czyMaKwalifikacja = czyMaKwalifikacja;
        this.pensja = pensja;

        ekstensja.add(this);
    }


    public void dodajGrupe(Grupa grupa) {
        if (grupa.getWychowawca() != null) {
            throw new IllegalArgumentException("Grupa ma już przypisanego wychowawce!");
        }
        grupy.add(grupa);
        grupa.setWychowawca(this);
    }

    public static List<Wychowawca> wychowawcyZPensjaWiekszaNiz(List<Wychowawca> list, double parametr) {
        List<Wychowawca> wynik = new ArrayList<>();
        for (Wychowawca wychowawca : list) {
            if (wychowawca.isCzyMaKwalifikacja() && wychowawca.getPensja() > parametr) {
                wynik.add(wychowawca);
            }
        }
        return wynik;
    }

    public boolean isCzyMaKwalifikacja() {
        return czyMaKwalifikacja;
    }

    public void setCzyMaKwalifikacja(boolean czyMaKwalifikacja) {
        this.czyMaKwalifikacja = czyMaKwalifikacja;
    }

    public String getRodzajKwalifikacji() {
        return rodzajKwalifikacji;
    }

    public void setRodzajKwalifikacji(String rodzajKwalifikacji) {
        if (czyMaKwalifikacja == false) {
            throw new IllegalArgumentException("osobie bez kwalifikacji nie można ustawić rodzaju");
        }
        this.rodzajKwalifikacji = rodzajKwalifikacji;
    }

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        if (czyMaKwalifikacja) {
            pensja += 500;
        }
        this.pensja = pensja;
    }

    public static List<Wychowawca> getEkstensja() {
        return ekstensja;
    }

    public static void setEkstensja(List<Wychowawca> ekstensja) {
        Wychowawca.ekstensja = ekstensja;
    }

    @Override
    public String toString() {
        return getImie() + " " + getNazwisko() + " " + pensja;
    }
}
