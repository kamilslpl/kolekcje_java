package pl.sda.arppl4.kolekcje_java.Zadanie4Student;

import java.util.Optional;
import java.util.Scanner;

public class MainParserObjectUniversity {
    public static void main(String[] args) {
        University university = new University();

        Scanner scanner = new Scanner(System.in);

        Parser parser = new Parser(scanner, university);
        parser.obslugaKomend();

    }
}
