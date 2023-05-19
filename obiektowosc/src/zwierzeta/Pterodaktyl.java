package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Pterodaktyl extends Animal {

    private int rozpietoscSkrzydel;

    private static List<Pterodaktyl> ekstensja = new ArrayList<>();

    private Trener trener;

    public Pterodaktyl(String nazwaZwierzecia, String gatunek, int rozpietoscSkrzydel) {
        super(nazwaZwierzecia, gatunek);
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;

        ekstensja.add(this);
    }
    public static List<Pterodaktyl> znajdzNietrenowane(List<Pterodaktyl> list) {
        List<Pterodaktyl> wynik = new ArrayList<>();
        for (Pterodaktyl pterodaktyl : list) {
            if (pterodaktyl.getTrener() == null) {
                wynik.add(pterodaktyl);
            }
        }
        return wynik;
    }
    public int getRozpietoscSkrzydel() {
        return rozpietoscSkrzydel;
    }

    public void setRozpietoscSkrzydel(int rozpietoscSkrzydel) {
        this.rozpietoscSkrzydel = rozpietoscSkrzydel;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public static List<Pterodaktyl> getEkstensja() {
        return ekstensja;
    }

    public void setEkstensja(List<Pterodaktyl> ekstensja) {
        this.ekstensja = ekstensja;
    }
}
