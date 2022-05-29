package pl.sda.arppl4.kolekcje_java.Zadanie4Student;

import java.util.Objects;

public class Zadanie4_Student {
    Long numerIndeksu;
    String imie, nazwisko;

    public Zadanie4_Student(long numerIndeksu, String imie, String nazwisko) {
        this.numerIndeksu = numerIndeksu;
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    @Override
    public String toString() {
        return "Zadanie4_Student{" +
                "numerIndeksu=" + numerIndeksu +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Zadanie4_Student)) return false;
        Zadanie4_Student that = (Zadanie4_Student) o;
        return numerIndeksu == that.numerIndeksu && imie.equals(that.imie) && nazwisko.equals(that.nazwisko);
    }

    @Override
    public int hashCode() {
        return Objects.hash(numerIndeksu, imie, nazwisko);
    }
}
