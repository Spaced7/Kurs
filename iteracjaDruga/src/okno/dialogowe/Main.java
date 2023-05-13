package okno.dialogowe;

import javax.swing.*;

/**
 * Created by Marcin
 */
public class Main {
    public static void main(String[] args) {

        //showMessageDialog() sluzy do pokazania jekiegos komunikatu
//        JOptionPane.showMessageDialog(null, "Witam co slychac?");

        //showInputDialog() sluzy do wprowadzenia danych
//        String imie = JOptionPane.showInputDialog("Podaj swoje imie");
//        System.out.println("Twoje imie to: " + imie);
                // pareseInt zmiana string na int(teskt na rgument a następnie zwraca mu wartość liczbową)
//        int liczba = Integer.parseInt(JOptionPane.showInputDialog("Podaj liczbe"));
//        System.out.println(liczba + 5);

        //showConfirmDialog() sluzy do wyboru jednej z 3 opcji
        // yes - 0
        // no - 1
        //cancel - 2
//        int wybor = JOptionPane.showConfirmDialog(null, "Co wybierasz?");
//        System.out.println(wybor);

        //1. Wprowadz za pomoca okienka dialogowego jakis napis. Jesli jego dlugosc jest wieksza niz 15, wyswietl
        //za pomoca okienka napis ze jest za dlugi tekst, a jesli nie to wyswietl ze jest ok.

//        String napis = JOptionPane.showInputDialog("Podaj napis");
//        if (napis.length() > 15){
//            JOptionPane.showMessageDialog(null,"Napis jest zbyt długi");
//        } else {
//            JOptionPane.showMessageDialog(null,"OK");
//        }

        //2. Za pomoca JOPtionPane wczytaj 5 liczby i wyswietl ta ktora jest najwieksza
//
//        int[] tablica = new int[5];
//        int max = Integer.MIN_VALUE;
//
//        for (int i = 0; i < tablica.length; i++) {
//            tablica[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Wprowadź liczbe: "));
//            if (tablica[i] > max){
//                max = tablica[i];
//            }
//        }
//        JOptionPane.showMessageDialog(null, "Największą liczbą jest: " + max);

        //3. Za pomoc JOptionpane (confrim dialog) zadaj pytanie uzytkownikowi o to czy chce zlozyc zamowienie.
        //W zaleznosci od zaznaczonej odpowiedzi wyswietl odpowiedni napis

//        int zamowienie = JOptionPane.showConfirmDialog(null, "Czy chcesz złożyć zamówienie?");
//
//        if (zamowienie == 0){
//            JOptionPane.showMessageDialog(null, "Złożono zamówienie");
//        } else if (zamowienie == 1) {
//            JOptionPane.showMessageDialog(null, "Anulowano zamówienie");
//        } else if (zamowienie == 2) {                                                 // kończyć zwykłym else
//            JOptionPane.showMessageDialog(null, "Wyjście");
//        }
//        System.out.println();
        //4.  Za pomoca JOPtionpane uzytkwonik podaje imiona. Dopoki nie poda tomek to moze
        // je wprowadzac dalej i wypisujemy je na konsoli
        // Gdy wpisze Tomek przerywamy wprowadzanie i podajemy komunikat w okienku
        // dialogowym ze wpisano brzydkie imie.


        String imie = "";



        while (!imie.equalsIgnoreCase("Tomek")){
            imie = JOptionPane.showInputDialog("Podaj swoje imię");
            System.out.println(imie);
            if (imie.equalsIgnoreCase("Tomek")){
                JOptionPane.showMessageDialog(null,"Wpisano brzydkie imię");
            }
        }

//        while


    }
}
