package metody;

import java.util.Arrays;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        String imie = "Joanna";

        System.out.println(imie.startsWith("Joa"));
        System.out.println(imie.endsWith("na"));

        //metoda substring(x,y) zwraca podstringa zaczynajac od indeksu x uwzgledniajac go do indeksu y
        // nieuwzgledniajac go
        System.out.println(imie.substring(1, 4));

        //jesli podamy jeden parametr to metoda zwraca podstringa od tego parametru do konca
        System.out.println(imie.substring(3));

        wyswietlTekst();
        System.out.println(zwrocTekst());
        String element = zwrocTekst();
        System.out.println(element);
        System.out.println(zwrocLiczbe(5));
        System.out.println(zwrocLiczbe(5, 5));
        System.out.println(zwroc("napis"));
        System.out.println(suma(4, 6));
        System.out.println(iloczyn(6, 9));
        System.out.println(dlugosc("marcin"));
        System.out.println(dluzszy("michal", "aga"));
        System.out.println(liczby(23, 23.3));
        System.out.println(parzsyta(7));
        System.out.println("zadanie 1");
        System.out.println(trzy(2, 3, 6));
        System.out.println("zadanie 2");
        System.out.println(zadanie2("asdy"));
        System.out.println("zadanie 3");
        System.out.println(zadanie3("xxbad"));
        System.out.println("zadanie 4");
        System.out.println(ilosc("Warszawa", 'a'));
        System.out.println("zadanie 5");
        System.out.println(jednosci(12));
        System.out.println("zadanie 6");
        int[] wynik = dzielniki(14);
        System.out.println(Arrays.toString(wynik));

        int[] wynik1 = podzielnePrzezX(10, 5);
        System.out.println(Arrays.toString(wynik1));
    }

    //metoda typu void - nic nie zwraca
    public static void wyswietlTekst() {
        System.out.println("Wyswietlam tekst");
    }

    //metoda ktora deklaruje typ zwracany, String, int  itp
    public static String zwrocTekst() {
        return "Hej";
    }

    public static int zwrocLiczbe(int a) {
        return a + 5;
    }

    //przeciazanie metod, tak samo nazywajace sie metody ale z inna liczba parametrow
    public static int zwrocLiczbe(int a, int b) {
        return a + b + 2;
    }

    // Napisz metode, ktora dodaje do Stringa podanego jako parametr napis "dzien dobry"
    public static String zwroc(String napis) {
        return napis + "dzien dobry";
    }

    // Stworz metode ktora liczy sume dwoch liczb ktore sa podane jako parametr

    public static double suma(double a, double b) {
        return a + b;
    }

    public static double iloczyn(double a, double b) {
        return a * b;
    }

    // Stwórz metode ktora zwraca dlugosc Stringa podanego jako parametr

    public static int dlugosc(String napis) {
        return napis.length();
    }

    // Stworz metode ktora zwraca dluszzy z dwoch podanych jako parametr Stringow

    public static String dluzszy(String napis1, String napis2) {
        return napis1.length() > napis2.length() ? napis1 : napis2;
//        if (napis1.length() > napis2.length()) {
//            return napis1;
//        } else {
//            return napis2;
//        }
    }

    // Stworz metode ktora zwraca wieksza z dwoch podanych liczb typu double jako parametr
    public static double liczby(double a, double b) {
        return a > b ? a : b;
    }

    // Napisz metode ktora przyjmuje jako argument liczbe i sprawdza czy jest to liczba parzysta

    public static boolean parzsyta(int a) {
        return a % 2 == 0;
    }

    // zad.1 Napisz metode ktora jako argument (parametr) przyjmuje
    // 3 zmienne typu int i liczy sume pierwszej i drugiej i mnozy przez trzecia

    public static int trzy(int a, int b, int c) {
        return (a + b) * c;
    }

    // zad.2 Napisz metode ktora przyjmuje jako parametr Stringa, jesli String zaczyna sie na z zwroc napis zzz, jesli
    // konczy sie na y zwroc napis yyy
    // jesli zaczyna sie na z i konczy na y zwroc zzyy, w kazdym innym przypadku zwroc stringa niezmienionego
    // metoda string.startsWith("xyz"); zwraca true jesli string zaczyna sie na xyz
    //metoda string.endsWith("xyz"); zwraca true jesli string konczy sie na xyz

    // zddy -> zzyy !
    // zasd -> zzz !
    // asdy -> yyy !
    // pusty string -> pusty string
    // z -> zzz !
    // y -> yyy !
    // zy -> zzyy !
    // a -> a
    // bb -> bb

    public static String zadanie2(String word) {
        if (word.startsWith("z") && word.endsWith("y")) {
            return "zzyy";
        } else if (word.startsWith("z")) {
            return "zzz";
        } else if (word.endsWith("y")) {
            return "yyy";
        } else {
            return word;
        }
    }

    // zad.3 Sprawdz czy podany String jako parametr zaczynajac od 0 lub 1 indeksu ma w sobie slowo bad
    //xbadxxx - true
    //badxxx - true
    //xxbadxx - false

    public static Boolean zadanie3(String word1) {
        return (word1.startsWith("b") || word1.substring(1).startsWith("b"));
    }

    // zad.4 Napisz metode ktora liczy ile razy podany znak wystepuje w podanym Stringu.

    public static int ilosc(String slowo, char znak) {
        int ilosc = 0;
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.toLowerCase().charAt(i) == znak) {
                ilosc++;
            }
        }
        return ilosc;
    }

    // zad.5 napisz metoda ktora sprawdza czy podana liczba dwucyfrowa ma wieksza cyfre
    // jednosci od cyfry dziesiatek
    // 93 % 10 ->  3
    // 93 / 10 ->  9

    public static boolean jednosci(int liczba) {
        if (liczba < 10 || liczba > 99) {
            System.out.println("Podana liczba nie jest dwucyfrowa");
        }
        int dzeisiatki = liczba / 10;
        int jednosci = liczba % 10;

        return jednosci > dzeisiatki;
        //return liczba % 10 > liczba / 10;
    }

    // zad. 6 Wypisz dzielniki liczby naturalnej podanej jako parametr

    public static int[] dzielniki(int liczba) {
        int[] dzielnik = new int[liczba];
        int j = 0;
        for (int i = 1; i <= liczba; i++) {
            if (liczba % i == 0) {
                dzielnik[j] = i;
                j++;
            }
        }
        int[] wynik = new int[j];
        for (int i = 0; i < j; i++) {
            wynik[i] = dzielnik[i];
        }
        return wynik;
    }

    public static int[] podzielnePrzezX(int n, int x) {
        int[] wynik1 = new int[n / x];
        int j = 0;
        for (int i = 1; i <= n; i++) {
            if (i % x == 0) {
                wynik1[j] = i;
                j++;
            }
        }
        return wynik1;
    }


}

// Napisz metodę o nazwie podzielnePrzezX, która przyjmuje jako
// parametry dwie wartości typu int: n i x. Metoda ta
// powinna zwrócić tablicę zawierającą liczby całkowite z przedziału
// d 1 do n, które są podzielne przez x.
