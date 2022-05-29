package pl.sda.arppl4.kolekcje_java;

import java.util.HashSet;
import java.util.Set;

public class MainSet {
    public static void main(String[] args) {
        //List<X>
        // Map<Key, Valure> - KV
        // Set<X>

        Set<String> zbior = new HashSet<>();
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");
        zbior.add("Polska");
        zbior.add("Czechy");
        zbior.add("Ukraina");
        zbior.add("Niemcy");

        System.out.println(zbior);
    }
}
