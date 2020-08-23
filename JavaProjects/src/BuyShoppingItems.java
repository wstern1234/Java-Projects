/*
* The purpose of this program is to simulate shopping online to buy items.
*
* @author Wills Stern
* @version 6/5/2020
*/

import java.util.Scanner;
public class BuyShoppingItems {
    public static String GetDate(String date) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter today's date (mm/dd/yyyy): ");

        date = userInput.nextLine();
        date = date.replace('/', '-');
        return date;
    }

    public static String GetItemName(String iName) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the item's name: ");

        iName = userInput.nextLine();
        return iName;
    }

    public static String GetItemPrice(String iPrice) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the item's price: ");

        iPrice = userInput.nextLine();
        return iPrice;
    }

    public static String GetItemAmount(String iAmount) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter the amount of the item being bought: ");

        iAmount = userInput.nextLine();
        return iAmount;
    }

    public static String GetCardNumber(String cNumber, String cNumDigits) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your debit card number (nnnn-nnnn-nnnn-nnnn): ");

        cNumber = userInput.nextLine();
        cNumDigits = cNumber.substring((cNumber.length()) - 4, (cNumber.length()));
        return cNumber;
    }

    public static String GetPIN(String pNumber) {
        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your PIN: ");

        pNumber = userInput.nextLine();
        return pNumber;
    }

    public static void main(String[] args) {
        String currentDate = "";
        String itemName = "";
        String itemPrice = "";
        String itemAmount = "";
        String cardNumber = "";
        String card4Digits = "";
        String PIN = "";
        double salesTax = 0.15;
        double priceTotal = 0.0;


        Scanner userInput = new Scanner(System.in);
        System.out.print("Please enter your full name (first last): ");

        String firstName = userInput.next();
        String firstInitial = firstName.substring(0, 1);
        String lastName = userInput.nextLine();


        GetDate(currentDate);
        GetItemName(itemName);
        GetItemPrice(itemPrice);
        GetItemAmount(itemAmount);
        GetCardNumber(cardNumber, card4Digits);
        GetPIN(PIN);



        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("Your Receipt:\n");

        System.out.println("\tName: " + firstInitial + ". " + lastName);
        System.out.println("\tPurchase Date: " + currentDate);
        System.out.println("\tDebit Card #: #### - #### - #### - " + card4Digits);
        System.out.println("\tOrder Code: " + lastName + currentDate.replace('-', '*') + firstName + "\n");

        System.out.println("\tItem Name: " + itemName);
        System.out.println("\tItem Cost: $" + itemPrice);
        System.out.println("\tNumber of Items Purchased: " + itemAmount);
        System.out.println("\tSales Tax: " + salesTax);
        priceTotal = (Double.parseDouble(itemPrice)) * (Integer.parseInt(itemAmount)) * (1 - salesTax);
        System.out.println("\tTotal: " + (priceTotal));
        System.out.println("\n\nThank you for shopping here, please come again!");
    }
}