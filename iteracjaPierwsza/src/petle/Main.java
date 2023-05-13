package petle;

import java.util.Scanner;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        int a = 5;
        System.out.println(a);

        //zwiekszenie o 2
        a = a + 2;
        System.out.println(a);

        //ladniejszy zapis tego co mamy wyzej
        a += 2;
        System.out.println(a);

        //zwiekszenie o jeden
        a++;
        System.out.println(a);

        //zmiejszenie o jeden
        a--;
        System.out.println(a);

        //slowo kluczowe for(deklaracja zmiennej iterujacej; warunek wejscia do petli; instrukcja co sie dzieje ze
        // zmienna iterujaca po kazdym obrocie petli)

        for (int i = 1; i <= 10; i++) {
            System.out.println("Witam");
        }
        System.out.println();

        int j = 1;

        //while(warunek)
        while(j <= 10){
            System.out.println("Czesc");

            j++;
        }

        // Stworz 2 petle for i while, niech wypisza jakis napis na konsoli 20 razy

        for (int i = 1; i <= 20; i++ ){
            System.out.println("Koniec");
        }

        int b = 1;

        while(b <= 20){
            System.out.println("hej");

            b++;
        }

        // Wypisz na konsoli liczby od 1 do 20

        for (int i = 1; i <= 20; i++) {
            System.out.println(i);
        }

        //Wypisz na konsoli liczby od 20 do 1

        for (int i = 20; i >= 1; i--){
            System.out.println(i);
        }

        // Za pomocą pętli while, wypisz liczby od 1 do 10, dla kazdej liczby powyzej 5
        // dodaj napis'duża liczba'

        int c = 1;
        while (c <= 10) {

            if (c > 5) {
                System.out.println("duża liczba " + c);
            } else {
                System.out.println(c);
            }
            c++;
        }

        //Napisz program liczacy sume liczb z zakresu od 1 do 100

        int suma = 0;

        for (int i = 1; i <= 100; i++){
            // to samo suma = suma + i;
            suma += i;
        }
        System.out.println(suma);


        //Wypisz wszystkie liczby parzyste z zakresu 1-30

        for (int i = 1; i <= 30 ; i++) {

            if (i % 2 == 0){
                System.out.println(i);
            }

        }


        System.out.println();
        // Napisz program który wyswietli liczby podzielne przez 3 z zakresu 14-38

        int d = 14;

        while (d <= 38) {

            if (d % 3 == 0) {
                System.out.println(d);
            }
            d++;


        }

        System.out.println();

        for (int i = 14; i <= 38; i++) {
            if (i % 3 == 0) {
                System.out.println(i);
            }
        }





        System.out.println();
        // Wypisz liczby od 40 do 3 w dół za pomoca petli while

        int e = 40;

        while (e >= 3) {
            System.out.println(e);
            e--;

        }



        // Napisz program, który wypisuje liczby od n do 50 gdzie n jest
        // wartoscia podana przez uzytkownika, które są nieparzyste.

        Scanner nieparzyste = new Scanner(System.in);

        System.out.println("Wpisz dowolną liczbę: ");

        int n = nieparzyste.nextInt();

        for (int i = n; i <= 50 ; i++) {
            if (i % 3 == 0){
                System.out.println(i);
            }
        }

        System.out.println();



        System.out.println("Wpisz liczbę");

        int g = nieparzyste.nextInt();

        int i = g;

        while (i <= 50){

            if (i % 3 == 0){
                System.out.println(i);
            }
            i++;
        }




        // Napisac program, ktory liczy pole kwadratu dla boku n, który
        // przyjmuje wartosci od 1 do 10, uzyc petli while
        //dla boku 1 pole wynosi 1cm^2,
        //dla boku 2 pole wynosi 4cm^2

        Scanner kwadrat = new Scanner(System.in);

        System.out.println("Podaj długość boku kwadratu: ");
        int bok = kwadrat.nextInt();

        int pole = 0;
        int m = 0;

        while (m < bok){
            pole = pole + bok;
            m++;
        }
        System.out.println("Dla boku " + m + " pole wynosi " + pole + " cm^2");

        System.out.println();

        Scanner kwadrat1 = new Scanner(System.in);

        int z;
        do {
            System.out.println("Podaj bok kwadratu(od 1 do 10): ");
             z = kwadrat1.nextInt();
        } while (z < 1 || z > 10);

        int pole1 = z * z;
        System.out.println("Pole kwadratu o boku " + z + " wynosi " + pole1);








        //  Napisz program, który wypisze sume liczb od liczby zadeklarowanej a,
        // do drugiej liczby zadeklarowaniej b.

        Scanner liczby = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę: ");
        int pierwsza = liczby.nextInt();
        System.out.println("Podaj drugą liczbę: ");
        int druga = liczby.nextInt();
        int suma1 = 0;
        for (int k = pierwsza; k <= druga; k++) {
            suma1 += k;
        }
        System.out.println("Suma liczb od " + pierwsza + " do " + druga + " wynosi " + suma1);

        //  Napisać program, który oblicza średnią arytmetyczną liczb
        // naturalnych od 5 do liczby podanej przez użytkownika. Wypisać obliczoną
        // średnią.

        System.out.println();

        Scanner arytmetyczne = new Scanner(System.in);

        System.out.println("Podaj ostatnią liczbę: ");

        int ostatnia = arytmetyczne.nextInt();

        int suma2 = 0;
        double iloscLiczb = 0;
        if (ostatnia >= 5) {
            for (int k = 5; k <= ostatnia; k++) {
                suma2 += k;
                iloscLiczb++;
            }
            double srednia = suma2 / iloscLiczb;

            System.out.println("Średnia arytmetyczna liczb naturalnych od 5 do " + ostatnia + " wynosi " + srednia);
        } else {
            System.out.println("Podana liczba musi być większa lub równa 5. ");
        }


// scanner.close() ?

        //  Napisz program drukujacy na ekranie prostokat z liter X. Wysokosc i
        // szerokosc wczytujemy z klawiatury.
        System.out.println();


//        Scanner prostokat = new Scanner(System.in);
//
//        System.out.println("Wprowadź wysokość");
//
//        int wysokosc = prostokat.nextInt();
//
//        System.out.println("Wprowadź szerokość");
//
//        int szerokosc = prostokat.nextInt();
//
//        for (int k = 1; k <= wysokosc; k++) {
//            for (int l = 1; l <= szerokosc; l++) {
//                if (k == 1 || k == wysokosc || l == 1 || l == szerokosc) {
//                    System.out.print("X");
//                } else {
//                    System.out.print(" ");
//                }
//
//            }
//            System.out.println();
//
//        }


        System.out.println();
    }
}
