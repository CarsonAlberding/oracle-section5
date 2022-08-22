import java.util.Scanner;

public class ColorRange {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a color code: ");
        double wavelength = sc.nextDouble();
        sc.close();

        if (wavelength >= 380 && wavelength < 450){
            System.out.println("The color is violet");
        } else if (wavelength >= 450 && wavelength < 495) {
            System.out.println("The color is blue");
        } else if (wavelength >= 495 && wavelength < 570) {
            System.out.println("The color is green");
        } else if (wavelength >= 570 && wavelength < 590) {
            System.out.println("The color is yellow");
        } else if (wavelength >= 590 && wavelength < 620) {
            System.out.println("The color is orange");
        } else if (wavelength >= 620 && wavelength < 750) {
            System.out.println("The color is red");
        } else {
            System.out.println("The entered wavelength is not a part of the visible spectrum");
        }
    }
}
