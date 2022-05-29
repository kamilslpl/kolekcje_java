package pl.sda.arppl4.kolekcje_java.Zadanie2;

/*
* Utwórz klasę ParaLiczb, klasa powinna posiadać pole
int a;
int b;
konstruktor pełny
gettery i settery
toString
Stwórz Main a w nim kilka instancji klasy ParaLiczb: {(1,2), (2,1), (1,1), (1,2)}.
dodaj elementy do zbioru
Wyświetl wszystkie elementy zbioru na ekran. Czy program działa zgodnie z oczekiwaniem?*/


import java.util.HashSet;
import java.util.Set;

public class MainZadanie2 {
    public static void main(String[] args) {

        ParaLiczb p1 = new ParaLiczb(1,2);
        ParaLiczb p2 = new ParaLiczb(2,1);
        ParaLiczb p3 = new ParaLiczb(1,1);
        ParaLiczb p4 = new ParaLiczb(1,2);


        Set<ParaLiczb> zbiorParLiczb = new HashSet<>();
        zbiorParLiczb.add(p1);
        zbiorParLiczb.add(p2);
        zbiorParLiczb.add(p3);
        zbiorParLiczb.add(p4);

        System.out.println("Ilosc : " + zbiorParLiczb.size());
        String a;

    }
}
