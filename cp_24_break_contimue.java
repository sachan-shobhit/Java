public class cp_24_break_contimue {
    public static void main(String[] args) {
        for (int i =0; i<5; i++){
            System.out.println(i);
            System.out.println("JAva is Best");
            if (i==3){
                System.out.println("End of Loop");
                break;
            }
        }
        int a=0;
        while (a<50){
            System.out.println(a);
            System.out.println("Java is Great");
            if (a==2){
                System.out.println("Loop ends in while loop");
                break;
            }
            a++;

        }
        int b;
        for (b=0;b<10;b++){
            if (b==3){
                continue;
            }
            System.out.println(b);
            System.out.println("Java is good");
        }
    }
}
