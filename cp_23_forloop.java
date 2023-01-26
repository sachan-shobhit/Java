import java.util.Scanner;
public class cp_23_forloop {
    public static void main(String[] args) {
        System.out.println("Enter Nth no to where you want to print odd numbers");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
//        for (int i=1; i<=a;i=i+2) {
//            System.out.println(i);
//        } for (int i=0; i<=a;i++) {
//            System.out.println(2*i+1);
//        }
        for (int i=a; i>0; i--){
            System.out.println(i);
        }

    }
}
