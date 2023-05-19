package przedszkole;

public class Sala {

    private String nazwa;
    private String kolorScian;

    public Sala(String nazwa, String kolorScian) {
        this.nazwa = nazwa;
        this.kolorScian = kolorScian;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public String getKolorScian() {
        return kolorScian;
    }

    public void setKolorScian(String kolorScian) {
        this.kolorScian = kolorScian;
    }

    @Override
    public String toString() {
        return nazwa;
    }
}
