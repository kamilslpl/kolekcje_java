package pl.sda.arppl4.kolekcje_java.Zadanie3;

/*
Stwórz Main'a (MainSetSlowa) użytkownik ma wpisać jedną linię tekstu ze scannera:
wczytaj linię tekstu
podziel linię na słowa
wypisz unikalne słowa wpisane przez użytkownika
wypisz unikalne litery wpisane przez użytkownika
* */

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class MainZadanie3Slowa {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj tekst: ");
        String tekstWpisany = scanner.nextLine();
        String tekstBezPrzecinkow = tekstWpisany.replaceAll(",", "");
        String tekstBezPrzecinkowIkropek = tekstBezPrzecinkow.replaceAll("[.]", "");

        String [] tablicaSlow = tekstBezPrzecinkowIkropek.split(" ");
        Set<String> zbiorSlow = new HashSet<>(Arrays.asList(tablicaSlow));

        System.out.println(zbiorSlow);



    }
}
