package pl.sda.arppl4.kolekcje_java.Dziennik;

import lombok.*;

import java.util.ArrayList;
import java.util.List;
@Data

@NoArgsConstructor
@AllArgsConstructor

public class Student {

    private List<Double> listaOcen = new ArrayList<>();
    private String indeks;
    private String imie;
    private String nazwisko;

    public Student(String indeks, String imie, String nazwisko) {
        this.indeks = indeks;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }
}
