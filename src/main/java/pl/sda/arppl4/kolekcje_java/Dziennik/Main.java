package pl.sda.arppl4.kolekcje_java.Dziennik;

import java.util.List;
import java.util.Optional;

/*
* Stwórz aplikację, a w niej klasę Dziennik i student . Stwórz również klasę Student. Klasa
Student powinna:
- posiadać listę ocen studenta (List<Double>)
- posiadać (pole) numer indeksu studenta (String)
- posiadać (pole) imię studenta
- posiadać (pole) nazwisko studenta
Klasa Dziennik powinna:
- posiadać (jako pole) listę Studentów.
- posiadać metodę 'dodajStudenta(Student):void' do dodawania nowego studenta do
dziennika
- posiadać metodę 'usuńStudenta(Student):void' do usuwania studenta
- posiadać metodę 'usuńStudenta(String):void' do usuwania studenta po jego numerze
indexu
- posiadać metodę 'zwróćStudenta(String):Student' która jako parametr przyjmuje numer
indexu studenta, a w wyniku zwraca konkretnego studenta.
- posiadać metodę 'podajŚredniąStudenta(String):double' która przyjmuje indeks studenta
i zwraca średnią ocen studenta.
- posiadać metodę 'podajStudentówZagrożonych():List<Student>'
- posiadać metodę 'posortujStudentówPoIndeksie():List<Student>' - która sortuje listę
studentów po numerach indeksów, a następnie zwraca posortowaną listę.*/
public class Main {
    public static void main(String[] args) {

       Dziennik dziennik = new Dziennik();
       dziennik.dodajStudenta("12345", "Pawel", "Gawel");

       dziennik.wypiszListeStudentow();
       dziennik.usunStudenta("54545454");
       dziennik.usunStudenta("6634");
       dziennik.usunStudenta("12345");

       Optional<Student> optionalStudent = dziennik.zwrocStudenta("88888");
       if (optionalStudent.isPresent()){
           Student student = optionalStudent.get();
           System.out.println("Imie i nazwisko " + student.getImie() + " " + student.getNazwisko());
       }
        Optional<Double> optionalSrednia = dziennik.podajSredniaStudenta("8888");
       if (optionalSrednia.isPresent()){
           Double sredniaStudenta= optionalSrednia.get();
           System.out.println("Zwrocona srednia " + sredniaStudenta);

       }else {
           System.out.println("Funkcja nie zwrocila sredniej");
       }

    dziennik.dodajStudenta("999999", "Pawel", "Gawelek");
       dziennik.dodajOcene("999999", 5.0);
       dziennik.dodajOcene("999999", 3.0);
       dziennik.dodajOcene("999999", 3.0);
       dziennik.dodajOcene("999999", 3.0);
        Optional<Double> optionalSredniaStudenta = dziennik.podajSredniaStudenta("999999");
        if (optionalSredniaStudenta.isPresent()){
            Double sredniaStudenta = optionalSredniaStudenta.get();
            System.out.println("Zwrocona srednia " + sredniaStudenta);
        }else {
            System.out.println("Funkcja nie zwrocila sredniej");
        }
    List<Student> listaZagrozonych = dziennik.podajStudentowZagrozonych();
        System.out.println("Lista zagrozonych " + listaZagrozonych);
    }
}
