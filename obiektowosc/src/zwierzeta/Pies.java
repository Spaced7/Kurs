package zwierzeta;

import java.util.List;

public class Pies extends Animal {

    private int dlugoscSiersci;
    private List<String> ulubioneZabawki;

    private Trener trener;

    public Pies(String nazwaZwierzecia, String gatunek, int dlugoscSiersci, List<String> ulubioneZabawki) {
        super(nazwaZwierzecia, gatunek);
        this.dlugoscSiersci = dlugoscSiersci;
        this.ulubioneZabawki = ulubioneZabawki;
    }

    public void pokazZabawki() {
        for (String zabawka : ulubioneZabawki) {
            System.out.println(zabawka);
        }
    }
    public int getDlugoscSiersci() {
        return dlugoscSiersci;
    }

    public void setDlugoscSiersci(int dlugoscSiersci) {
        this.dlugoscSiersci = dlugoscSiersci;
    }

    public List<String> getUlubioneZabawki() {
        return ulubioneZabawki;
    }

    public void setUlubioneZabawki(List<String> ulubioneZabawki) {
        this.ulubioneZabawki = ulubioneZabawki;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }
}

