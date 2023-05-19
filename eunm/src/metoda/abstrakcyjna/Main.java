package metoda.abstrakcyjna;

public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("MB", "C400");

        samochod.setPrzyspieszenie(Przyspieszenie.PRZYSPIESZ_SZYBKO);
        System.out.println(samochod.getPrzyspieszenie().przyspiesz());

        samochod.setPrzyspieszenie(Przyspieszenie.PRZYSPIESZ_WOLNO);
        System.out.println(samochod.getPrzyspieszenie().przyspiesz());



    }
}
