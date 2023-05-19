package koszula;

public enum RozmiarKoszuli {

    S(44,46,48), M(50,52,54), L(56,58,60), XL(62,64,66);

    private final int obwod;
    private final int dlugoscRekawa;
    private final int dlugosKoszuli;

    RozmiarKoszuli(int obwod, int dlugoscRekawa, int dlugosKoszuli) {
        this.obwod = obwod;
        this.dlugoscRekawa = dlugoscRekawa;
        this.dlugosKoszuli = dlugosKoszuli;
    }

    public int getObwod() {
        return obwod;
    }

    public int getDlugoscRekawa() {
        return dlugoscRekawa;
    }

    public int getDlugosKoszuli() {
        return dlugosKoszuli;
    }

    @Override
    public String toString() {
        return obwod + " " + dlugoscRekawa + " " + dlugosKoszuli;
    }
}
