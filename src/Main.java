public class Main {
    public static void main(String[] args) {
        final int R = 8;//number of rows
        for (int row = 1; row<=R; row++)
        {
            String ch;
            if (row %2==0)
                ch="-";
            else
                ch="*";
            for (int sym = 1; sym<=row ; sym++){
                System.out.print(ch);
            }
            System.out.println();
        }
    }
}