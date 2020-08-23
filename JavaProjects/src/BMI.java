
/**
 * This program calculates the user's BMI given their weight and height, and tells them what category of health they are in.
 *
 * @author Wills Stern
 * @version 6/7/2020
 */
import java.util.Scanner;
public class BMI {
    public static void WeightStatus(double a) {
        if (a < 18.5) {
            System.out.println("Category: Underweight");
        } else if (a < 25.0) {
            System.out.println("Category: Normal/Healthy Weight");
        } else if (a < 29.9) {
            System.out.println("Category: Overweight");
        } else if (a >= 29.9) {
            System.out.println("Category: Obese");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Please enter your full name (first last): ");

        String fullName = in.nextLine();

        System.out.print("Please enter your height in feet and inches (e.g. 6 1): ");
        String feetHeight = in.next();
        String inchesHeight = in.next();

        System.out.print("Please enter your weight in pounds: ");
        String weightPoundsString = in.next();

        //Parse numeric input
        int heightInFeet = Integer.parseInt(feetHeight);
        int heightInInches = Integer.parseInt(inchesHeight);
        int height = heightInFeet * 12 + heightInInches;
        int weightLbs = Integer.parseInt(weightPoundsString);

        //Convert height and weight
        double heightCm = 2.54 * height;
        double heightMeter = heightCm / 100;
        double weightKg = 0.45359237 * weightLbs;
        double BMI = weightKg / (Math.pow(heightMeter, 2));

        //Display results
        System.out.println("\n\n");
        System.out.println("==============");
        System.out.println("BMI Calculator");
        System.out.println("==============\n");
        System.out.println("Name: " + fullName);
        System.out.println("Height: " + heightMeter + " meters");
        System.out.println("Weight: " + weightKg + " kg");
        System.out.println("BMI: " + BMI);
        WeightStatus(BMI);
    }
}