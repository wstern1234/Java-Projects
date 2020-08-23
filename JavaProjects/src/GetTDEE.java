/**
 * This program calculates the user's TDEE based on a multitude of factors.
 *
 * @author Wills Stern
 * @version 6/7/2020
 */

import java.util.Scanner;

public class GetTDEE {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double userTDEE = 0.0;


        System.out.print("Please type in your name: ");
        String userName = in.nextLine();



        System.out.print("Please enter your gender (M/F): ");
        String userGender = in.next();

        if ( !(userGender.equalsIgnoreCase("M")) && !(userGender.equalsIgnoreCase("F")) ) {
            System.out.print("Please enter your gender given at birth (M/F): ");
            userGender = in.next();
        }

        System.out.print("Please enter your BMR: ");
        String BMRString = in.next();
        double userBMR = Double.parseDouble(BMRString);




        //activity level

        System.out.println("Activity levels:\n");
        System.out.println("\t[A] Resting (Sleeping, Reclining)\n");
        System.out.println("\t[B] Sedentary (Minimal Movement)\n");
        System.out.println("\t[C] Light (Office work, Sitting)\n");
        System.out.println("\t[D] Moderate (Light manual labor)\n");
        System.out.println("\t[E] Very Active (Hard manual labor)\n");
        System.out.println("\t[F] Extremely Active (Heavy manual labor)\n");

        System.out.print("Please enter the letter corresponding with your activity level: ");
        String activityLevel = in.next();

        /*if (   !(activityLevel.equalsIgnoreCase("A"))  &&  !(activityLevel.equalsIgnoreCase("B"))  &&  !(activityLevel.equalsIgnoreCase("C"))  &&  !(activityLevel.equalsIgnoreCase("D"))  &&  !(activityLevel.equalsIgnoreCase("E"))  &&  !(activityLevel.equalsIgnoreCase("F"))   ) {

        }*/

        System.out.println("============");
        System.out.println("TDEE of User");
        System.out.println("============");

        System.out.println("Name: " + userName);

        System.out.println("Gender: " + userGender);

        System.out.println("BMR: " + userBMR + " calories");

        System.out.println("Activity Level: " + activityLevel);

        if (userGender.equalsIgnoreCase("M")) {

            if (activityLevel.equalsIgnoreCase("A")) {
                userTDEE = userBMR;
            } else if (activityLevel.equalsIgnoreCase("B")) {
                userTDEE = userBMR * 1.3;
            } else if (activityLevel.equalsIgnoreCase("C")) {
                userTDEE = userBMR * 1.6;
            } else if (activityLevel.equalsIgnoreCase("D")) {
                userTDEE = userBMR * 1.7;
            } else if (activityLevel.equalsIgnoreCase("E")) {
                userTDEE = userBMR * 2.1;
            } else if (activityLevel.equalsIgnoreCase("F")) {
                userTDEE = userBMR * 2.4;
            }

        } else if (userGender.equalsIgnoreCase("F")) {

            if (activityLevel.equalsIgnoreCase("A")) {
                userTDEE = userBMR;
            } else if (activityLevel.equalsIgnoreCase("B")) {
                userTDEE = userBMR * 1.3;
            } else if (activityLevel.equalsIgnoreCase("C")) {
                userTDEE = userBMR * 1.5;
            } else if (activityLevel.equalsIgnoreCase("D")) {
                userTDEE = userBMR * 1.6;
            } else if (activityLevel.equalsIgnoreCase("E")) {
                userTDEE = userBMR * 1.9;
            } else if (activityLevel.equalsIgnoreCase("F")) {
                userTDEE = userBMR * 2.2;
            }



        }


        System.out.println("TDEE: " + userTDEE + " calories");


    }
}