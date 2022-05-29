package pl.sda.arppl4.kolekcje_java.Zadanie1;


import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

/*
* Umieść wszystkie elementy tablicy {10,12,10,3,4,12,12,300,12,40,55} w zbiorze (HashSet) oraz:
Konstruktor kopiujący elementy listy do setu:
Set<Integer> liczby = new HashSet<>(Arrays.asList(1, 2 … ));
Wypisz liczbę elementów na ekran (metoda size())
Wypisz wszystkie zbioru elementy na ekran (forEach)
Usuń elementy 10 i 12, wykonaj ponownie podpunkty a) i b)
Skopiuj plik wraz z implementacją i w drugiej kopii
* zmień implementacje na TreeSet (zamień HashSet na TreeSet przy tworzeniu instancji kolekcji)+
* */
public class MainZadanie1_1 {
    public static void main(String[] args) {

        //Set<Integer> liczby = new HashSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));
        Set<Integer> liczby = new TreeSet<>(Arrays.asList(10,12,10,3,4,12,12,300,12,40,55));

        System.out.println(liczby);
        int dlugoscTablicy = liczby.size();

        System.out.println("Rozmiar " + liczby.size());
        System.out.println("Inaczej teraz");
        System.out.println("Dlugosc tablicy to: " +dlugoscTablicy);

        System.out.println("Elementy tablicy:");
        for (Integer element : liczby) {
            System.out.println("Element XXX " + element);
        }

        liczby.remove(10);
        liczby.remove(12);

        liczby.forEach(System.out::println);


    }
}
