package zwierzeta;

import java.util.ArrayList;
import java.util.List;

public class Sprzet {

    private String nazwa;
    private StopienZuzycia stopienZuzycia;
    private int iloscNapraw;

    private Trener trener;

    public Sprzet(String nazwa, StopienZuzycia stopienZuzycia, int iloscNapraw) {
        this.nazwa = nazwa;
        this.stopienZuzycia = stopienZuzycia;
        this.iloscNapraw = iloscNapraw;
    }

    public void naprawSprzet() {
        if (this.stopienZuzycia == StopienZuzycia.NOWY) {
            System.out.println("Nie można naprawić nowego sprzętu.");
        } else if (this.stopienZuzycia == StopienZuzycia.TRAGICZNY) {
            this.stopienZuzycia = StopienZuzycia.UZYWANY;
            System.out.println("Sprzęt został naprawiony i oznaczony jako używany.");
        } else {
            System.out.println("Sprzęt nie wymaga naprawy.");
        }
    }

    public static List<Sprzet> znajdzCzestoNaprawiane(List<Sprzet> list) {
        List<Sprzet> wynik = new ArrayList<>();
        for (Sprzet sprzet : list) {
            if (sprzet.getIloscNapraw() >= 2) {
                wynik.add(sprzet);
            }
        }
        return wynik;
    }

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public StopienZuzycia getStopienZuzycia() {
        return stopienZuzycia;
    }

    public void setStopienZuzycia(StopienZuzycia stopienZuzycia) {
        this.stopienZuzycia = stopienZuzycia;
    }

    public Trener getTrener() {
        return trener;
    }

    public void setTrener(Trener trener) {
        this.trener = trener;
    }

    public int getIloscNapraw() {
        return iloscNapraw;
    }

    public void setIloscNapraw(int iloscNapraw) {
        this.iloscNapraw = iloscNapraw;
    }

    @Override
    public String toString() {
        return nazwa + " " + stopienZuzycia;
    }
}
