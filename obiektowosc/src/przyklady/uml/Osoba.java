package przyklady.uml;

public abstract class Osoba {

    private String imie;
    private String nazwisko;
    private String adres;
    private String dataUrodzenia;

    public Osoba(String imie, String nazwisko, String adres, String dataUrodzenia) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.adres = adres;
        this.dataUrodzenia = dataUrodzenia;
    }

    //metoda abstrakcyjna, nie ma ciała, klasy, które dziedziczą po klasie z metodą abstrakcyjną MUSZA ja implementowac
    //polimorfizm metod. logika metody dopiero implementujemy w klasie która dziedziczy. nie ma ciała

    public abstract double obliczPrzychod();

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

    public String getDataUrodzenia() {
        return dataUrodzenia;
    }

    public void setDataUrodzenia(String dataUrodzenia) {
        this.dataUrodzenia = dataUrodzenia;
    }

    @Override
    public String toString() {
        return imie + " " + nazwisko;
    }
}
