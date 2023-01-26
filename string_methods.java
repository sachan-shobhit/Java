import java.util.Locale;

public class string_methods {
    public static void main(String[] args) {
        String name = "Shobhit_Sachan";
        int len = name.length();
        System.out.println("Length of Name :" + len);
        String small = name.toLowerCase();
        System.out.println("Name in Small Letters :" + small);
        String capital = name.toUpperCase();
        System.out.println("Name in Capital letters :" + capital);
        System.out.print("My name from 8th Letter  : ");
        System.out.println(name.substring(8));
        System.out.print("My name Till 6 Letters  : ");
        System.out.println(name.substring(0,7));
        System.out.print("My name when I Change S into A  : ");
        System.out.println(name.replace('S', 'A'));
        System.out.print("My name when I Change Sachan into Singh  : ");
        System.out.println(name.replace("Sachan" , "Singh"));
        System.out.println(name.replace("h" , "exellent"));
        String total = name.replace("h" , "Sex");
        System.out.println(total);
        System.out.println(total.toUpperCase());
        System.out.println("Your name is starts with : Sho- " + name.startsWith("Sh"));
        System.out.println("Your name is starts with : sh- " + name.startsWith("sh"));
        System.out.println("Your name is end with : ta- " + name.endsWith("ta"));
        System.out.println("Your name is end with : an- " + name.endsWith("an"));
        System.out.println("My name's Third Letter is :" + name.charAt(2));
        System.out.println(name.equals("Shobhit"));
        System.out.println(name.equals("Shobhit_Sachan"));
        System.out.println(name.equalsIgnoreCase("shobhit_sachan"));
        String spaces = "This  string contains   double and triple spaces";
        System.out.println(spaces.indexOf("  "));
        System.out.println(spaces.indexOf("   "));
        String letter = "Dear friend, \n\t you are a \n\t Good boy!!! \n\t Thanks Mat bolna \nGaandU\r Thank you";
        System.out.println(letter);

        }
}
