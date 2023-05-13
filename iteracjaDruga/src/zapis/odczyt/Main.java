package zapis.odczyt;

import java.io.FileReader;
import java.io.*;
import java.util.Scanner;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //File pozwala przechowywac sciezke badz nazwe pliku
        File sciezka = new File("plik");

        //FileWriter pozwala zapisac cos do pliku
        FileWriter zapis = new FileWriter(sciezka);

        //metoda write() pozwala zapisac cos do pliku
        zapis.write("Ania\n");
        zapis.write("Tomek\n");
        zapis.write("65");
        zapis.close();

        //FileReader sluzy do odczytu znak po znaku
        FileReader fileReader = new FileReader(sciezka);

        //BufferedReader sluzy do odczytania wiersz po wierszu
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String linia;

        while ((linia = bufferedReader.readLine()) != null) {
            System.out.println(linia);
        }
        bufferedReader.close();

        // Zapisz do pliku kilka nazw zwierzat, odczytaj je i wypisz
        FileWriter zapisZwierzat = new FileWriter("Zwierzeta");
        zapisZwierzat.write("pies\n");
        zapisZwierzat.write("kot\n");
        zapisZwierzat.write("koń\n");
        zapisZwierzat.close();
        FileReader fileReader1 = new FileReader("Zwierzeta");

        BufferedReader bufferedReader1 = new BufferedReader(fileReader1);

        String linia1;
        while ((linia1 = bufferedReader1.readLine()) != null) {
            System.out.println(linia1);
        }
        bufferedReader1.close();

        // zad.1 Stworz plik z 10 liczbami, wczytaj je i przypisz do tablicy, wyswietl cala tablice
        System.out.println("zad 1");
        FileReader fileReader2 = new FileReader("dziesiecLiczb");

        BufferedReader bufferedReader2 = new BufferedReader(fileReader2);

        int[] tablica = new int[10];


        String linia2;
        int i = 0;
        while ((linia2 = bufferedReader2.readLine()) != null) {
            tablica[i] = Integer.parseInt(linia2);
            System.out.println(tablica[i]);
            i++;
        }

        bufferedReader2.close();

        String imie = "Agnieszka";
        System.out.println(imie.charAt(2));


        // zad.2 Stworz plik slownik z kilkunastoma wyrazami. Wsrod tych wyrazow wsadz kilka
//		// kurde, kurcze i kurka. Program ma za zadanie kazdy wyraz brzydki zastapic **** i zapisac
//		// całosc do nowego pliku ktory sie nazywa slownikPoprawiony
        System.out.println("zad 2");

        FileWriter zapis1 = new FileWriter("słownik");
        zapis1.write("drzewo\n");
        zapis1.write("góry\n");
        zapis1.write("kurde\n");
        zapis1.write("kurczak\n");
        zapis1.write("kurcze\n");
        zapis1.write("kurka\n");
        zapis1.write("wyrazy\n");
        zapis1.write("słowa\n");
        zapis1.close();

        FileWriter zapis2 = new FileWriter("słownikPoprawiony");

        FileReader fileReader3 = new FileReader("słownik");

        BufferedReader bufferedReader3 = new BufferedReader(fileReader3);

        String linia3;
        while ((linia3 = bufferedReader3.readLine()) != null) {
            if (linia3.equals("kurde") || linia3.equals("kurcze") || linia3.equals("kurka")) { //wrzuc do tabeli
                zapis2.write("****\n"); // linia3 = "****";
            } else {
                zapis2.write(linia3 + "\n");
            }
        }
        bufferedReader3.close();
        zapis2.close();
        System.out.println();
        // zad.3 Stwórzmy program ktory pozwala zapisac do pliku 3 imiona podane przez
        // uzytkownika. Nastepnie odczytajmy te imiona i
        // wyswietlmy najdluzsze z nich

        System.out.println("Zadanie 3");

        FileWriter imiona = new FileWriter("imiona");
        imiona.write("Aga\n");
        imiona.write("Michał\n");
        imiona.write("Maks\n");
        imiona.close();

        FileReader fileReader4 = new FileReader("imiona");

        BufferedReader bufferedReader4 = new BufferedReader(fileReader4);
        String linia4;
        String najdl = "";

        while ((linia4 = bufferedReader4.readLine()) != null) {
            if (linia4.length() > najdl.length()) {
                najdl = linia4;
            }
            System.out.println(linia4);
        }
        bufferedReader4.close();
        fileReader4.close();
        System.out.println("Najdłuższy wyraz to: " + najdl);


        //Scanner
        //zad. 4Uzytkownik wprowadza liczby. Na poczatku uzytkownik deklaruje ile liczb chce wprowadzic. Nastepnie
        // wprowadza
        //tyle liczb ile podac. Chcemy policzyc ich sume, element najmniejsz, najwiekszy oraz srednia arytmetyczna.
        System.out.println("zad 4");
        System.out.println("Scanner liczby");
        Scanner scanner1 = new Scanner(System.in);

        System.out.println("Ile liczb chcesz wprowadzić?");
        int n = scanner1.nextInt();
        int suma = 0;
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int[] ilosc = new int[n];

        for (int j = 0; j < ilosc.length; j++) {
            System.out.println("Wprowadź liczbę numer " + (j + 1));
            ilosc[j] = scanner1.nextInt();
            suma += ilosc[j];
            if (ilosc[j] < min) {
                min = ilosc[j];
            }
            if (ilosc[j] > max) {
                max = ilosc[j];
            }
        }
        double srednia = suma / n;
        System.out.println("Średnia wynosi: " + srednia);
        System.out.println("Suma wynosi: " + suma);
        System.out.println("Liczba maksymalna to: " + max);
        System.out.println("Liczba minimalna to: " + min);


        //zad.5 Symulacja wprowadzania hasla przez uzytkownika. Uzytkownik wprowadza hasło, tak dlugo az jest
        //niepoprawne, wyswietlamy napis ze haslo jst niepoparwne, wprowadz poprawne hasło.
        //Jesli uzytkownik wprowadzi poprawne haslo to wyswietlamy komunikat ze haslo jest poprawne.
        System.out.println("zad 5");
        System.out.println("Symulacja wprowadzania hasła: ");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ustaw swoje hasło");
        String ustaw = scanner.nextLine();

        System.out.println("Wprowadź hasło: ");
        String wprowadzenie = scanner.nextLine();

        while (!wprowadzenie.equals(ustaw)) {
            System.out.println("Błędnę hasło, wprowadź ponownie: ");
            wprowadzenie = scanner.nextLine();
        }

        System.out.println("Hasło poprawne");

        String haslo = "kurs";


        while (true) {
            System.out.println("Podaj haslo: ");
            if (haslo.equals(scanner.next())) {
                System.out.println("Wpisales poprawne haslo");
                break;
            } else {
                System.out.println("Haslo niepoprawne");
            }
        }
    }
}
