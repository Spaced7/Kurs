package przedszkole;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
		Grupa grupa = new Grupa("Zielona");
		Grupa grupa1 = new Grupa("Niebieska");

		Wychowawca wychowawca = new Wychowawca("Anna", "Kowalska", LocalDate.of(1996,12,29),true,"angielski", 1900);
		Wychowawca wychowawca1 = new Wychowawca("Katarzyna", "Gaj", LocalDate.of(1993,02,02),false,1200);

		Dziecko dziecko = new Dziecko("Maciej", "Nowak", LocalDate.of(2019,12,12),0,5);
		Dziecko dziecko1 = new Dziecko("Michał", "Popowicz", LocalDate.of(2018,03,11),3,1);


		Sala sala = new Sala("Zielona", "Zielony");
		Sala sala1 = new Sala("Niebieska", "Niebieska");

		grupa.setSala(sala);
		grupa1.setSala(sala1);
		System.out.println("Jaką sale ma grupa");
		System.out.println(grupa.getSala());

		grupa.dodajDziecko(dziecko);
		grupa1.dodajDziecko(dziecko1);
		grupa1.wyswietlDziecko();
		System.out.println("wyświetl dziecko z grupy pierwszej");
		grupa.wyswietlDziecko();
		System.out.println();
		System.out.println("wyświetl dziecko z grupy drugiej");
		grupa1.wyswietlDziecko();
		System.out.println("jaką grupe ma dziecko:  ");
		System.out.println(dziecko.getGrupa());
		System.out.println(dziecko1.getGrupa());

		System.out.println(wychowawca1);
		System.out.println(wychowawca);

		System.out.println("Dziecko z największą liczbą przewinień to: " + Dziecko.zNajwiekszaIlosciaPrzewinien(Dziecko.getEkstencja()));

		System.out.println("Wychowawcy z pensja większą niż parametr: " + Wychowawca.wychowawcyZPensjaWiekszaNiz(Wychowawca.getEkstensja(),2000));

        /*
		 * Stwórz system do zarządzania przedszkolem. W przedszkolu mamy dzieci oraz
		 * wychowawcow, dla obu chcemy znac imie, nazwisko oraz date urodzenia. Dzieci
		 * dziela sie na posluszne (odznaka) i nieposluszne (przewinienia).
		 *
		 * Wychowawcy maja pensje (obliczana za pomoca algorytmu) i dziela sie na
		 * wychowawcow kwalifikowanych (kwalifikacje) oraz tymczasowych. DONE
		 *
		 * Wychowacwa odpowiada za grupe (nazwa, max liczba dzieci, obecnie 15).
		 * Wychowacwca moze miec wiele grup, grupa ma jednego wychowawce. DONE
		 *
		 * Kazda grupa ma przypisana sale (nazwa, kolor scian). DONE
		 *
		 * -narysuj poprawny diagram uml do teog zagadnienia -napisz metode która zwraca
		 * dziecko ktore ma najwiecej przewinien -napisz metode ktora zwroci wychowawcow
		 * kwliafikowanych z pensja wieksza niz podany parametr DONE

         */
    }
}
