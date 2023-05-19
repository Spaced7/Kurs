package koszula;

public class Koszula {

    private String producent;
    private String kolor;
    private RozmiarKoszuli rozmiarKoszuli;

    public Koszula(String producent, String kolor, RozmiarKoszuli rozmiarKoszuli) {
        this.producent = producent;
        this.kolor = kolor;
        this.rozmiarKoszuli = rozmiarKoszuli;
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

    public RozmiarKoszuli getRozmiarKoszuli() {
        return rozmiarKoszuli;
    }

    public void setRozmiarKoszuli(RozmiarKoszuli rozmiarKoszuli) {
        this.rozmiarKoszuli = rozmiarKoszuli;
    }

    @Override
    public String toString() {
        return producent + " " + rozmiarKoszuli;
    }
}
