import java.util.Scanner;

public class ComputeFare {

    public static void main(String args[]) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the age: ");
        int age = keyboard.nextInt();
        keyboard.close();
        int fare;

        if (age < 11){
            fare = 3;
        } else if (age > 11 && age < 65) {
            fare = 5;
        } else {
            fare = 3;
        }
        System.out.println("Fare is $"+fare);

    }
}
