import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        prostokat p1 = new prostokat(2,3);
        p1.Wypisz();

        prostokat p2 = new prostokat(-2,3);
        p2.Wypisz();




        Budynek b1= new Budynek("szkoła",14, LocalDate.of(2010,1,25));
        Budynek b2= new Budynek("straz",2, LocalDate.of(1980,1,25));
        Budynek b3= new Budynek("gmina",4, LocalDate.of(1950,1,25));
        b1.getIleLat();
        b2.getIleLat();
        b3.getIleLat();

        Gatunek g=new Gatunek("lisowate","lis",50,12);
        g.nazwa();
        g.haploidalnaLiczbaChromosomow();
        g.display();
        Gatunek g2=(Gatunek)g.clone();
        g2.nazwa();
        g2.haploidalnaLiczbaChromosomow();
        g.display();
    }
}