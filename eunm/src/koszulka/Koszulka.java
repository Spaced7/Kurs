package koszulka;

public class Koszulka {

    private String producent;
    private String kolor;
    private RozmiarKoszulki rozmiarKoszulki;

    public Koszulka(String producent, String kolor, RozmiarKoszulki rozmiarKoszulki) {
        this.producent = producent;
        this.kolor = kolor;
        this.rozmiarKoszulki = rozmiarKoszulki;
    }

    public String getProducent() {
        return producent;
    }

    public void setProducent(String producent) {
        this.producent = producent;
    }

    public String getKolor() {
        return kolor;
    }

    public void setKolor(String kolor) {
        this.kolor = kolor;
    }

    public RozmiarKoszulki getRozmiarKoszulki() {
        return rozmiarKoszulki;
    }

    public void setRozmiarKoszulki(RozmiarKoszulki rozmiarKoszulki) {
        this.rozmiarKoszulki = rozmiarKoszulki;
    }

    @Override
    public String toString() {
        return producent + " " + rozmiarKoszulki;
    }

}
