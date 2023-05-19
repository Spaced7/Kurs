package koszulka;

public class Main {
    public static void main(String[] args) {

        Koszulka koszulka = new Koszulka("Nike", "zielony", RozmiarKoszulki.S);

        //switch case
        
        switch (koszulka.getRozmiarKoszulki()) {
            case S -> System.out.println("Koszulka w rozmiarze S");
            case L -> System.out.println("Koszulka w rozmiarze L");
        }

    }
}
