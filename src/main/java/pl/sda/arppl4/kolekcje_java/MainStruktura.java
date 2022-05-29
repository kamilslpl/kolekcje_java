package pl.sda.arppl4.kolekcje_java;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainStruktura {
    public static void main(String[] args) {

        Map<String, Panstwo> mapa = new HashMap<>();
        Panstwo polskaPanstwo = new Panstwo("Polska", "Warszawa", 3);
        mapa.put("Polska", polskaPanstwo);
        mapa.put("Niemcy", new Panstwo("Niemcy", "Berlin", 5));
        mapa.put("Czechy", new Panstwo("Czechy", "Praga", 1));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj nazwe kraju:");
        String nazwaKraju = scanner.next();

        if (mapa.containsKey(nazwaKraju)) {
            Panstwo obiektPanstwo = mapa.get(nazwaKraju);
            System.out.println(obiektPanstwo);

            System.out.println("Ilosc obywateli " + obiektPanstwo.getLiczbaLudnosci());
        } else{
            System.err.println("Panstwo nie istnieje");
        }


    }
}
