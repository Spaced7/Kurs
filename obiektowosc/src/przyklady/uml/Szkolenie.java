package przyklady.uml;

import java.util.ArrayList;
import java.util.List;

public class Szkolenie {

    private String nazwa;

    private List<Nauczyciel> nauczyciele = new ArrayList<>();

    public Szkolenie(String nazwa) {
        this.nazwa = nazwa;
    }

    public List<Nauczyciel> getNauczyciele() {
        return nauczyciele;
    }

    public void setNauczyciele(List<Nauczyciel> nauczyciele) {
        this.nauczyciele = nauczyciele;
    }

    public void dodajNauczyciela (Nauczyciel nauczyciel) {
        nauczyciele.add(nauczyciel);
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
