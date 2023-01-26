import java.util.Scanner;
public class rock_paper {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        float a = (float) (Math.random()*3F);
        int b = (int) a;
        System.out.println(a);
        System.out.println(b);
        System.out.println("Choose \n1 for Stone \n2 for Paper \n3 for Scissors");
        int u = sc.nextInt();
//        System.out.println(u);

    }
}
