package tablice.dwuwymiarowe;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        /*
         *  2 3 5 1 0 6
         *  2 0 9 8 7 1
         *  2 3 4 9 7 7
         *  6 1 2 3 4 6
         *  0 1 2 8 3 5
         */

        //pierwsza wartosc to liczba wierszy, druga to liczba kolumn
        int[][] macierz = new int[5][6];

        //ilosc wierszy
        System.out.println("Ilosc wierszy: " + macierz.length);

        //ilosc kolumn
        System.out.println("Ilosc kolumn: " + macierz[0].length);

        //przypisanie do macierzy
        macierz[0][2] = 3;
        macierz[4][2] = 8;
        macierz[3][3] = 1;

        //wypisanie calej macierzy

        //petla zewnetrzna - iteruje po wierszach
        for (int i = 0; i < macierz.length; i++) {
            //petla wewnetrzna - iteruje po kolumach
            for (int j = 0; j < macierz[0].length; j++) {
                System.out.print(macierz[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        int[][] macierzDwa = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = 0; i < macierzDwa.length; i++) {
            for (int j = 0; j < macierzDwa[0].length; j++) {
                System.out.print(macierzDwa[i][j] + " ");
            }
            System.out.println();
        }

        //Zadeklaruj tablice dwuwymiarowa 4x6 typu String. Przypisz do niej kilka elementów,
        // wypisz jej liczbe wierszy i liczbę kolumn, wypisz jakis przykladowy wyraz
        // Wypisz cała macierz

        String[][] tablcia = new String[4][6];
        tablcia[2][5] = "A";
        tablcia[3][1] = "B;";
        tablcia[2][3] = "C";
        for (int i = 0; i < tablcia.length; i++) {
            for (int j = 0; j < tablcia[0].length ; j++) {
                System.out.print(tablcia[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Liczba wierszy to " + tablcia.length);
        System.out.println("Liczba kolumn to " + tablcia[0].length);

        //Zadeklaruj macierz 6x6 i wypełnij ja liczbami od 10 w gore
        //policzyc sume wszystkich elementow w macierzy

        int[][] macierz1 = new int[6][6];
        int liczba = 10;
        int suma = 0;
        for (int i = 0; i < macierz1.length; i++) {
            for (int j = 0; j < macierz1[0].length; j++) {
                macierz1[i][j] = liczba;
                liczba++;
                suma += macierz1[i][j];
                System.out.print(macierz1[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println("Suma liczb wynosi: " + suma);

        //wypisac powyzsza macierz w odwrotnej kolejnosci
        // do wypisania macierz1
        int[][] macierz2 = new int[6][6];
        int liczba1 = 45;
        for (int i = 0; i < macierz2.length ; i++) {
            for (int j = 0; j < macierz2[0].length; j++) {
                macierz2[i][j] = liczba1;
                liczba1--;
                System.out.print(macierz2[i][j] + " ");
            }
            System.out.println();
        }

        // Zadanie 1 - Napisz program, który utworzy tablice dwuwymiarowa 5x5, uzupelni
        // ja liczbami naturalnymi od liczby podanej przez uzytkownika (jako zmienna) w
        // dół
        // i liczy sumę wszystkich wprowadzonych liczb.
        System.out.println();

        int[][] tablica = new int[5][5];
        int start = 77;
        int suma1 = 0;
        for (int i = 0; i < tablica.length; i++) {
            for (int j = 0; j < tablica[0].length; j++) {
                tablica[i][j] = start;
                start--;
                suma1 += tablica[i][j];
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Suma wprowadzonych liczb wynosi: " + suma1);



        // Zadanie 2 - Npisz program, który tworzy tablicę dwuwymiarową 5x5, uzupełnia
        // ją kolejnymi liczbami naturalnymi zaczynając od 10, wypisz przkątną takiej
        // macierzy idącą
        // od lewej do prawej, od góry do dołu.
        System.out.println("zadanie 2");

        System.out.println();
        int[][] tablica2 = new int[5][5];
        int start1 = 10;

        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[0].length; j++) {
                tablica2[i][j] = start1;
                start1++;
                System.out.print(tablica2[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Liczby po przekątnej to: ");
        for (int i = 0; i < tablica2.length; i++) {
            for (int j = 0; j < tablica2[0].length; j++) {
                if (i == j) {
                    System.out.print(tablica2[i][j] + "    ");
                } else if (i > j) {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }

        // Zadanie 3 - Napisz program, który tworzy tablice dwuwymiarowa 8x8 i uzupelnia
        // ja liczbami podzielnymi przez 3 zaczynajac od 10. Wypisz cala macierz.
        // Nastepnie wypisz macierz w ten sposob, ze liczby, ktore sa podzielne przez 4
        // wypisujemy, a jesli nie to wstawiamy w ich miejsce -1.

        System.out.println();
        System.out.println();
//        int[][] tablica3 = new int[8][8];
//        int start2 = 10;
//
//        for (int i = 0; i < tablica3.length; i++) {
//            for (int j = 0; j < tablica3[0].length; j++) {
//                tablica3[i][j] = start2;
//                start2 += 3;
//                if (tablica3[i][j] % 4 == 0) {
//                    tablica3[i][j] = -1;
//                }
//                System.out.print(tablica3[i][j] + " ");
//            }
//            System.out.println();
//        }
        int[][] tablica3 = new int[8][8];
        int start2 = 10;

        for (int i = 0; i < tablica3.length; i++) {
            for (int j = 0; j < tablica3[0].length; j++) {
                if (start2 % 4 == 0){
                    tablica3[i][j] = -1;
                } else {
                    tablica3[i][j] = start2;
                }
                start2 +=3;
                System.out.print(tablica3[i][j] + " ");
            }
            System.out.println();
        }


    }
}
