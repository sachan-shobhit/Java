import java.util.Scanner;
public class taking_input_user {
    public static void main(String[] args) {
        System.out.println("Taking input from User");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number 1");
        //int a = sc.nextInt();
        boolean e = sc.hasNextFloat();
        float a = sc.nextFloat();
        System.out.println(e);

//
        System.out.println("Enter Number 2");
//        int b = sc.nextInt();
        boolean d = sc.hasNextInt();
        float b = sc.nextFloat();
         System.out.println(d);
//        int c = a+b;
        float c = a+b;
//
        System.out.println("The Sum of these two Number is -:" +c);
        System.out.println("Enter your First name");
        String str1 = sc.next();
        System.out.print("Your name is -  ");
        System.out.println(str1);
        System.out.println("Enter one line Comment");
        Scanner svc = new Scanner(System.in);
        String str2 = svc.nextLine();
        System.out.println(str2);

    }

}
