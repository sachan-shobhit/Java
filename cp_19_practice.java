import java.util.Scanner;
public class cp_19_practice {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
//        System.out.println("Enter marks of Each Subject out of  100");
//        System.out.println("Enter mark of sub1");
//        int sub1 = sc.nextInt();
//        System.out.println("Enter mark of sub2");
//        int sub2 = sc.nextInt();
//        System.out.println("Enter mark of sub3");
//        int sub3 = sc.nextInt();
//        System.out.println("Enter mark of sub4");
//        int sub4 = sc.nextInt();
//        float per = (sub1+sub2+sub3+sub4)/4;
//        if (per>=40 && sub1>=33 && sub2>=33 && sub3>=33 && sub4>=33){
//            System.out.println("Yes you are pass");
//
//        }
//        else {
//            System.out.println("Sorry you are Fail");
//        }
//        System.out.println("And your percentage is :" + per);
//        System.out.println("Enter your annual income in Lakh");
        //Scanner sc = new Scanner(System.in);
//        float in = sc.nextFloat();
//        float tot, tax;
//        if (in>=2.5 && in<=5){
//            System.out.println("Your tax percentage is 5%");
//            tax = in*0.05f;
//            System.out.println("your total tax is : "+ tax + "Lakhs");
//        }else if (in>5 && in<=10){
//            System.out.println("Your tax percentage is 20%");
//            tax = in*0.2f;
//            System.out.println("your total tax is : "+ tax + "Lakhs");
//        }if (in>=10){
//            System.out.println("Your tax percentage is 30%");
//            tax = in*0.3f;
//            System.out.println("your total tax is : "+ tax + "Lakhs");
//        }
//        else {
//            System.out.println("Your tax is not applicable");
//        }
//        int day;
//        System.out.println("Enter day in number");
//        Scanner sc = new Scanner(System.in);
//        day = sc.nextInt();
//        switch (day) {
//            case 1 -> System.out.println("Day of the week is Monday");
//            case 2 -> System.out.println("Day of the week is Tuesday");
//            case 3 -> System.out.println("Day of the week is Wednesday");
//            case 4 -> System.out.println("Day of the week is Thursday");
//            case 5 -> System.out.println("Day of the week is Friday");
//            case 6 -> System.out.println("Day of the week is Saturday");
//            case 7 -> System.out.println("Day of the week is Sunday");
//            default -> System.out.println("OOPs!! You entered number out of week");
//        }
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter a Year to check the year is leap or not");
//      int year = sc.nextInt();
//        if (year%4==0){
//            System.out.println("Entered year is a leap year");
//        }
//        else {
//            System.out.println("Entered year is not a Leap year");
//        }

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the URL of website to check");
        String web = sc.nextLine();
        if (web.endsWith("com")){
            System.out.println("Your entered website is a COMMERCIAL Website");
        } else if (web.endsWith(".in")) {
            System.out.println("Your entered website is a Indian Website");
        } else if (web.endsWith(".org")) {
            System.out.println("Your entered website is a ORGANISATION Website");
        }
        else
            System.out.println("Please enter a correct and Proper URL");


    }
}
