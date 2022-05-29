package pl.sda.arppl4.kolekcje_java.Zadanie4Student;


import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class University {
   private Map<Long, Zadanie4_Student> mapaStudentow = new HashMap<>();

   public void dodaj(long indeks, String imieA, String nazwiskoA) {
      Zadanie4_Student nowoStworzonyStudentDoDodania = new Zadanie4_Student(indeks, imieA, nazwiskoA);
      mapaStudentow.put(indeks, nowoStworzonyStudentDoDodania);
   }

   public boolean czyZawieraStudenta(long szukanyindeks) {
      return mapaStudentow.containsKey(szukanyindeks);
   }

   public Optional<Zadanie4_Student> zwrocStudentaOptional(long indeks) {
      if (mapaStudentow.containsKey(indeks)){
         return Optional.of(mapaStudentow.get(indeks));
         }else {
         return Optional.empty();
      }
   }
   public int podajIloscStudentow(){
      return mapaStudentow.size();
   }

   public void wypiszWszystkichStudentow(){
      System.out.println("Lista studentow");
      for (Zadanie4_Student tymczasowyStudent : mapaStudentow.values()) {
         System.out.println(tymczasowyStudent);

      }
   }

   public void wypiszWszystkieNumeryIndeksow(){
      System.out.println("numery indeksow ");
      for (Long numerIndeksu : mapaStudentow.keySet()) {
         System.out.println(numerIndeksu);

      }


   }
   }



