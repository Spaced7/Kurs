package koszula;

public class Main {
    public static void main(String[] args) {

        Koszula koszula = new Koszula("Nike", "niebieski", RozmiarKoszuli.M);

        //name()
        System.out.println(koszula.getRozmiarKoszuli().name());

        //ordinal() indeks wartosci typu wyliczeniowego
        System.out.println(koszula.getRozmiarKoszuli().ordinal());

        //valueOf() zwraca wartosc typu wyliczeniowego
        System.out.println(RozmiarKoszuli.valueOf(koszula.getRozmiarKoszuli().name()).getDlugoscRekawa());

        //values()
        for (RozmiarKoszuli r : RozmiarKoszuli.values()) {
            System.out.println(r.name() + " " + r);
        }

    }
}
