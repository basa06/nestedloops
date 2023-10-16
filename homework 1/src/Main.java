public class Main {
    public static void main(String[] args) {
        int [] nums = {1,2,3,4,5};
        for (int i = 0; i<5; i++) {
            for (int j : nums)
                System.out.print(j + " ");
            System.out.println();
        }
        int []nums2 = {1,2,3,4,5,6,7,8,9};

        for  ( int j = 0;j<5;j++){//printing the 5 numbers, but i needs to increase
            for (int i = 0; i <6; i++)
            System.out.print(nums2[j]+" ");

        }//add n because each row should increase by n
    }
}