package przyklady.uml;

import java.time.LocalDate;

public class Ocena {

    private int wartosc;
    private LocalDate dataWystawienia;
    private final Uczen uczen;
    private final Sprawdzian sprawdzian;


    public Ocena(int wartosc, LocalDate dataWystawienia, Uczen uczen, Sprawdzian sprawdzian) {
        this.wartosc = wartosc;
        this.dataWystawienia = dataWystawienia;
        this.uczen = uczen;
        this.sprawdzian = sprawdzian;
    }

    public int getWartosc() {
        return wartosc;
    }

    public void setWartosc(int wartosc) {
        this.wartosc = wartosc;
    }

    public LocalDate getDataWystawienia() {
        return dataWystawienia;
    }

    public void setDataWystawienia(LocalDate dataWystawienia) {
        this.dataWystawienia = dataWystawienia;
    }

    public Uczen getUczen() {
        return uczen;
    }

    public Sprawdzian getSprawdzian() {
        return sprawdzian;
    }

    @Override
    public String toString() {
        return uczen + " dostał ocene " + wartosc + " ze sprawdzianu " + sprawdzian;
    }
}
