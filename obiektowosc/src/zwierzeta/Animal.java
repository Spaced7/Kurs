package zwierzeta;

public abstract class Animal {

    private String nazwaZwierzecia;
    private String gatunek;

    public Animal(String nazwaZwierzecia, String gatunek) {
        this.nazwaZwierzecia = nazwaZwierzecia;
        this.gatunek = gatunek;
    }

    public String getNazwaZwierzecia() {
        return nazwaZwierzecia;
    }

    public void setNazwaZwierzecia(String nazwaZwierzecia) {
        this.nazwaZwierzecia = nazwaZwierzecia;
    }

    public String getGatunek() {
        return gatunek;
    }

    public void setGatunek(String gatunek) {
        this.gatunek = gatunek;
    }

    @Override
    public String toString() {
        return "Imie to " + nazwaZwierzecia + " rasy " + gatunek;
    }
}
