package instrukcja.warunkowa;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        //slowo kluczowe if(warunek){}

        int i = 3;

        if (i > 5) {
            System.out.println("Liczba jest wieksza od 5");
        } else if (i == 5) {
            System.out.println("Liczba jest rowna 5");
        } else {
            System.out.println("Liczba jest mniejsza od 5");
        }

        /* = przypisanie
         * == równa się true/false
         * != nie równa się true/false
         * && koniunkcje, logiczne i
         * || alternatywa, logiczne lub
         * % modulo, reszta z dzielenia
         * > wieksze
         * >= wieksze lub rowne*/

        int ocena = 3;

        //slowo kluczowe switch(zmienna)

        switch (ocena) {
            case 2 -> System.out.println("Nie zaliczyles");
            case 3 -> System.out.println("Ledwo zdałes");
            case 4 -> System.out.println("Dobrze zdałeś");
            default -> System.out.println("Ocena nie jest poprawna");
        }

        // Zrób intstrukcje switch case, dla wartosci String
        // niech bedzie to reprezentacja miesiecy i w zaleznosci od
        // podanego miesiaca podac porę roku

        Scanner scanner4 = new Scanner(System.in);

        System.out.println("Wprowadź miesiąc");

        String miesiac = scanner4.nextLine();

        switch (miesiac){
            case "styczen" -> System.out.println("Zima");
            case "luty" -> System.out.println("Zima");
            case "marzec" -> System.out.println("Wiosna");
            case "kwiecień" -> System.out.println("Wiosna");
            case "maj" -> System.out.println("Wiosna");
            case "czerwiec" -> System.out.println("Lato");
            case "lipiec" -> System.out.println("Lato");
            case "sierpień" -> System.out.println("Lato");
            case "wrzesień" -> System.out.println("Lato");
            case "październik" -> System.out.println("Jesień");
            case "listopad" -> System.out.println("Jesień");
            case "grudzień" -> System.out.println("Zima");
        }









        // Sprawdz czy podana liczba typu double jest dodatnia, czy jest rowna  0, czy jest ujemna
        Scanner scanner5 = new Scanner(System.in);
        System.out.println("Wprowadź liczbę typu double");
        double liczby2 = scanner5.nextDouble();


        if (liczby2 > 0) {
            System.out.println("dodatnia");
        } else if (liczby2 == 0) {
            System.out.println("równa 0");
        } else {
            System.out.println("ujemna");
        }

        // Zadeklaruj 2 zmienne typu int, wyswietl która z tych dwoch liczb jest
        // wieszka i o ile, np dla 4 i 1 chcemy wyswietlic: 4 jest wieksze od 1 o 3

        Scanner scanner6 = new Scanner(System.in);
        System.out.println("Wprowadź pierwszą liczbę");
        int pierwsza = scanner6.nextInt();

        System.out.println("Wprowadź druga liczbę");
        int druga = scanner6.nextInt();



        if (pierwsza > druga) {
            System.out.println("Liczba: " + pierwsza + " jest większa od " + druga + " o " + (pierwsza - druga));
        } else if (pierwsza < druga) {
            System.out.println("Liczba: " + druga + " jest większa od " + pierwsza + " o " + (druga - pierwsza));
        } else {
            System.out.println("Liczby są równe");
        }

        // Napisz program sprawdzajacy czy podana liczba jest parzysta

        System.out.println("Wpisz liczbę");

        Scanner scanner = new Scanner(System.in);

        int d = scanner.nextInt();

        if (d % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else {
            System.out.println("Liczba nie jest parzysta");
        }

        int e = 4;

        if (e % 2 == 0) {
            System.out.println("Liczba jest parzysta");
        } else  {
            System.out.println("Liczba jest nieparzysta");
        }

        System.out.println("Sprawdz czy srednia dwoch liczb typu double jest wieksza od 4"); // Sprawdz czy srednia dwoch liczb typu double jest wieksza od 4

        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Wprowadź 1 liczbę: ");

        double liczba1 = scanner1.nextDouble();

        System.out.println("Wprowadź 2 liczbę: ");

        double liczba2 = scanner1.nextDouble();

        double srednia = (liczba1 * liczba2) / 2;

        if (srednia > 4) {
            System.out.println("Średnia 2 liczb wynosi " + (liczba1 * liczba2) / 2 + " i jest większa od 4");
        } else if (srednia < 4) {
            System.out.println("Średnia 2 liczb wynosi " + (liczba1 * liczba2) / 2 + " i jest mniejsza od 4");
        } else {
            System.out.println("Średnia 2 liczb jest równa 4");
        }


        // Sprawdz czy suma 3 liczb jest podzielna przez 3

        Scanner scanner2 = new Scanner(System.in);

        System.out.println("Wprowadź pierwszą liczbę: ");

        double liczbaA = scanner2.nextInt();

        System.out.println("Wprowadź drugą liczbę: ");

        double liczbaB = scanner2.nextInt();

        System.out.println("Wprowadź trzecią liczbę: ");

        double liczbaC = scanner2.nextInt();

        double suma = liczbaA + liczbaB + liczbaC;

        if (suma % 3 == 0){
            System.out.println("Suma 3 cyfr jest podzielna przez 3");
        } else {
            System.out.println("Suma nie jest podzielna przez 3");
        }



        // Napisz program w którym deklarujesz 3 zmienne typu int (różne od siebie). Program ma wyświetlić je
        // posortowane rosnąco.


        Scanner scanner3 = new Scanner(System.in);

        System.out.println("Wprowadź 1 liczbę");
        int zmienna1 = scanner.nextInt();

        System.out.println("Wprowadź 2 liczbę");
        int zmienna2 = scanner.nextInt();

        System.out.println("Wprowadź 3 liczbę");
        int zmienna3 = scanner.nextInt();

        int[] zmienne = {zmienna1, zmienna2, zmienna3};

        Arrays.sort(zmienne);

        System.out.println("Liczby posortowane rosnąco: ");
        for (int zmienna4 : zmienne) {
            System.out.println(zmienna4);
        }



    }
}
