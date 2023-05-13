package klienci;

public class Main {
    public static void main(String[] args) {

        Klient klient = new Klient("Jan", "Nowak", 44);
        Produkt produkt = new Produkt("Buty", 400, 44);


        Klient klient1 = new Klient("Maciej", "Kowalski", 40);
        Produkt produkt1 = new Produkt("Laptop asus", 1500);
        Produkt produkt2 = new Produkt("TV sony", 2500);
        Produkt produkt3 = new Produkt("Dron DJI", 10000);

        Klient klient2 = new Klient("Anna", "Leciak", 38);
        Produkt produkt4 = new Produkt("Buty", 999, 39);

        Klient klient3 = new Klient("Michał", "Szpak", 40);
        Produkt produkt5 = new Produkt("Buty", 1999, 32);
        Produkt produkt6 = new Produkt("Iphone X", 3000);

        klient.dodajProdukt(produkt);
        klient.wyswietlProdukt();

        klient1.dodajProdukt(produkt1);
        klient1.dodajProdukt(produkt2);
        klient1.dodajProdukt(produkt3);
        klient1.wyswietlProdukt();

        klient2.dodajProdukt(produkt4);

        klient3.dodajProdukt(produkt5);
        klient3.dodajProdukt(produkt6);

        System.out.println("Klient który najwięcej wydał to: " + Klient.klientKtoryNajwiecejWydal(Klient.getEkstencja()));
        System.out.println("poprawiony: " + Klient.klientKtoryNajwiecejWydal(Klient.getEkstencja()));

        System.out.println("Klienci którzy kupili buty to: " + Klient.KlienciKupujacyButy(Klient.getEkstencja()));

        System.out.println("Klienci którzy kupili buty ale nie swój rozmiar: " + Klient.kupujacyNiewlasciowyRozmiar(Klient.getEkstencja()));

    }
}
/*
 * Klient kupuje produkty. Klient ma imie nazwisko i rozmiar buta. Pordukt ma nazwe, cene i jesli sa to buty to wymiar.
 *  Klient moze miec wiele produktow, produkt moze miec jednego klienta.
 *
 *  1) Napisz mrtode ktota znajduje klienta ktory wydal najwiecej.
 *
 *   2) napisz metode ktora zwroci liste klientow ktorzy kupili buty
 *
 *   3) napisz metode ktora zwroci liste klientow ktorzy kupili buty ale nie na swoj rozmiar
 */