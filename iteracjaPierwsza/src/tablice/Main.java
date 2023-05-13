package tablice;



/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        //typTablicy[] nazwaTablicy = slowo kluczowe new typTablicy[rozmiar]
        String[] dniTygodnia = new String[7];

        //WAZNE tablice indeksujemy od 0

        //dodanie elementu do tablicy
        dniTygodnia[0] = "Poniedzialek";
        dniTygodnia[1] = "Wtorek";
        dniTygodnia[2] = "Sroda";
        dniTygodnia[3] = "Czwartek";

        //wypisanie elementu tablicy
        System.out.println(dniTygodnia[2]);

        System.out.println(dniTygodnia[5]);

        //odniesienie do nieistniejacego indeksu
        //System.out.println(dniTygodnia[9]);

        //druga opcja zadeklarowania tablicy
        String[] miesiace = {"Styczen", "Luty", "Marzec"};

        //wypisanie calej tablicy
        //tak nie wypiszemy tablicy (jedynie adres obiektu w pamieci komputera)
        System.out.println(dniTygodnia);

        //zeby wypisac cala tablice musimy uzyc petli
        for (int i = 0; i < miesiace.length; i++) {
            System.out.println(miesiace[i]);
        }
        System.out.println();

        for (int i = 0; i < dniTygodnia.length; i++) {
            System.out.println(dniTygodnia[i]);
        }

        System.out.println();
        //Zadeklaruj tablice intów dwoma sposobami, przypisz do nich wartosci, wypisz ich dlugosc i niektore elementy
        int[] liczby = new int[4];

        liczby[0] = 1;
        liczby[1] = 2;
        liczby[2] = 3;
        liczby[3] = 4;
        System.out.println("Rozmiar: " + liczby.length);

        int[] liczby1 = {3, 4, 1, 5, 11, 9, 6, 7};
        System.out.println("Rozmiar: " + liczby1.length);

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }
        System.out.println();

        // wyswietl tylko liczby wieksze niz 4
        // policz sume elementów tablicy

        int suma = 0;

        for (int i = 0; i < liczby1.length ; i++) {
            if (liczby1[i] > 4 ){
                System.out.println(liczby1[i]);
            }
            suma += liczby1[i];
        }
        System.out.println(suma);

        // znajdz element najwiekszy
        // znajdz element najmniejszy

        int min = liczby1[0];
        int max = liczby1[0];

        for (int i = 0; i < liczby1.length; i++) {
            if (min > liczby1[i]){
                min = liczby1[i];
            }
            if (max < liczby1[i]){
                max = liczby1[i];
            }

        }
        System.out.println("Min wynosi: " + min + ", Max wynosi: " + max);

        //zadeklaruj tablicę dlugoisc 20 i przypisz do niej liczby od 1 do 20

        int[] tablica = new int[20];
        for (int i = 0; i < tablica.length; i++) {
                                                                        // tablica[i] += i + 1; ??
            System.out.println(tablica[i]+i+1);

        }

        System.out.println();
        //wypiszmy te tablice odwrotnie, czyli od 20 do 1

        for (int i = 19; i >= 0; i--) {
            tablica[i] += i + 1;
            System.out.println(tablica[i]);
        }

        //Zadeklaruj tablice intow dlugosci 5 i wypelnij ja dowolnymi liczbami. Wyswietl cala tablice w petli for lub while.
        System.out.println();
        int[] tablica1 = {-2, 5, -10, 44, 30};

        for (int i = 0; i < tablica1.length; i++) {
            System.out.println(tablica1[i]);
        }
        System.out.println();
        int j = 0;
        while (j < tablica1.length) {
            System.out.println(tablica1[j]);
            j++;
        }

        System.out.println();

        //Zadelkaruj tablice Stringow dlugosci 4, dodaj do niej 4 wyrazy. W petli przypisz kazdy wyraz do wczesniej utworzonej zmiennej typu string.
        //Wyswietl ta zmienna.

        String[] tablica2 = new String[4];

        tablica2[0] = "Bmw";
        tablica2[1] = "Honda";
        tablica2[2] = "Mercedes";
        tablica2[3] = "Audi";

        for (int i = 0; i < tablica2.length; i++) {
            System.out.println(tablica2[i]);
        }


        System.out.println();


        String[] tablica3 = new String[4];

        tablica3[0] = "pies";
        tablica3[1] = "kot";
        tablica3[2] = "mysz";
        tablica3[3] = "ptak";

        String wyraz = "";

        for(int i=0; i<tablica3.length; i++){
            wyraz = tablica3[i];
            System.out.println(wyraz);
        }

        /*Zad. 6 -Zadeklaruj dwie tablice intow roznej dlugosci. Przypisz obu na indeksie 0 jakas liczbe. Wyswietl te tablice która jest dluzsza (oczywiscie zmiana dlugosci
         *danej tablicy powinna wplywac na wypisanie tablic
         *
         */
        System.out.println();

        int[] tablica4 = new int[3];
        tablica4[0] = 1;
        int[] tablica5 = new int[5];
        tablica5[0] = 3;

        int[] najdluzsza;
        if (tablica4.length > tablica5.length) {
            najdluzsza = tablica4;
        } else {
            najdluzsza = tablica5;
        }
        for (int i = 0; i < najdluzsza.length; i++) {
            System.out.println(najdluzsza[i]);
        }
        System.out.println();

        // Napisz program, ktory dla danej tablicy intow dlugosci 3, wyswietli tablice 2 razy dluzsza. Wypelniona wartoscia 0, poza ostatnim elementem.
        // ostatni element tablicy ma miec wartosc odpowiadajaca dlugosci tablicy.

        int[] tablcia6 = {1, 2, 3};
        int dlugosc = tablcia6.length * 2;
        int[] nowatablica = new int[dlugosc];
        nowatablica[dlugosc-1] = dlugosc;
        for (int i = 0; i < nowatablica.length; i++) {
            System.out.println(nowatablica[i]);
        }

        // Dla podanej tablicy intow oblicz czy wiecej jest elementow dodatnich czy podzielnych przez 3

        int[] tablicaInt = {2, 6, 9, -4, 11, 12, 19};
        int dodatnie = 0;
        int podzielne = 0;

        for (int i = 0; i < tablicaInt.length; i++) {
            if (tablicaInt[i] > 0){
                dodatnie++;
            }
            if (tablicaInt[i] % 3 == 0){
                podzielne++;
            }
        }
        if (dodatnie > podzielne){
            System.out.println(dodatnie + " jest więcek");
        } else {
            System.out.println(podzielne + " jest więcej");
        }
        System.out.println();

        // Zad. 2 - Z podanej tablicy Stringow, wypisz te których dlugosc jest wieksza niz 7

        String[] zadanie2 = {"Styczeń", "luty", "marzec", "kwiecień", "maj", "paźdzniernik"};
        for (int i = 0; i < zadanie2.length; i++) {
            if (zadanie2[i].length() > 7) {
                System.out.println(zadanie2[i]);
            }
        }
        System.out.println();
        for (String wieksze : zadanie2) {
            if (wieksze.length() > 7) {
                System.out.println(wieksze);
            }
        }

        // Zad. 3 - Oblicz iloczyn liczb podanych w tablicy intow.
        System.out.println();
        int[] zadanie3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int iloczyn = 1;
        for (int i = 0; i < zadanie3.length; i++) {
            iloczyn *= zadanie3[i];
        }
        System.out.println("Iloczyn podanych liczb wynosi: " + iloczyn);

        // Zad. 4 - Dla podanej tablicy Stringow, wypisz te, ktore koncza sie na litere 'a', (metoda charAt() lub endsWith() - google)

        String[] zadanie4 = {"Michał", "Marcin", "Ania", "Kasia", "Ala", "Paweł", "Aleksandra"};

        System.out.print("słowa kończące się na a: ");

        for (String slowo : zadanie4) {
            if (slowo.endsWith("a")) {
                System.out.print(slowo + ", ");
            }
        }
        System.out.println();
        System.out.println();

        for (int i = 0; i < zadanie4.length; i++) {
            if (zadanie4[i].endsWith("a")) {
                System.out.print(zadanie4[i] + ", ");

            }
        }
        System.out.println();
        //wypisanie 3 litery z tablicy
        for (int i = 0; i < zadanie4.length; i++) {
            System.out.print(zadanie4[i].charAt(2) + ", ");
        }

//        System.out.println();
//        for (int i = 0; i < zadanie4.length; i++) {
//            char litera = zadanie4[i].charAt(2);
//            System.out.println(zadanie4[i] + litera);
//        }

    }
}
