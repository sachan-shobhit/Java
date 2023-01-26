import java.util.Scanner;
public class kmtomile {
    public static void main(String[] args) {
//        int a = 6;
//        int b = 94;
//        int d = 65;
//        int c = a+b+d;
//        System.out.println(c);
//        System.out.println("Enter your name");
//        Scanner sc =  new Scanner(System.in);
//        String name = sc.nextLine();
//        System.out.println("Hello " + name + " Have a good day");
        System.out.println("Enter KM to change into Miles");
        Scanner km = new Scanner(System.in);
        float a = km.nextFloat();
        float miles = a*0.621371F;
        System.out.println("Your kilometers in Miles = " + miles);

    }
}