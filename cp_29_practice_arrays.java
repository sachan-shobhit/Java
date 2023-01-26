public class cp_29_practice_arrays {
    public static void main(String[] args) {
//        float[] five = {19.12f,28.02f,15.23f,25.06f,36.0f};
////        float sum =five[0]+five[1]+five[2]+five[3]+five[4];
//        float sum=0;
//        for (float elements:five){
//            sum=sum + elements;
//        }
//        System.out.println(sum);

//        float [] five = {19.12f,28.02f,15.23f,25.06f,36.0f};
//        float num = 28.02f;
//        boolean pre = false;
//        for (float elements:five) {
//            if (num == elements) {
//                pre = true;
//                break;
//            }
//        }
//            if (pre) {
//                System.out.println("you number is present in the array");
//            } else {
//                System.out.println("you number is not present in the array");
//            }
        /*
        float[] five = {19.12f,28.02f,53.25f,15.23f,25.06f,36.0f};
        float sum=0;
        for (float elements:five){
            sum=sum + elements;
        }
        float avg = sum/five.length;
        System.out.println(avg);
        */

//        int [][] mat1  ={ {1,2,3},
//                          {4,5,6}};
//        int [][] mat2  ={ {7,8,9},
//                          {10,11,12}};
//        int [][] res  ={ {0,0,0},
//                         {0,0,0}};
//        for (int i=0;i< mat1.length;i++){
//            for (int j=0;j< mat1[i].length;j++){
////                System.out.println("the sum of two matices is");
//                res[i][j]=mat1[i][j]+mat2[i][j];
////                System.out.println(res[i][j]);
//            }
//        }
//        for (int i=0;i< mat1.length;i++) {
//            for (int j = 0; j < mat1[i].length; j++) {
////                System.out.println("the sum of two matices is");
//                System.out.print(res[i][j] + " ");
//                res[i][j] = mat1[i][j] + mat2[i][j];
//            }
//            System.out.println(" ");
//        }

//        float[] five = {19.12f,28.02f,15.23f,25.06f,36.0f};
//        for (int i = five.length;i>0;i--){
//            System.out.println(five[i-1]);
//        }

//        int [] arr={1,2,3,4,5,6};
//        int l = arr.length;
//        int temp;
//        int n = Math.floorDiv(l,2);
//        for (int i=0; i<n; i++){
//            temp =arr[i];
//            arr[i]=arr[l-i-1];
//            arr[l-i-1]=temp;
//        }
//        for (int element:arr){
//            System.out.print(element + " ");
//        }

//        float[] five = {19.12f,258.02f,15.23f,25.06f,36.0f};
//        float max=0.0f;
//        for (float e:five){
//            if (e>max){
//                max=e;
//            }
//        }
//        System.out.println(max);

//        float[] five = {19.12f,-258.02f,15.23f,25.06f,36.0f};
//        float min=Integer.MAX_VALUE;
//        for (float e:five){
//            if (e<min){
//                min=e;
//            }
//        }
//        System.out.println(min);
        boolean issorted = true;
        float[] five = {19.12f,25.02f,150.23f,250.06f,360.0f};
        for (int i =0;i< five.length-1;i++ ){
            if (five[i]>five[i+1]){
                issorted=false;
                break;
            }
        }
        if (issorted){
            System.out.println("The array is sorted");
        }
        else
            System.out.println("The given Array is not sorted");
    }
}
