import java.util.Scanner;
public class practice_1 {
    public static void main(String[] args) {
        char grade = 'E';
        grade = (char)(grade - 4);
        System.out.println("My encrypted Grade is :  " + grade);

        grade = (char) (grade + 4);
        System.out.println("My original Grade is :   " + grade);


        System.out.println("Enter a Integer Number to check");
        Scanner sc = new Scanner(System.in);
        int b = 23;
        int a = sc.nextInt();
        System.out.print("your Number is Greater than my number : ");
        System.out.println(a>b);

    }
}
