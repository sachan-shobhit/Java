public class cp_28_multi_array {
    public static void main(String[] args) {
        int [][] flats ;
        flats = new int[2][4];
        flats [0][0]=101;
        flats [0][1]=102;
        flats [0][2]=103;
        flats [0][3]=104;
        flats [1][0]=201;
        flats [1][1]=202;
        flats [1][2]=203;
        flats [1][3]=204;
        for (int i=0;i< flats.length;i++) {
            for (int j = 0; j < flats[i].length; j++) {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
        String [][] names ;
        names = new String[2][4];
        names [0][0]="Vaibhav";
        names [0][1]="Subh";
        names [0][2]="Anuradha";
        names [0][3]="Goru";
        names [1][0]="Abhinav";
        names [1][1]="Aditya";
        names [1][2]="Sonu";
        names [1][3]="PagaL";
        for (int i=0;i< names.length;i++) {
            for (int j = 0; j < names[i].length; j++) {
                System.out.print(names[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
