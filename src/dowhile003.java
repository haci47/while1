public class dowhile003 {
    public static void main(String[] args) {
        int i =4;
        int oddsum =0;
        int evensum =0;
        do{
            if (i % 2 == 0) {
                evensum +=i;
                System.out.println("evensum :"+evensum);
            } oddsum += i;
            i++;
            System.out.println("oddsum :"+oddsum);
        }while (i < 21);
        }
    }

