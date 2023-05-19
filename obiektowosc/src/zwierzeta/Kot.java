package zwierzeta;

public class Kot extends Animal {

    private int stopienByciaMilymFutrzakiem;

    private Trener trener;

    public Kot(String nazwaZwierzecia, String gatunek, int stopienByciaMilymFutrzakiem) {
        super(nazwaZwierzecia, gatunek);
        setStopienByciaMilymFutrzakiem(stopienByciaMilymFutrzakiem);
    }

    public int getStopienByciaMilymFutrzakiem() {
        return stopienByciaMilymFutrzakiem;
    }

    public void setStopienByciaMilymFutrzakiem(int stopienByciaMilymFutrzakiem) {
        if (stopienByciaMilymFutrzakiem < 1 || stopienByciaMilymFutrzakiem > 10) {
            throw new IllegalArgumentException("Stopnie muszą być w zakresie od 1 do 10 !");
        }
        this.stopienByciaMilymFutrzakiem = stopienByciaMilymFutrzakiem;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }
}
