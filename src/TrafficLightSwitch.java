import java.util.Scanner;

public class TrafficLightSwitch {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        int color = sc.nextInt();
        sc.close();
        switch (color){
            case 1: System.out.println("Next traffic light is green"); break;
            case 2: System.out.println("Next traffic light is yellow"); break;
            case 3: System.out.println("Next traffic light is red"); break;
            default: System.out.println("Invalid color"); break;
        }
       
    }

}
