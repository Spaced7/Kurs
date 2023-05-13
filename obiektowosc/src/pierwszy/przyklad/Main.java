package pierwszy.przyklad;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        /*
         *
         * Klasa to naturalny opis obiektu. Zawiera zestaw cech (atrybuty) oraz funkcji (metody). Np Klasa Samochod
         * Obiekt to wystapienie (instancja) klasy. Czyli obiektem klasy Samochod jest ten konkretny samochod np BMW M5
         * Ekstensja to zbior wszystkich obiektow danej klasy
         *
         * */

        Samochod samochod1 = new Samochod("BMW", "M5", "zielony", 15000, 2021);
        Samochod samochod2 = new Samochod("Audi", "A7", "czarny", 1000, 2023);
        Samochod samochod3 = new Samochod("Bmw", "M3", "Czarny", 163600, 2002);
        System.out.println(samochod1);
        System.out.println(samochod1.getPrzebieg());
        samochod1.setPrzebieg(299999);
        System.out.println(samochod1.getPrzebieg());

        System.out.println(Samochod.getEkstensja());
        System.out.println(samochod1.zwrocWiek());

        System.out.println(Samochod.najstarszySamochod(Samochod.getEkstensja()));
        System.out.println(Samochod.najstarszySamochod(Samochod.getEkstensja()).zwrocWiek());
        System.out.println(Samochod.samochodyStarszeNiz10Lat(Samochod.getEkstensja()));

        Apartament apartament1 = new Apartament(0, 4, false, false);
        Apartament apartament2 = new Apartament(3, 3, true, true);
        Apartament apartament3 = new Apartament(2, 5, false, true);
        Apartament apartament4 = new Apartament(1, 4, true, true);


        //Stworz swoja klase - Apartament

        //znajdz apartamenty na danym pierze PIETRO
        System.out.println(Apartament.jakiePietro(Apartament.getEkstensja(), 3));
        System.out.println();
        //znajdz aparatament o najwiekszej liczbie pomieszczen
        System.out.println("Znajdz aparatament o najwiekszej liczbie pomieszczen: ");
        System.out.println(Apartament.NajwiekszyApartament(Apartament.getEkstensja()));
        System.out.println();
        //znajdz apartament ktory pozwala na zwierzeta z danego pietra
        System.out.println("znajdz apartament ktory pozwala na zwierzeta z danego pietra: ");
        System.out.println(Apartament.czyPozwalaNaZwierzeta(Apartament.getEkstensja(), 2));
        System.out.println();
        //wypisz wszystkie apartamenty z miejscem parkingowym dla apartamentow o parzystej liczbie pomieszcen
        System.out.println("Wypisz wszystkie apartamenty z miejscem parkingowym dla apartamentow o parzystej liczbie " +
                "pomieszcen: ");
        System.out.println(Apartament.zMiejscemParkingowymParzystePokoje(Apartament.getEkstensja()));
        System.out.println();
        //apartament z parkingiem i zwierzakiem
        System.out.println("parking zwierzęta");
        System.out.println(Apartament.zwierzakParking(Apartament.getEkstensja()));


    }
}
