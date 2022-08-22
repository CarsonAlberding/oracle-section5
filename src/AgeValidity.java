import java.util.Scanner;

public class AgeValidity {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = sc.nextInt();
        sc.close();

        boolean drivingUnderAge;
        drivingUnderAge = false;
        if (age < 18) {
            drivingUnderAge = true;
        }

        System.out.println(drivingUnderAge);


       
    }
}
