package pl.sda.arppl4.kolekcje_java.Dziennik;

import java.util.*;

public class Dziennik {

    private Map<String, Student> mapaStudentow = new HashMap<>();

    public void dodajStudenta(String numerIndeksu, String imie, String nazwisko) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            System.err.println("Student o podanym numerze indeksu juz istnieje");
        } else {
            mapaStudentow.put(numerIndeksu, new Student(numerIndeksu, imie, nazwisko));

            System.out.println("Student " + numerIndeksu + " dodany");
        }
    }

    public void wypiszListeStudentow() {
        System.out.println("ListaStudentow: ");
        for (Student student : mapaStudentow.values()) {
            System.out.println(student);
        }
    }

    public void usunStudenta(String numerIndeksu) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            mapaStudentow.remove(numerIndeksu);
            System.out.println("Usunieto studenta o numerze " + numerIndeksu);
        } else {
            System.err.println("Stundet " + numerIndeksu + " nie istnieje");
        }
    }

    public Optional<Student> zwrocStudenta(String indeks) {
        if (mapaStudentow.containsKey(indeks)) {
            System.out.println("Znaleziono Studenta o numerze : " + indeks);
            return Optional.of(mapaStudentow.get(indeks));
        } else {
            System.err.println("Student o podanym numerze indeksu nie istnieje");
            return Optional.empty();
        }
    }

    public Optional<Double> podajSredniaStudenta(String numerIndeksu) {
        if (mapaStudentow.containsKey(numerIndeksu)) {
            System.out.println("Znaleziono studenta o numerze indeksu: " + numerIndeksu);

            Student student = mapaStudentow.get(numerIndeksu);
            List<Double> listaOcenStudenta = student.getListaOcen();
            if (listaOcenStudenta.isEmpty()) {
                return Optional.empty();
            }
            double suma = 0.0;
            for (Double ocena : listaOcenStudenta) {
                suma += ocena;
            }
            double srednia = suma / listaOcenStudenta.size();
            return Optional.of(srednia);
        }
        return Optional.empty();
    }

    public void dodajOcene(String numerIndeksu, double ocena) {
        if (!mapaStudentow.containsKey(numerIndeksu)) {
            System.err.println("Nie ma takiego studenta");
        } else {
            Student student = mapaStudentow.get(numerIndeksu);
            student.getListaOcen().add(ocena);
        }
    }

    public List<Student> podajStudentowZagrozonych(){
        List<Student> listaZagrozonych = new ArrayList<>();

        for (Student student : mapaStudentow.values()) {
            Optional<Double> optionalSrednia = podajSredniaStudenta(student.getIndeks());
            if (optionalSrednia.isPresent()){
                double srednia = optionalSrednia.get();
                if (srednia <= 2.0){
                    listaZagrozonych.add(student);
                }
            }
        }return  listaZagrozonych;
    }

}
