package pl.sda.arppl4.kolekcje_java.Zadanie4Student.StarszeWersje;

import pl.sda.arppl4.kolekcje_java.Zadanie4Student.Zadanie4_Student;

import java.util.HashMap;
import java.util.Map;

public class MainZadanie4Student {
    public static void main(String[] args) {

        Zadanie4_Student student1 = new Zadanie4_Student(100100, "Pawel", "Noname");
        Zadanie4_Student student2 = new Zadanie4_Student(100200, "Lolek", "Noname2");
        Zadanie4_Student student3 = new Zadanie4_Student(100400, "Bolek", "Noname3");

        Map<Long, Zadanie4_Student> mapaStudentow = new HashMap<>();
        mapaStudentow.put(student1.numerIndeksu, student1);
        mapaStudentow.put(student2.numerIndeksu, student2);
        mapaStudentow.put(student3.numerIndeksu, student3);

        System.out.println("Numer indeksu 100200:" + mapaStudentow.get(100200L));
        System.out.println("Wielkosc mapy: " + mapaStudentow.size());
        System.out.println(mapaStudentow);
        System.out.println("Czy zawiera 100400: " +mapaStudentow.containsKey(100400L));

        for (Long aLong : mapaStudentow.keySet()) {
            System.out.println(aLong + " ");

        }
        System.out.println();

        for (Zadanie4_Student value : mapaStudentow.values()) {
            System.out.println(value + " ");

        }
        System.out.println();

        for (Map.Entry<Long, Zadanie4_Student> wpis : mapaStudentow.entrySet()) {
            System.out.println(wpis.getKey() + " -> " + wpis.getValue());
        }


    }
}
