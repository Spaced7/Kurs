package metody.tablice;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        int[] tablicaInt = {4, 7, 8, 3, 1, 88, 12};

        wyswietlTablice(tablicaInt);
        System.out.println();

        for (int liczba : zwrocTablice()) {
            System.out.print(liczba + " ");
        }
        System.out.println();

        System.out.println(policzSume(tablicaInt));

        for (int liczba : wieksze(tablicaInt)) {
            System.out.print(liczba + " ");
        }
        podzielne(tablicaInt);
        String[] tablica ={"styczen", "luty", "marzec"};
        System.out.println();
        System.out.println(suma(tablica));
        System.out.println("Zadanie 4");
        String[] poryRoku = {"Maj", "Czerwiec", "Lipiec", "Wrzesień"};
        System.out.println("zad.1");
        najdluzszy(poryRoku);
        System.out.println("zad.2");
        int[] zad2 = {2,3,4,5};
        for (int liczba : zadanie2(zad2)) {
            System.out.print(liczba + " ");
        }
        System.out.println();
        System.out.println("zad.3");

        int[] tablica3 = {2, 3, 4, 5, 6};

        for (int liczba : zadanie3(tablica3)) {
            System.out.print(liczba + " ");
        }

        System.out.println();
        System.out.println("zad.4");
        String[] zad4 = {"Ania", "Tomek", "Magda", "Krzys", "Ania"};
        zadanie4(zad4,'a');

        System.out.println();
        System.out.println("zad.5");
        int[] zad5 = {-12, -11, -10, 2, 3};
        System.out.println(zadanie5(zad5));

        System.out.println();
        System.out.println("zad.6");
        int[] szoste = {4,4,1};
        System.out.println(zadanie6(szoste));

        System.out.println();
        System.out.println("zad. 7");
        int[] teSame = {12, 32, 242, 1112};
        System.out.println(siedem(teSame));
    }

    public static void wyswietlTablice(int[] tablica) {

        //petla for each
        for (int liczba : tablica) {
            System.out.print(liczba + " ");
        }

    }

    public static int[] zwrocTablice() {
        int[] tablica = {4, 6, 2, 99};
        return tablica;
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intow a nastepnie
    // zwraca sume wszystkich liczb ktore sa umieszczone w tej tablicy.

    public static int policzSume(int[] tablica) {
        int suma = 0;
        for (int liczba : tablica) {
            suma += liczba;
        }
        return suma;
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intów, a nastepnie
    // zwraca tablice liczb liczb większych od 5

    public static int[] wieksze(int[] tablica) {
        int licznik = 0;
        for (int liczba : tablica) {
            if (liczba > 5) {
                licznik++;
            }
        }
        int[] tablica1 = new int[licznik];
        int i = 0;
        for (int liczba : tablica) {
            if (liczba > 5) {
                tablica1[i] = liczba;
                i++;
            }
        }
        return tablica1;
    }

    // Napisz metode ktora za swoj parametr przyjmuje tablice intow, a nastepnie
    // wypisuje wszystkie liczby podzielne przez 2 ktore sa wieksze niz 7

    public static void podzielne(int[] tablica) {

        for (int liczba : tablica) {
            if (liczba % 2 == 0 && liczba > 7) {
                System.out.println(liczba);
            }
        }

    }
    // Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
    // zwraca sume dlugosci tych stringów

    public static int suma(String[] tablica) {
        int suma = 0;
        for (String wyraz : tablica) {
            suma += wyraz.length();
        }
        return suma;
    }
    // zad.1 Napisz metode ktora za swoj parametr przyjmuje tablice stringow, a nastepnie
    // wypisuje najdluzszy ze stringow

    public static void najdluzszy(String[] tablica) {
        String najdluzszy = " ";
        for (String wyraz : tablica) {
            if (wyraz.length() > najdluzszy.length()) {
                najdluzszy = wyraz;
            }
        }
        System.out.println(najdluzszy);
    }

    /* zad. 2
     * Napisz metode ktora jako parametr przyjmuje tablice intow, a nastepnie zwraca
     * tablice intow ktora zawiera wartosci: dla liczb nieparzystych dodaje do nich
     * 3 dla liczb parzystych odejmuje od nich 1
     *
     * Przyklad: dla tablicy {2,3,4,5} nasza metoda powinna zwrocic tablice
     * {1,6,3,8}
     */

    public static int[] zadanie2 (int[] tablica) {
        int[] wynik = new int[tablica.length];
        int i = 0;
        for (int liczba : tablica) {
            if (liczba % 2 == 0) {
                wynik[i] = liczba - 1;
            } else {
                wynik[i] = liczba + 3;
            }
            i++;                                                            // ?
        }
        return wynik;

//        for (int i = 0; i < tablica.length; i++) {
//            if (tablica[i] % 2 == 0) {
//                tablica[i] -= 1;
//            } else {
//                tablica[i] += 3;
//            }
//        }
//        return tablica;
    }

    /* zad.3
     * Napisz metode, ktora jako parametr przyjmuje tablice intow i zwraca rowniez
     * tablice intow zmieniona w nastepujacy sposob: -liczby podzielne przez 3
     * zamienia na -1 -liczby niepodzielne przez 3 podnosi do kwadratu Dla tablicy =
     * {2,3,4,5,6} wynik to {4,-1,16,25,-1}
     */

    public static int[] zadanie3(int[] tablica) {
        int[] nowaTablica = new int[tablica.length];
        int i = 0;
        for (int liczba : tablica) {
            if (liczba % 3 == 0) {
                nowaTablica[i] -= 1;
            } else {
                nowaTablica[i] = liczba * liczba;
            }
            i++;
        }
        return nowaTablica;
    }

    // zad.4 napisz metode ktora przyjmuje jako parametr tablice Stringow oraz chara,
    // wypisuje te
    // slowa z tablicy ktore maja przynajmniej dwa podane chary
    // Ania Tomek Magda Krzys Ania i char a
    // output Ania Magda Ania
     public static void zadanie4(String[] tablica, char a) {
        for (String slowo : tablica) {
            int licznik = 0;
            slowo = slowo.toLowerCase();
            for (int i = 0; i < slowo.length(); i++) {
                if (slowo.charAt(i) == a) {
                    licznik++;
                }
            }
            if (licznik >= 2) {
                System.out.println(slowo);
            }
        }

     }

    // zad.5 dla podanej tablicy intów sprawdz czy liczba elementów ujemnych jest większa
    // od liczby elementow nieujemnych

    public static boolean zadanie5(int[] tablica) {
        int dodatnie = 0;
        int ujemne = 0;
        for (int liczba : tablica) {
            if (liczba >= 0) {
                dodatnie++;
            } else {
                ujemne++;
            }
        }
        return ujemne > dodatnie;
    }


    // zad.6 napisz metode ktora zwraca true tylko wtedy gdy kazdy element z tablcy to 1
    // lub 4
    public static boolean zadanie6(int[] tablica) {
        for (int liczba : tablica) {
            if (liczba != 1 && liczba != 4) {
                return false;
            }
        }
        return true;
    }

    //napisz metode ktora zwraca true jesli kazda liczba z tablicy podanej jako parametr konczy sie ta sama cyfra
    // 7 786847 37

    public static boolean siedem (int[] tablica) {
        int ostatnia = tablica[0] % 10;
        for (int liczba : tablica) {
            if (liczba % 10 != ostatnia) {
                return false;
            }
        }
        return true;
    }


}
