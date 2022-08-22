import java.util.Scanner;

public class WatchMovie {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the movie ticket price: ");
        double price = sc.nextDouble();
        System.out.print("Enter the movie rating: ");
        int rating = sc.nextInt();
        sc.close();
        if (price >= 12.0 && rating == 5){
            System.out.println("I'm interested in watching the movie.");
        } else {
            System.out.print("I'm not interested");
        }
        

    }
}
