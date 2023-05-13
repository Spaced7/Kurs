package domowa.dziedziczenie;

public class Main {
    public static void main(String[] args) {

        Samochod samochod = new Samochod("bmw", "m3",2002, "czarny",165000,"manual");

        System.out.println(samochod);
        System.out.println(samochod.getPrzebieg());

    }
}
