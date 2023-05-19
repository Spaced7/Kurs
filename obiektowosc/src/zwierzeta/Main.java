package zwierzeta;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Pies pies = new Pies("Atos", "Wyżeł Niemiecki", 2, new ArrayList<>(Arrays.asList("piłka", "frisbee")));
        Pies pies1 = new Pies("Max", "Spaniel", 15, new ArrayList<>(Arrays.asList("gryzak")));

        Kot kot = new Kot("Pan kot", "Dachowiec", 2);
        Kot kot1 = new Kot("Garfild", "perski", 9);

        Pterodaktyl pterodaktyl = new Pterodaktyl("Bolo", "pterodaktyl gołębi", 200);
        Pterodaktyl pterodaktyl1 = new Pterodaktyl("Rafał", "pterodaktyl dachowiec", 250);
        Pterodaktyl pterodaktyl2 = new Pterodaktyl("Ptero", "dachowiec", 300);
        Trener trener = new Trener("Adam", "Kowalski", "Koszalin ul.Kwiatowa 5");
        Trener trener1 = new Trener("Maciej", "Nowak", "Gdynia ul. Zwyciestwa 97");

        trener.dodajKota(kot);
        trener1.dodajPterodaktyla(pterodaktyl);
        trener1.dodajPterodaktyla(pterodaktyl1);
        trener1.dodajPsa(pies1);
        System.out.println("trener1 wytrenował " + trener1.liczbaTrenowanychZwierzat() + " zwierząt");
        System.out.println("Najwięcej zwierząt wytrenował " + Trener.ktoTrenowalNajwiecejZwierzat(Trener.getEkstensja()));

        System.out.println("Trenerzy trenujący spaniele: " + Trener.ktoTrenowalSpaniele(Trener.getEkstensja()));
        System.out.println("Lista nietrenowanych pterodaktyli " + Pterodaktyl.znajdzNietrenowane(Pterodaktyl.getEkstensja()));

        System.out.println(kot + " " + kot.getStopienByciaMilymFutrzakiem());
        Sprzet sprzet = new Sprzet("smycz", StopienZuzycia.NOWY,5);
        Sprzet sprzet1 = new Sprzet("obroża", StopienZuzycia.TRAGICZNY,1);


        System.out.println("Naprawiamy sprzęt: " + sprzet1.getStopienZuzycia());
        sprzet1.naprawSprzet();

        pies1.pokazZabawki();

    }
}
/*
		 *  W systemie przechowujemy informacje o zwierzetach (nazwa, gatunek). Dla psów przechowujemy dodatkowe ich dlugosc siersci
			oraz ulubione zabawki ,dla kotów stopien bycia milym futrzakiem (1-10) oraz dla pterodaktylow rozpietosc skrzydel.

			Trenerzy (imie, nazwisko, adres) trenuja zwierzeta. Kazdy trener trenuje wiele zwierzat, ale zwierze jest pod okiem jednego trenera.

			Trener uzywa Sprzetu (nazwa, stopien zuzycia(nowe, uzywane, tragiczne)), sprzet moze byc naprawiany.
			* (nowy nie moze byc naprawiony, tragiczny --> uzywany) DONE
			 Chcemy przechowywac informacje o tym jaki trener uzywal kiedy ?
			jkaiego sprzetu. Sprzet przez trenera moze byc uzywany wielokrotnie. ?


			-znajdz trenera ktory trenował najwiecej zwierzat DONE
			-znajdz trenera ktory uzywał jakiegos sprzetu najwieksza liczbe razy
			-znajdz trenerow ktorzy trenowali psy z gatunku spaniel DONE
			-znajdz wszystkie sprzety które byly naprawiane co najmniej 2 razy
			-znajdz wszystkie pterodaktyle ktore nigdy nie mialy przypisanego trenera DONE
		 */