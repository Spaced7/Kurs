package listy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        List<String> imiona = new ArrayList<>();
        imiona.addAll(Arrays.asList("Aleksander", "Michał", "Ola", "Marcin", "Tomek", "Mateusz"));

        System.out.println("Zad. 2");
        boolean wynik = zadanie2(imiona,"Ola");
        System.out.println(wynik);



    }


    //zad.2 napisz metode ktora sprawdzi czy podane imie jest w kolekcji

    public static boolean zadanie2(List<String> list, String imie) {
        return list.contains(imie);
    }

}
