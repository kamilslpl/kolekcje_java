package pl.sda.arppl4.kolekcje_java;

public class Panstwo {
    private String nazwa;
    private String stolica;
    private int liczbaLudnosci;

    public Panstwo(String nazwa, String stolica, int liczbaLudnosci) {
        this.nazwa = nazwa;
        this.stolica = stolica;
        this.liczbaLudnosci = liczbaLudnosci;
    }

    public String getNazwa() {
        return nazwa;
    }

    public String getStolica() {
        return stolica;
    }

    public int getLiczbaLudnosci() {
        return liczbaLudnosci;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }

    public void setStolica(String stolica) {
        this.stolica = stolica;
    }

    public void setLiczbaLudnosci(int liczbaLudnosci) {
        this.liczbaLudnosci = liczbaLudnosci;
    }

    @Override
    public String toString() {
        return "Panstwo{" +
                "nazwa='" + nazwa + '\'' +
                ", stolica='" + stolica + '\'' +
                ", liczbaLudnosci=" + liczbaLudnosci +
                '}';
    }
}
