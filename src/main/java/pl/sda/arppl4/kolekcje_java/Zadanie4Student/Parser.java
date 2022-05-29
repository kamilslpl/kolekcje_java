package pl.sda.arppl4.kolekcje_java.Zadanie4Student;

import java.util.Optional;
import java.util.Scanner;

public class Parser {
    private Scanner scanner;
    private University university;

    public Parser(Scanner scanner, University university) {
        this.scanner = scanner;
        this.university = university;
    }

    public void obslugaKomend(){
        String komenda;
        do {
            System.out.println("Podaj komende:");
            komenda = scanner.next();

            if (komenda.equalsIgnoreCase("dodaj")) {
                obslugaDodaj();

            } else if (komenda.equalsIgnoreCase("wypisz")) {
                obslugaWypisz();

            } else if (komenda.equalsIgnoreCase("zawiera")) {
                obslugaZawiera();

            } else if (komenda.equalsIgnoreCase("znajdz")) {
                obslugaZnajdz();
            }
        else if(!komenda.equalsIgnoreCase("koniec")){
            System.err.println("wpisano zla komende");
        }

    } while (!komenda.equalsIgnoreCase("koniec"));

    }


    public void obslugaDodaj() {
        System.out.println("Podaj numer indeksu:");
        long numerIndeksu = scanner.nextLong();

        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.err.println("Student o takim numerze indeksu jest już dodany.");
            return; // rozpocznij pętlę do-while od nowa
        }

        System.out.println("Podaj imie:");
        String imie = scanner.next();

        System.out.println("Podaj nazwisko:");
        String nazwisko = scanner.next();

        university.dodaj(numerIndeksu, imie, nazwisko);
    }

    public void obslugaWypisz() {
        university.wypiszWszystkichStudentow();
    }

    public void obslugaZawiera() {
        System.out.println("Podaj numer szukanego indeksu:");
        long numerIndeksu = scanner.nextLong();
        if (university.czyZawieraStudenta(numerIndeksu)) {
            System.out.println("Tak, taki student istnieje");
        } else {
            System.err.println("Nie zawiera takiego studenta.");
        }
    }

    public void obslugaZnajdz() {
        System.out.println("Podaj numer szukanego indeksu:");
        long numerIndeksu = scanner.nextLong();

        Optional<Zadanie4_Student> szukanyStudent = university.zwrocStudentaOptional(numerIndeksu);
        if (szukanyStudent.isPresent()) {
            Zadanie4_Student student = szukanyStudent.get();
            System.out.println("Dane studenta: " + student);
        } else {
            System.err.println("Nie zawiera takiego studenta");
        }
    }
}
