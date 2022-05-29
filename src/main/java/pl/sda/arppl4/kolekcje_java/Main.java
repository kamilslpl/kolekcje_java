package pl.sda.arppl4.kolekcje_java;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Map<String, String>  mapa = new HashMap<>();

        mapa.put("Polska", "Warszawa");
        mapa.put("Niemcy", "Berlin");
        mapa.put("Czechy", "Praga");

        String stolica = mapa.get("Polska");

    }
}
