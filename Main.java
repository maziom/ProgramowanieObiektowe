public class Main {
    public static void main(String[] args) {
        //wywołanie metod
        System.out.println(getMyName());
        System.out.println(getMyAge());
        obliczenia(1,2);
        parzysta(15);


    }
    //metody
    //zad1
    public static  String getMyName(){
        return "MAKS";
    }
    public static int getMyAge(){
        return 21;
    }
    //zad2
    public static void obliczenia(int l1, int l2){
        System.out.println(l1 +" + "+l2+" = " +(l1+l2));
        System.out.println(l1 +" - "+l2+" = " +(l1-l2));
        System.out.println(l1 +" * "+l2+" = " +(l1*l2));
    }
    //zad3
    public static void parzysta(int l3) {
        if (l3%2==0) {
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }
    }
}