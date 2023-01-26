import java.util.Scanner;
public class lab_1 {
    public static void main(String[] args)
    {
        System.out.println("Enter three numbers");
        Scanner sc = new Scanner(System.in);
        double a = sc.nextInt();
        double b = sc.nextInt();
        double c = sc.nextInt();
       double s = (a+b+c)/2;
        System.out.println("semi " + s);
        double f = s*(s-a)*(s-b)*(s-c);
        double Area = Math.sqrt(f);
        System.out.println(Area);
        }
}
