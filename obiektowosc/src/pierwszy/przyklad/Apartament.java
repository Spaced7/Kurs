package pierwszy.przyklad;

import java.util.ArrayList;
import java.util.List;

public class Apartament {

    private final int pietro;
    private int iloscPomieszczen;
    private boolean czyAkceptujeZwierzeta;
    private boolean czyMaParking;

    private static List<Apartament> ekstensja = new ArrayList<>();

    public Apartament(int pietro, int iloscPomieszczen, boolean czyAkceptujeZwierzeta, boolean czyMaParking) {
        this.pietro = pietro;
        this.iloscPomieszczen = iloscPomieszczen;
        this.czyAkceptujeZwierzeta = czyAkceptujeZwierzeta;
        this.czyMaParking = czyMaParking;

        ekstensja.add(this);
    }

    //znajdz apartamenty na danym pietrze PIETRO

    public static List<Apartament> jakiePietro(List<Apartament> list, int pietro) {
        List<Apartament> wynik = new ArrayList<>();
        for (Apartament element : list) {
            if (element.getPietro() == pietro) {
                wynik.add(element);
            }
        }
        return wynik;
    }

//znajdz aparatament o najwiekszej liczbie pomieszczen

    public static Apartament NajwiekszyApartament(List<Apartament> list) {
        Apartament najwiekszy = list.get(0);
        for (Apartament element : list) {
            if (najwiekszy.getIloscPomieszczen() < element.getIloscPomieszczen()) {
                najwiekszy = element;
            }
        }
        return najwiekszy;
    }

    //znajdz apartament ktory pozwala na zwierzeta z danego pietra
    public static Apartament czyPozwalaNaZwierzeta(List<Apartament> list, int pietro) {
        for (Apartament element : list) {
            if (element.getPietro() == pietro && element.czyAkceptujeZwierzeta) {
                return element;
            }
        }
        System.out.println("Nie znaleziono apartementu");
        return null;
    }

    //wypisz wszystkie apartamenty z miejscem parkingowym dla apartamentow o parzystej liczbie pomieszcen

    public static List<Apartament> zMiejscemParkingowymParzystePokoje(List<Apartament> list) {
        List<Apartament> wynik = new ArrayList<>();
        for (Apartament element : list) {
            if (element.getIloscPomieszczen() % 2 == 0 && element.czyMaParking) {
                wynik.add(element);
            }
        }
        if (wynik.isEmpty()) {
            System.out.println("Brak dostępności apartamentu");
        }
        return wynik;
    }

    // pozwalający na zwierzęta i parking

    public static List<Apartament> zwierzakParking(List<Apartament> list) {
        List<Apartament> wynik = new ArrayList<>();
        for (Apartament element : list) {
            if (element.czyMaParking && element.czyAkceptujeZwierzeta) {
                wynik.add(element);
            }
        }
        return wynik;
    }


    public int getPietro() {
        return pietro;
    }

    public int getIloscPomieszczen() {
        return iloscPomieszczen;
    }

    public void setIloscPomieszczen(int iloscPomieszczen) {
        this.iloscPomieszczen = iloscPomieszczen;
    }

    public boolean isCzyAkceptujeZwierzeta() {
        return czyAkceptujeZwierzeta;
    }

    public void setCzyAkceptujeZwierzeta(boolean czyAkceptujeZwierzeta) {
        this.czyAkceptujeZwierzeta = czyAkceptujeZwierzeta;
    }

    public boolean isCzyMaParking() {
        return czyMaParking;
    }

    public void setCzyMaParking(boolean czyMaParking) {
        this.czyMaParking = czyMaParking;
    }

    public static List<Apartament> getEkstensja() {
        return ekstensja;
    }

//    public String toString() {
//        return pietro + " " + czyMaParking;
//    }

    @Override
    public String toString() {
        return "Apartament{" +
                "pietro=" + pietro +
                ", iloscPomieszczen=" + iloscPomieszczen +
                ", czyAkceptujeZwierzeta=" + czyAkceptujeZwierzeta +
                ", czyMaParking=" + czyMaParking +
                '}';
    }
}


//Stworz swoja klase - Apartament done

//znajdz apartamenty na danym pierze PIETRO

//znajdz aparatament o najwiekszej liczbie pomieszczen

//znajdz apartament ktory pozwala na zwierzeta z danego pietra BULIN

//wypisz wszystkie apartamenty z miejscem parkingowym dla apartamentow o parzystej liczbie pomieszcen
// % 2 == 0
