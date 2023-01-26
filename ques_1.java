import java.util.Scanner;
public class ques_1 {
    public static void main(String[] args) {
        System.out.println("Enter the marks of Student out of Hundred");
        System.out.println("Subject 1");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("Subject 2");
        int b = sc.nextInt();
        System.out.println("Subject 3");
        int c = sc.nextInt();
        System.out.println("Subject 4");
        int d = sc.nextInt();
        System.out.println("Subject 5");
        int e = sc.nextInt();
        float f = (a + b + c + d +e )/5F;
        System.out.println("Percentage of Student is : " + f + "%");
        if(f>60)
        {
            System.out.println("Congratulations You ara First division");
    } else if (f>45 && f<60) {
            System.out.println("You are second division");
        } else if (f<45 && f>=40) {
            System.out.println("tou are third division");
        }
        else
            System.out.println("Sorry you are Fail");
    }
    }
