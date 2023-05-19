package zwierzeta;

public enum StopienZuzycia {
    NOWY("Nowy"),
    UZYWANY("Używany"),
    TRAGICZNY("Tragiczny");

    private String nazwa;

    StopienZuzycia(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
