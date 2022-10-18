import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //zad1();
        //zad2();
        //zad3();
        //zad4();
        //zad5("hello");
        l2zad1();


    }
    //lab03
    //zad1
    /*public static void zad1(){
    int n, a = 0, b=0;
    double suma = 0, pkt, ile = 0;
    Scanner input = new Scanner(System.in);
    System.out.println("Podaj ilosc studentow");
    n = input.nextInt();
    if(n>0){
        while(n>0) {
            System.out.println("Podaj ilosc pkt: 0 - 10");
            pkt = input.nextDouble();

            if (pkt >= a && pkt <= b) {
                suma += pkt;
                ile++;
                n--;
            }
        }
        System.out.println("ile "+ile);
        System.out.println("suma pkt: "+suma);
        System.out.println("srednia: "+(suma/ile));
    }
     else{
            System.out.println("Podaj ilosc > 0");

    }

    }
    */
    //zad2
    /*
    public static double Input(){
         Scanner input = new Scanner(System.in);
         System.out.println("Podaj liczbe:");
         double n = input.nextDouble();
         return n;

    }
    public static void zad2(){
        int ile_d = 0, ile_u = 0;
        double sumaD=0,sumaU=0,liczb;
        for (int i = 0; i < 10 ; i++) {
            liczb=Input();
            if(liczb>=0){
                ile_d++;sumaD+=liczb;
            }else {
                ile_u++;sumaU+=liczb;
            }

        }
        System.out.println("ILOSC DODATNICH: "+ile_d+", suma = "+sumaD);
        System.out.println("ILOSC UJEMNYCH: "+ile_u+", suma = "+sumaU);

    }*/

    //zad3
    /*
    public static double Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        double n = input.nextDouble();
        return n;

    }
    public static void zad3(){
        int ile_p = 0,sumaP = 0;
        double liczb = Input();
        for (int i = 0; i <=liczb ; i++) {
            if(i%2==0){
                ile_p++;sumaP+=liczb;
            }

        }
        System.out.println("Ilosc liczb parzystych w ciagu: " +ile_p);
        System.out.println("suma: " +sumaP);


    }*/

    //zad5
    /*
    public static boolean zad5(String s){
        int l = s.length() -1;
        s.toLowerCase(Locale.ROOT);
        for (int i = 0; i < s.length() / 2; i++) {
            if(s.charAt(i) != s.charAt(l)) return false;
            l--;

        }
        return true;
    }
*/
    //zad4
    /*
    public static double Input(){
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe:");
        double n = input.nextDouble();
        return n;

    }
    public static void zad4(){
        Random rand = new Random();
        int x = -10;int ile_p = 0,sumaP = 0;
        int y = 45, a;
        double liczb = Input();
        for (int i = 0; i <= liczb; i++) {
            a = rand.nextInt(y-x+1)+x;
            if(a%2 == 0){
                ile_p++;sumaP+=liczb;
            }



        }
        System.out.println("Ilosc liczb parzystych w ciagu: " +ile_p);
        System.out.println("suma: " +sumaP);
    }*/
    //lab02
    //zad1
    public static void l2zad1(){

    }
}