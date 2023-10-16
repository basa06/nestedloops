public class   Main {
    public static void main(String[] args) {
        String [] flights ={"AY664","BA047", "LH554"};
        String []airlines ={"AY","UA","LH"};
        for (String a :airlines)
        {
            System.out.println(a+":");
            for (String f : flights){
                if  (f.startsWith(a))
                    System.out.println(f+" ");
                System.out.println();
            }
        }
    }
}