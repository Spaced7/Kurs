package listy;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Listy to takie dynamiczne tablice, gdzie nie podajemy ich rozmiaru -> rozszrzaja sie wraz z dodawanymi
        // elementami

        //kolekcje niegeneryczne, nieparametryzowane - nie wymagamy aby dodawane elementy byly tego samego typu
        // UWAGA - BRADZO ZLA PRAKTYKA -> NIE STOSUJEMY!!!

        List listaNiegeneryczna = new ArrayList<>();

        listaNiegeneryczna.add("kot");
        listaNiegeneryczna.add(7);
        listaNiegeneryczna.add(true);

        System.out.println(listaNiegeneryczna);

        /*
        *
        * ArrayList
        *
        * - przechowuje elementy w dynamicznej tablicy
        * - dane zapisywane sa w pamieci komputera obok siebie
        * - operacja wyjecia jest szybsza niz LinkedList, ale usuniecia jest wolniejsza
        *
        * */

        List<String> imiona = new ArrayList<>();

        //metoda add() - metoda ktora dodaje cos do kolekcji
        imiona.add("Ania");
        imiona.add("Piotr");
        imiona.add("Jan");
        imiona.add("Ewa");

        System.out.println(imiona);

        //metoda addAll() - metoda ktora dodaje kolekcje do kolekcji
        //metoda asList z klasy Arrays - pozwala ad hocowo stowrzyc kolekcjie z elementow oddzielonych przecinkami
        imiona.addAll(Arrays.asList("Tomek", "Marcin", "Ania", "Mateusz"));

        System.out.println(imiona);

        //metoda size()
        System.out.println("Rozmiar listy: " + imiona.size());

        //metode get(i) - zwraca element o indeksie i
        System.out.println(imiona.get(1));

        //list.remove(Integer.valueOf(2)) wtedy usuniemy z listy Integerow faktycznie 2 a nie indeks 2

        // remove(i) usuwa element i
//        imiona.remove(2);
//        System.out.println(imiona);

//        imiona.removeAll(Arrays.asList("Ania", "Marcin"));
//        System.out.println(imiona);

        for (int i = 0; i < imiona.size(); i++) {
            System.out.print(imiona.get(i) + " ");
        }
        System.out.println();

        for (String imie : imiona) {
            System.out.print(imie + " ");
        }

        System.out.println();

        //contains(x) zwraca true jesli element x znajduje sie w kolekcji
        System.out.println(imiona.contains("Ewa"));
        System.out.println(imiona.contains("Dariusz"));

        //metoda clear() czysci cala liste
//        imiona.clear();
//        System.out.println(imiona);

        //isEmpty() zwraca true jesli kolekcja jest pusta
        System.out.println(imiona.isEmpty());

        //indexOf(i) i lastIndexOf(i) zwraca indeks pierwszego oraz ostatniego wystapienia elementu i
        // zwracaja -1 jesli elmentu nie ma w kolekcji
        System.out.println(imiona.indexOf("Ania"));
        System.out.println(imiona.lastIndexOf("Ania"));

        //metoda set(indeks, element) zastepuje element o podanym indeksie nowym elementem
        System.out.println(imiona.set(0, "Klaudia"));
        System.out.println(imiona);

        //sublist(i,j) zwraca podliste od indeksu i do indeksu j-1
        System.out.println(imiona.subList(1,4));

        //toString() tworzy Stringa z kolekcji
        String kolekcja = imiona.toString();
        System.out.println(kolekcja.length());

        //getClass() zwraca reprezentacje klasowa kolekcji
        System.out.println(imiona.getClass());

        //getSimpleName() zwraca typ kolekcji bez dodatkow
        System.out.println(imiona.getClass().getSimpleName());

        //toArray() tworzy tablice Objectow z elemntow kolekcji
        Object[] tab = imiona.toArray();

        for (Object element : tab) {
            System.out.print(element + " ");
        }
        System.out.println();

        //metoda equals() zwraca true jezeli dwie kolekcje sa takie same
        System.out.println(imiona.equals(imiona));

        /*
        *
        * LinkedList
        * - przechowuje wewnetrznie elementy opakowane w obiekty wskazujace na element poprzedni i nastepny
        * - dane w pamieci sa rozstrzelone
        * - patrz punkt 3 przy ArrayList
        *
        * */

        List<String> nazwiska = new LinkedList<>();
        nazwiska.add("Kowalski");
        nazwiska.add("Nowak");
        nazwiska.add("Mosakowski");

        System.out.println(nazwiska);

        // 1) Zadeklaruj ArrayListe intow, dodaj do niej 5 roznych liczb metoda add, wyswietl cala liste petla for each.

        List<Integer> liczby = new ArrayList<>();

        liczby.add(5);
        liczby.add(7);
        liczby.add(3);
        liczby.add(2);
        liczby.add(1);

        for (int liczby1 : liczby) {
            System.out.println(liczby1);
        }

        // Zadeklaruj Liste Stringow, dodaj do niej kolekcje 4 imion metoda addAll

        List<String> imiona1 = new ArrayList<>();

        imiona1.addAll(Arrays.asList("Michał", "Tomek", "Marek", "Ola"));
        System.out.println(imiona1);

        //Zadeklaruj Liste zmiennych typu double, dodaj do listy 5 liczb rzeczywiste i wypisz je w kolejnosci rosnacej

        List<Double> liczby2 = new ArrayList<>(Arrays.asList(2.5, 3.4, 1.2, 5.5));
        System.out.println(liczby2);
        Collections.sort(liczby2);
        System.out.println(liczby2);

        System.out.println(suma(liczby));

        System.out.println("Zad.1");
        List<String> zad1 = new ArrayList<>();
        zad1.addAll(Arrays.asList("Aleksadner", "Michał", "Olek", "Mateusz", "Tomek", "Marcin"));
        System.out.println(najdluzszy(zad1));
        System.out.println("zadanie>3");
        for (int liczba : zadanie(liczby)) {
            System.out.println(liczba);
        }
    }

    //Stworz metode ktora zwroci sume liczb z ArrayListy
    public static int suma(List<Integer> list) {
        int suma = 0;
        for (int liczba : list) {
            suma += liczba;
        }
        return suma;
    }

    //Stworz metode ktora zwroci liste elementow wiekszych od 3
    public static List<Integer> zadanie(List<Integer> list) {
        List<Integer> wynik = new ArrayList<>();

        for (int liczba : list) {
            if (liczba > 3){
               wynik.add(liczba);
            }
        }
        return wynik;
    }

    //zad.1 napisz metode ktora zwroci najdluzsze imie
    public static String najdluzszy(List<String> list) {
        String najd = "";
        for (String imie : list) {
            if (imie.length() > najd.length()) {
                najd = imie;
            }
        }
        return najd;
    }


    //zad.2 napisz metode ktora sprawdzi czy podane imie jest w kolekcji
    //done
    //zad.3 Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z
    //	// przedziaku 1-10,
    //	// wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste
    //	// 5 1 2 4
    //	// 4 2 1 5

    // zad.4 Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze
    // niz podany jako parametr int
    //done
    // zad.5 Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
    // liste zawierajaca wszystkie
    // Stringi ktore zawieraja podana znak
    // Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
    // zawierac Ania Kasia Magda
    //done
    // zad. 6 Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
    // elementów ktore sa na obu listach
    // lista 1 Ania Kasia Zosia Basia
    // lista 2 Tomek Kasia Roman Basia
    //Kasia Basia
    //done
    // zad.7 Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
    // wszystkich elementow na liscie, ktore sa takie same jak parametr metody
    // np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
    // output: to 0,2,5

    // zad. 8 Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
    // najmniejszym elementem

    // zad. 9 Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr
    //d
    // zad. 10 majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
    // podana jako porametr

    // zad.11 Wyswietl wszystkie imiona męskie które znajduja sie w liscie

    //zad. 12 Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania piotr ania tomek krzys tomek
    // ania program
    // powinien wypisac 3, bo byly 3 potworki

    //zad 13 Wyswietl ile razy było podane imie Tomek

    //zad.14 Napisz metodę która wyswietli unikalne imiona

    //zad. 15Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
    //Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
    // Ania Krzys Tomek Kasia Jan
    // 4 2 5 8 3
    //Ania Tomek Jan

    // zad.16 Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
    // sume dlugosci wszystkich Stringów
}
