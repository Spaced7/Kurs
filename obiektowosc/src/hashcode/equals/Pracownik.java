package hashcode.equals;

import java.util.Objects;

public class Pracownik {

    private String imie;
    private String nazwisko;
    private double pensja;

    public Pracownik(String imie, String nazwisko, double pensja) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pensja = pensja;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Pracownik pracownik = (Pracownik) o;
        return Objects.equals(imie, pracownik.imie) && Objects.equals(nazwisko, pracownik.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(imie, nazwisko);
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

    public double getPensja() {
        return pensja;
    }

    public void setPensja(double pensja) {
        this.pensja = pensja;
    }
}
