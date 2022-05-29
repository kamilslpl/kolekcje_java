package pl.sda.arppl4.kolekcje_java.Zadanie4Student.StarszeWersje;

import pl.sda.arppl4.kolekcje_java.Zadanie4Student.University;
import pl.sda.arppl4.kolekcje_java.Zadanie4Student.Zadanie4_Student;

import java.util.Optional;
import java.util.Scanner;

public class MainParserUniversity {
    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);
        String komenda;

        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                System.out.println("Podaj numer indeksu:");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)) {
                    System.err.println("Student o takim numerze indeksu jest już dodany.");
                    continue; // rozpocznij pętlę do-while od nowa
                }

                System.out.println("Podaj imie:");
                String imie = scanner.next();

                System.out.println("Podaj nazwisko:");
                String nazwisko = scanner.next();

                university.dodaj(numerIndeksu, imie, nazwisko);
            } else if (komenda.equalsIgnoreCase("wypisz")) {
                university.wypiszWszystkichStudentow();
            } else if (komenda.equalsIgnoreCase("zawiera")) {
                System.out.println("Podaj numer szukanego indeksu:");
                long numerIndeksu = scanner.nextLong();

                if (university.czyZawieraStudenta(numerIndeksu)) {
                    System.out.println("Tak, taki student istnieje");
                } else {
                    System.err.println("Nie zawiera takiego studenta.");
                }
            } else if (komenda.equalsIgnoreCase("znajdz")) {
                System.out.println("Podaj numer szukanego indeksu:");
                long numerIndeksu = scanner.nextLong();

                Optional<Zadanie4_Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
                if (szukanyStudent.isPresent()) {
                    Zadanie4_Student student = szukanyStudent.get();
                    System.out.println("Dane studenta: " + student);
                } else {
                    System.err.println("Nie zawiera takiego studenta");
                }

            }else if(!komenda.equalsIgnoreCase("koniec")){
                System.err.println("wpisano zla komende");
            }

        } while (!komenda.equalsIgnoreCase("koniec"));
    }
}