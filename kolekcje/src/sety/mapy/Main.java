package sety.mapy;

import java.util.*;

public class Main {
    public static void main(String[] args) {

        //Sety przyjmuja unikalne elementy

        //HashSet - nie gwarantuje zachowania zadnej kolejnosci dodawania elementow
        //akceptuje nulle

        Set<Integer> hashSet = new HashSet<>();
        hashSet.addAll(Arrays.asList(1, 4, 2, 7, 5, 12, 67));
        System.out.println(hashSet);

        //LinkedHashSet - gwarntuje zachwoanie kolejnosci dodawania, akceptuje nulle

        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.addAll(Arrays.asList(1, 4, 2, 7, 5, 12, 67));
        System.out.println(linkedHashSet);

        //TreeSet - sortuje elementy i nie akceptuje nulli

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.addAll(Arrays.asList(1, 4, 2, 7, 5, 12, 67));
        System.out.println(treeSet);

        //Mapy
        //Przechowuja elementy pod postacia par klucz, wartosc (key,value)
        //klucze zawsze sa unikalne

        //HashMap
        Map<Integer, String> hashMap = new HashMap<>();
        hashMap.put(4, "cztery");
        hashMap.put(2, "dwa");
        hashMap.put(5, "piec");
        hashMap.put(1, "jeden");

        System.out.println(hashMap);

        //LinkedHasMap - gwarntuje zachwoanie kolejnosci dodawania, akceptuje nulle

        Map<Integer, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(4, "cztery");
        linkedHashMap.put(2, "dwa");
        linkedHashMap.put(5, "piec");
        linkedHashMap.put(1, "jeden");

        System.out.println(linkedHashMap);

        //TreeMap - sortuje elementy po kluczach i nie akceptuje nulli

        Map<Integer, String> treeMap = new TreeMap<>();
        treeMap.put(4, "cztery");
        treeMap.put(2, "dwa");
        treeMap.put(5, "piec");
        treeMap.put(1, "jeden");
        treeMap.put(7, "siedem");
        treeMap.put(3, "trzy");

        System.out.println(treeMap);

        //put(x,y) dodaje klucz x o wartosci y

        //metoda get(x) zwraca wartosc dla klucza x
        System.out.println(treeMap.get(5));

        //values() set z wartosci
        System.out.println(treeMap.values());

        //keySet() zwraca set kluczy
        System.out.println(treeMap.keySet());

        System.out.println("Rozmiar mapy: " + treeMap.size());

        //containsKey(x) zwraca true jesli mapa ma klucz x
        //containsValue(x)

        System.out.println(treeMap.containsKey(11));
        System.out.println(treeMap.containsValue("dwa"));

        for (Map.Entry<Integer, String> entry : treeMap.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Stworz mape gdzie kluczem jest String i wartoscia tez String, wyswietl cala mape za pomoca Entry

        Map<String, String> mapa = new HashMap<>();
        mapa.put("jeden", "dwa");
        mapa.put("trzy", "cztery");

        for (Map.Entry<String, String> entry : mapa.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        // Dodaj do mapy 4 slowa jako klucze przy uzyciu klasy Scanner, niech wartoscia bedzie dlugosc kazdego ze slow


//        Map<String, Integer> mapa1 = new HashMap<>();
//
//        Scanner scanner = new Scanner(System.in);
//
//        for (int i = 0; i < 4; i++) {
//            System.out.println("Podaj słowo: ");
//            String element = scanner.next();
//            mapa1.put(element, element.length());
//        }
//        System.out.println(mapa1);

        Map<Integer, String> map = new HashMap<>();
        dodajSlowoDoMapy(map, "styczen");
        dodajSlowoDoMapy(map, "luty");
        dodajSlowoDoMapy(map, "marzec");
        System.out.println(map);

        System.out.println("Zadanie 2");

        Map<String, Integer> zadanie2 = new LinkedHashMap<>();
        ileRazyDodany1(zadanie2, "pies", "pies", "kot", "kot", "kot");



        System.out.println("Zadanie 3");

        Set<Integer> losoweLiczby = duzyLotek();
        System.out.println("6 liczb bez powtórzeń to" + losoweLiczby);



        System.out.println("Zadanie 4");

        Map<Integer, String> zadanie4 = new LinkedHashMap<>();
        zadanie4.put(1, "Styczeń");
        zadanie4.put(2, "Luty");
        zadanie4.put(3, "Marzec");
        zadanie4.put(4, "Kwiecień");
        System.out.println("Przed zmianą: " + zadanie4);
        zmienParzyste(zadanie4);
        System.out.println("Po zmianie: " + zadanie4);



        System.out.println("Zadanie 5");

        Map<String, List<String>> klasyNazwiska = new LinkedHashMap<>();
        klasyNazwiska.put("1a", Arrays.asList("Kamiński", "Lewandowski", "Nowak"));
        klasyNazwiska.put("1b", Arrays.asList("Kowalski", "Wiśniewski", "Wawrzeńczk"));
        klasyNazwiska.put("2a", Arrays.asList("Gontarek", "Popek", "Jaciuk"));

        List<String> najdluzszeNazwisko = listaNajdluzszychZKazdejKlasy(klasyNazwiska);
        System.out.println(najdluzszeNazwisko);
//        System.out.println(wynik1);
        String najdlzuzszeZCalejMapy = najdluzszeZeWszystkich(klasyNazwiska);
        System.out.println(najdlzuzszeZCalejMapy);

    }

    // Napisz metoda która dodaje słowa do mapy. Kluczem maja byc kolejen liczby
    // naturalne zaczynajac od 0

    public static void dodajSlowoDoMapy(Map<Integer, String> map, String wyraz) {
        map.put(map.size(), wyraz);
    }

    //2 Napisz metode ktora pozwala dodawac do mapy kolejne wyrazy. Na koncu ma
    // wyswietlic ile razy jaki element byl dodany
    // pies kot ryba pies kot pies
    // pies - 3, ryba - 1, kot - 2

    public static void ileRazyDodany1(Map<String, Integer> map, /*String slowo,*/ String... slowa) {
//        if (!map.containsKey(slowo)) {
//            map.put(slowo, 1);
//        } else {
//            map.put(slowo, map.get(slowo) + 1);
//        }

        for (String element : slowa) {
            if (map.containsKey(element)) {
                map.put(element, map.get(element) + 1);
            } else {
                map.put(element, 1);
            }
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }

    //3 Napisz program, ktory losuje liczby w duzym lotku bez powtorzen, zakres liczb 1-45

    public static Set<Integer> duzyLotek() {
        Random random = new Random();
        Set<Integer> zbiorLiczb = new TreeSet<>();
        while (zbiorLiczb.size() < 6) {
            int liczbaLosowana = random.nextInt(45) + 1;
            zbiorLiczb.add(liczbaLosowana);
        }
        return zbiorLiczb;
    }


    //4 napisz metode ktora przyjmuje Mape<Integer, String>, zamien wartosci ktorych
    // klucze sa parzystych wartosci
    // na słowo "parzyste"

    public static void zmienParzyste(Map<Integer, String> map) {
        for (Map.Entry<Integer, String> entry : map.entrySet()) {
            if (entry.getKey() % 2 == 0) {
                entry.setValue("Parzyste"); // map.put(entry.getKey(), "parzyste");
            }
        }
    }

    //5 W systemie przechowujemy nazwe klasy (szkolnej, np 1a, 2b) oraz listę osób
    // (same nazwiska jako Stringi) które uczeszczaja do klasy.
    // 1) Napisz metode ktora zwraca liste osob o najdluzszych nazwiskach z kazdej
    // klasy

    // listNajdluzszychNazwiskZKazdejKlasy 1.

    // Metoda zwracajac najdluzszy element w liscie 2. ->  wywolana w 1.

    // Napisz metode która zwraca osobe o najdluzszym nazwisku ze wzystkich klas 3.

    public static List<String> listaNajdluzszychZKazdejKlasyV2 (Map<String, List<String>> map) {
        List<String> wynik = new ArrayList<>();
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            wynik.add(najdluzszyElement(entry.getValue()));
        }
        return wynik;
    }

    public static String najdluzszyElement(List<String> list) {
        String najdluzszy = "";
        for (String element : list) {
            if (element.length() > najdluzszy.length()) {
                najdluzszy = element;
            }
        }
        return najdluzszy;
    }

    public static String najdluzszeZeWszystkichV2(Map<String, List<String>> map) {
        return najdluzszyElement(listaNajdluzszychZKazdejKlasyV2(map));
    }



    public static List<String> listaNajdluzszychZKazdejKlasy(Map<String, List<String>> map) {
        List<String> wynik = new ArrayList<>();
//        String najdluzszeZeWszystkich = "";
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> listaNazwisk = entry.getValue();
            if (listaNazwisk.size() > 0) {
                String najdluzsze = listaNazwisk.get(0);
                for (String element : listaNazwisk) {
                    if (element.length() > najdluzsze.length()) {
                        najdluzsze = element;
                    }
                }
                wynik.add(najdluzsze);
            }
        }
//        List<String> wynik1 = new ArrayList<>();
//        wynik1.add(najdluzszeZeWszystkich);
//        wynik.addAll(wynik1);
        return wynik;
    }


    public static String najdluzszeZeWszystkich(Map<String, List<String>> map) {
        String najdluzsze = "";
        for (Map.Entry<String, List<String>> entry : map.entrySet()) {
            List<String> listaNazwisk = entry.getValue();
            for (String element : listaNazwisk) {
                if (element.length() > najdluzsze.length()) {
                    najdluzsze = element;
                }
            }
        }
        return najdluzsze;

    }
}
