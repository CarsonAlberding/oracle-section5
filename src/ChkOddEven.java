import java.util.Scanner;

public class ChkOddEven {

    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        sc.close();

        if (num % 2 == 0){
            System.out.println("The number is even "+num);
        } else{
            System.out.println("The number is odd "+num);
        }




        
    }
}
