import java.util.Scanner;
public class cp_18_switch_case {
    public static void main(String[] args) {
        int age;
        System.out.println("Enter your age");
        Scanner sc = new Scanner(System.in);
        age = sc.nextInt();
        switch (age){
            case 18:
                System.out.println("you are going to become an adult");
                break;
            case 23:
                System.out.println("you are going for job");
                break;
            case 60:
                System.out.println("you are going to retire");
                break;
            default:
                System.out.println("Enjoy your life");
        }
        System.out.println("Switch case ho gya h");
        String var ="Shiv";
        switch (var) {
            case "Gaurav" -> System.out.println("you are going to become an adult");
            case "Shobhit" -> System.out.println("you are going for job");
            case "Shiv" -> System.out.println("you are going to retire");
            default -> System.out.println("Enjoy your life");
        }
    }
}
