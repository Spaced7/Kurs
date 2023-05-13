package przyklady.uml;

import java.util.ArrayList;
import java.util.List;

public class Sprawdzian {

    private String przedmiot;

    private List<Ocena> oceny = new ArrayList<>();

    public Sprawdzian(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    public void dodajOcene(Ocena ocena) {
        oceny.add(ocena);
    }

    public String getPrzedmiot() {
        return przedmiot;
    }

    public void setPrzedmiot(String przedmiot) {
        this.przedmiot = przedmiot;
    }

    @Override
    public String toString() {
        return przedmiot;
    }
}
