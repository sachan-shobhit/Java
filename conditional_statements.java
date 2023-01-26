import java.util.Scanner;
public class conditional_statements {
    public static void main(String[] args) {
        System.out.println("Please Enter Your Age");
        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();
        if (age >= 18 && age<=60)
            System.out.println("Yes!!! You can Drive");
        else if (age < 18)
            System.out.println("You can't Drive yet");
        else
            System.out.println("Please Enter a Valid Age");
    }
}
