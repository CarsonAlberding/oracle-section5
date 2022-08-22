import java.util.Scanner;

public class TrafficLightChecker {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int color = sc.nextInt();
        sc.close();
        if (color == 1){
            System.out.println("Next traffic light is green");
        } else if (color == 2) {
            System.out.println("Next traffic light is yellow");
        } else if (color == 3) {
            System.out.println("Next traffic light is red");
        } else {System.out.println("Invalid color");}
    }
}
