package pl.sda.arppl4.kolekcje_java.Zadanie4Student.StarszeWersje;

import pl.sda.arppl4.kolekcje_java.Zadanie4Student.University;

import javax.crypto.spec.PSource;

public class MainUniversity {

    public static void main(String[] args) {
        University university = new University();
        university.dodaj(100100L, "Pawel", "Noname");
        university.dodaj(100200L, "Lolek", "Noname2");
        university.dodaj(100400L, "Bolek", "Noname3");
        university.dodaj(100300L, "Pawel", "kowalski");

        boolean czyZawiera = university.czyZawieraStudenta(100200L);
        if (czyZawiera){
            System.out.println("Zawiera");
        }else{
            System.err.println("nie zawiera");
        }

        System.out.println("student 10200" + university.zwrocStudentaOptional(100200));

        System.out.println("Ilosc studentow: " + university.podajIloscStudentow());

        university.wypiszWszystkichStudentow();
        university.wypiszWszystkieNumeryIndeksow();


    }
}


