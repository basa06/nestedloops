public class Main {
    public static void main(String[] args) {
        int [] numbers= {7,-5,11,6};
        for (int i = 0;  i< numbers.length; i++){
            for (int j= i+1; j<numbers.length;j++){
                if (numbers[j]<numbers[i]){
                    int t = numbers[i];
                    numbers[i]= numbers[j];
                    numbers[j]=t;
                }
            }

        }
        for (int n : numbers)
            System.out.println(n+" ");

    }
}