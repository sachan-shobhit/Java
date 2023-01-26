import java.util.Scanner;
public class neWgame {

        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            int Mynum = (int)(Math.random()*100);
            int userNum;

            do {
                System.out.println("Guess a Number(1 - 100)");
                userNum = sc.nextInt();

                if (userNum == Mynum) {
                    System.out.println("WoooHoooo   Correct ");
                    break;
                } else if (userNum > Mynum) {
                    System.out.println("Your number is Too large");

                }
                else {
                    System.out.println("You Number is Too Small");
                }
            } while (userNum >= 0);
            System.out.println("My Number Was");
            System.out.println(Mynum);


        }
    }

