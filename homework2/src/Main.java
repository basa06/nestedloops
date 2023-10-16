public class Main {
    public static void main(String[] args) {
       boolean flag = false;
       int[]A= {1,2,3,4,5};
       int[]B = {1,2,7,8};
       for (int N=0; N<4 &&!flag;N++){
           for ( int M = 0; M<4; M++){
               if  (A[N]==B[M]) {
                   flag = true;
                   break;//break out of nested loops one at a time
               }



           }
       }
        System.out.println(flag);
    }
}