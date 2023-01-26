public class cp_17_logical {
    public static void main(String[] args) {
        System.out.println("For logical AND");
        boolean a=true;
        boolean b=false;
        boolean c=true;
        if (a && b && c) {
            System.out.println("Y");
        }  else{
            System.out.println("N");
        }System.out.println("For logical OR");

        if (a || b || c) {
            System.out.println("Y");
        }  else{
            System.out.println("N");
        }
        System.out.println("For logical NOT");
        System.out.println("Not a is : " +!a);
        System.out.println("Not b is : " +!b);
        System.out.println("Not c is : " +!c);
        }

    }

