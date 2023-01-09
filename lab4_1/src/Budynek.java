import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Budynek {
    String nazwa;
    int liczba_pieter;
    LocalDate rok_budowy;

    public Budynek(String nazwa, int liczba_pieter, LocalDate rok_budowy) {
        this.nazwa = nazwa;
        this.liczba_pieter = liczba_pieter;
        this.rok_budowy = rok_budowy;
    }
    public void setNazwa(String nazwa){this.nazwa= nazwa;}
    public long getIleLat(){
        LocalDate today = LocalDate.now();
        long ileLat= ChronoUnit.YEARS.between(rok_budowy,today);
        return ileLat;
    }
}
