package listy;

import java.util.*;

public class Zadania {
    public static void main(String[] args) {

        List<String> imiona = new ArrayList<>(Arrays.asList("Aleksander", "Michał", "Ola", "Ola", "Marcin", "Tomek",
                "Mateusz", "Tomek"));
        List<String> imiona1 = new ArrayList<>(Arrays.asList("Ola", "Tomek", "Marcin", "Marek"));
        List<Integer> liczby = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10));

        System.out.println("Zad. 1");
        System.out.println(najdluzsze(imiona));

        System.out.println("Zad. 2");
        Boolean wynik = zadanie2(imiona, "Ola");
        System.out.println(wynik);

        System.out.println("Zad. 3");                          //?
        List<Integer> losoweLiczby = zadanie3();
        System.out.println(losoweLiczby);

        System.out.println("Zad. 4");
        List<Integer> zad4 = zadanie4(liczby, 2);
        System.out.println(zad4);

        System.out.println("Zad. 5");
        List<String> zad5 = zadanie5(imiona, 'a');
        System.out.println(zad5);

        System.out.println("Zad. 6");
        List<String> wspolne = zadanie6(imiona, imiona1);
        System.out.println(wspolne);
        // ?
        List<String> wspolne1 = zadanie66(imiona, imiona1);
        System.out.println(wspolne1);

        System.out.println("Zad. 7");
        List<Integer> zad7 = zadanie7(imiona, "Ola");
        System.out.println(zad7);

        System.out.println("Zad. 8");
        System.out.println(zadanie8(liczby));
        System.out.println(zadanie88(liczby));

        System.out.println("Zad. 9");
        System.out.println(zadanie9(liczby));

        System.out.println("Zad. 10");
        List<Integer> zad10 = zadanie10(liczby, 0);
        System.out.println(zad10);

        System.out.println("Zad. 11");
        zadanie11(imiona);

        System.out.println("Zad. 12");
        zadanie12(imiona, "Ola");

        System.out.println("Zad. 13");
        zadanie13(imiona);

        System.out.println("Zad. 14");
        zadanie14(imiona);

        System.out.println("Zad. 15");
        List<String> imiona3 = new ArrayList<>(Arrays.asList("Ania", "Krzys", "Tomek", "Kasia", "Jan"));
        List<Integer> liczby1 = new ArrayList<>(Arrays.asList(4, 2, 5, 8, 3));
        List<String> zad15 = zadanie15(imiona3, liczby1);
        System.out.println(zad15);
//        for (String element : zadanie15(imiona3,liczby1)){
//            System.out.println(element);
//        }
        System.out.println("Zad. 16");

        List<String[]> listaTablic = new ArrayList<>();
        String[] tablica1 = {"styczeń", "luty"};
        String[] tablica2 = {"marzec", "kwiecień"};
        listaTablic.add(tablica1);
        listaTablic.add(tablica2);
        System.out.println(zadanie16(listaTablic));
    }
    //zad.1 napisz metode ktora zwroci najdluzsze imie

    public static String najdluzsze(List<String> list) {
        String najd = "";
        for (String element : list) {
            if (element.length() > najd.length()) {
                najd = element;
            }
        }
        return najd;
    }

    //zad.2 napisz metode ktora sprawdzi czy podane imie jest w kolekcji

    public static boolean zadanie2(List<String> list, String imie) {
        return list.contains(imie);
    }

    //zad.3 Napisz metode ktora uzupelnia losowa iloscia (od 2-8) liczb losowych z
    //	// przedziaku 1-10,
    //	// wrzucmy te liczby do nowej listy posortujmy ja odwrotnie i zwracamy ta liste
    //	// 5 1 2 4
    //	// 4 2 1 5

    public static List<Integer> zadanie3() {
        Random random = new Random();
        int iloscLiczb = random.nextInt(7) + 2;
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < iloscLiczb; i++) {
            int liczba = random.nextInt(10) + 1;
            list.add(liczba);
        }
        Collections.sort(list, Collections.reverseOrder());
        return list;
    }

    // zad.4 Napisz metode ktora jako parametr przyjmuje liste intow oraz inta i zwraca liste intow ktore sa wieksze
    // niz podany jako parametr int

    public static List<Integer> zadanie4(List<Integer> list, int i) {
        List<Integer> wynik = new ArrayList<>();
        for (int liczba : list) {
            if (liczba > i) {
                wynik.add(liczba);
            }
        }
        return wynik;
    }

    // zad.5 Napisz metode ktora jako parametr przyjmuje Liste Stringow oraz znak. Zwroc
    // liste zawierajaca wszystkie
    // Stringi ktore zawieraja podana znak
    // Lista: Ania Kasia Grzegorz Tomek Magda a znak to a, to lista zwracana powinna
    // zawierac Ania Kasia Magda

    public static List<String> zadanie5(List<String> list, char znak) {
        List<String> wynik = new ArrayList<>();
        for (String element : list) {
            for (int i = 0; i < element.length(); i++) {
                if (element.toLowerCase().charAt(i) == znak && !wynik.contains(element)) {
                    wynik.add(element);
                }

            }
        }
        return wynik;
    }

    // zad. 6 Napisz metode ktora jako parametr przyjmuje 2 Listy Stringow i zwraca liste
    // elementów ktore sa na obu listach
    // lista 1 Ania Kasia Zosia Basia
    // lista 2 Tomek Kasia Roman Basia
    //Kasia Basia
    public static List<String> zadanie6(List<String> list1, List<String> list2) {
        List<String> wynik = new ArrayList<>();
        for (String imie : list1) {
            if (list2.contains(imie)) {
                wynik.add(imie);
            }
        }
        return wynik;
    }

    public static List<String> zadanie66(List<String> list1, List<String> list2) {
        Set<String> wynikListy1 = new HashSet<>(list1);
        Set<String> wynikListy2 = new HashSet<>(list2);

        wynikListy1.retainAll(wynikListy2);

        return new ArrayList<>(wynikListy1);
    }

    // zad.7 Napisz metode ktora przyjmuje liste Stringow i zwraca listę (intow) indeksow
    // wszystkich elementow na liscie, ktore sa takie same jak parametr metody
    // np dla Listy Ania Krzys Ania Piotr Tomek Ania i imienia Ania
    // output: to 0,2,5

    public static List<Integer> zadanie7(List<String> list, String szukane) {
        List<Integer> wynik = new ArrayList<>();
//        int i = 0;
//        for (String element : list) {
//            if (element.contains(szukane)) {
//                wynik.add(i);
//            }
//            i++;
//        }
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).contains(szukane)) {
                wynik.add(i);
            }
        }
        return wynik;
    }

    // zad. 8 Napisz metode ktora dla listy intów zwroci roznice pomiedzy jej najwiekszym a
    // najmniejszym elementem

    public static int zadanie8(List<Integer> list) {
        int max = list.get(0);
        int max2 = Integer.MAX_VALUE;
        int min = list.get(0);
        for (int element : list) {
            if (element > max) {
                max = element;
            }
            if (element < min) {
                min = element;
            }
        }
        return max - min;
    }

    public static int zadanie88(List<Integer> list) {
        int max = Collections.max(list);
        int min = Collections.min(list);
        return max - min;
    }

    // zad. 9 Napisz metode ktora odwraca kolejnosc liczb w liscie ktora jest podana jako parametr

    public static List<Integer> zadanie9(List<Integer> list) {
        List<Integer> wynik = new ArrayList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            wynik.add(list.get(i));
        }
        return wynik;
//        Collections.reverse(list); //petra for od i
//        return list;
    }

    // zad. 10 majac liste intow zwróc liste intow tych ktore te ktore koncza sie na cyfre
    // podana jako porametr
    public static List<Integer> zadanie10(List<Integer> list, int a) {
        List<Integer> wynik = new ArrayList<>();
        for (int element : list) {
            if (element % 10 == 0) {
                wynik.add(element);
            }
        }
        return wynik;
    }

    // zad.11 Wyswietl wszystkie imiona męskie które znajduja sie w liscie

    public static void zadanie11(List<String> list) {
        for (String element : list) {
            if (!element.endsWith("a")) {
                System.out.println(element + " ");
            }
        }
    }

    //zad. 12 Wyświetl ile razy ktorekolwiek imie zostało powtórzone Np dla imion ania piotr ania tomek krzys tomek
    // ania program
    // powinien wypisac 3, bo byly 3 potworki

    public static void zadanie12(List<String> list, String imie) {
        int licznik = 0;
        for (String element : list) {
            if (element.equalsIgnoreCase(imie)) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }

    //zad 13 Wyswietl ile razy było podane imie Tomek

    public static void zadanie13(List<String> list) {
        int licznik = 0;
        for (String imie : list) {
            if (imie.equalsIgnoreCase("Tomek")) {
                licznik++;
            }
        }
        System.out.println(licznik);
    }

    //zad.14 Napisz metodę która wyswietli unikalne imiona

//    public static void zadanie14(List<String> list) {
//        Set<String> unikalne = new LinkedHashSet<>(list);
//        System.out.println("Unikalne imiona: ");                             // ?
//        for (String imie : unikalne) {
//            System.out.println(imie + " ");
//        }
//    }
    public static List<String> zadanie14(List<String> list) {
       List<String> wynik = new ArrayList<>();
        System.out.println("Unikalne imiona: ");
        for (String element : list) {
            if (!wynik.contains(element)) {
                wynik.add(element);
            }
        }
        return wynik;
    }
    //analaogicznie jak wyzej, tylko zwroc liste i uzyj petli for each

    //zad. 15Napisz metode ktora przyjmuje jako parametr liste Stringow oraz liste intow (tej samej dlugosci obie listy)
    //Metoda ma zwrocic liste Stringow z pirwszej listy ktorych dlugosc odpowiada liczbom na 2 liscie
    // Ania Krzys Tomek Kasia Jan
    // 4 2 5 8 3
    //Ania Tomek Jan

    public static List<String> zadanie15(List<String> listaString, List<Integer> listaInt) {
        List<String> wynik = new ArrayList<>();
        for (int i = 0; i < listaString.size(); i++) {
            if (listaString.get(i).length() == listaInt.get(i)) {
                wynik.add(listaString.get(i));
            }
        }
        return wynik;
    }

    // zad.16 Napisz metode ktora przyjmuje jako parametr liste tablic Stringow i oblicza
    // sume dlugosci wszystkich Stringów

    public static int zadanie16(List<String[]> list) {
        int suma = 0;                                                                // ?
        for (String[] tablica : list) {
            for (String element : tablica) {
                suma += element.length();
            }
        }
        return suma;
    }
}
