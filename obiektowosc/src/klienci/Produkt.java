package klienci;

public class Produkt {

    private String nazwa;
    private int cena;
    private int rozmiarButa;

    private Klient klient;

    public Produkt(String nazwa, int cena, int rozmiarButa) {
        this.nazwa = nazwa;
        this.cena = cena;
        this.rozmiarButa = rozmiarButa;
    }

    public Produkt(String nazwa, int cena) {
        this.nazwa = nazwa;
        this.cena = cena;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public int getCena() {
        return cena;
    }

    public void setCena(int cena) {
        this.cena = cena;
    }

    public int getRozmiarButa() {
        return rozmiarButa;
    }

    public void setRozmiarButa(int rozmiarButa) {
        this.rozmiarButa = rozmiarButa;
    }

    public Klient getKlient() {
        return klient;
    }

    public void setKlient(Klient klient) {
        this.klient = klient;
    }

    @Override
    public String toString() {
        return nazwa + " " + cena;
    }
}
