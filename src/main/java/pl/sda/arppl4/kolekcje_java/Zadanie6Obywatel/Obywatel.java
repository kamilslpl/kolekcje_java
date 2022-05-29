package pl.sda.arppl4.kolekcje_java.Zadanie6Obywatel;

import java.util.Objects;

public class Obywatel {
    private String imie, nazwisko, pesel;

    public Obywatel(String imie, String nazwisko, String pesel) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.pesel = pesel;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Obywatel)) return false;
        Obywatel obywatel = (Obywatel) o;
        return Objects.equals(pesel, obywatel.pesel);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pesel);
    }

    @Override
    public String toString() {
        return "Obywatel{" +
                "imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", pesel='" + pesel + '\'' +
                '}';
    }
}
