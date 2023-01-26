public class cp_31_methods {
    static int logics(int x,int y){
        int z;
        if (x>y){
            z=x+y;
        }
        else {
            z=(x+y)*2;
        }
        return z;
    }
    public static void main(String[] args) {
        int a=5;
        int b=7;
        int c;
        c= logics(a,b);
        int a1=2;
        int b1=1;
        int c1;
        c1=logics(a1,b1);
        System.out.println(c);
        System.out.println(c1);
    }
}
