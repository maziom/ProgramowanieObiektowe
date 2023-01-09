public class Gatunek implements Cloneable {
    String nazwaRodzaju;
    String nazwaGatunku;
    int liczbaChromosomow2n;
    int podstawowaLiczbaChromosomowX;


    public Gatunek(String nazwaRodzaju, String nazwaGatunku, int liczbaChromosomow2n, int podstawowaLiczbaChromosomowX) {
        this.nazwaRodzaju = nazwaRodzaju;
        this.nazwaGatunku = nazwaGatunku;
        this.liczbaChromosomow2n = liczbaChromosomow2n;
        this.podstawowaLiczbaChromosomowX = podstawowaLiczbaChromosomowX;
    }

    public void nazwa(){
        System.out.println("Nazwa: "+nazwaRodzaju+nazwaGatunku);
    }
    public void haploidalnaLiczbaChromosomow(){
        int pom=liczbaChromosomow2n/2;
        System.out.println("haploidalna liczba chromosomow n: "+pom);
    }
    public void display(){
        System.out.println("Nazwa rodzaju: "+ nazwaRodzaju);
        System.out.println("Nazwa gatunku: "+ nazwaGatunku);
        System.out.println("Liczba chromosomow 2n: "+liczbaChromosomow2n);
        System.out.println("Podstawowa liczba chromosomow x: "+podstawowaLiczbaChromosomowX);
    }
    public Object clone(){
        try {
            return super.clone();
        }catch (CloneNotSupportedException e){
            e.printStackTrace();
        }
        return -1;
    }
}
