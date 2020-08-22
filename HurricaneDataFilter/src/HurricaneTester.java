/**
 * @purpose Tester for Hurricane Class
 *
 * @author Wills Stern
 * @version 8/21/2020
 */
 
import java.io.IOException;
import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class HurricaneTester {

    public static void main(String[] args) throws IOException {

        //read data from text file & put in an array
        File fileName = new File("HurricaneData.txt");
        Scanner inFile = new Scanner(fileName);
        int numValues = 0;

        //count number of lines in text file
        while (inFile.hasNextLine()) {
            inFile.nextLine();
            numValues++;
        }
        inFile.close();


        //initialize arrays based on lines counted in text file
        int[] years = new int[numValues];
        String[] months = new String[numValues];
        int[] pressures = new int[numValues];
        double[] windSpeeds = new double[numValues];
        String[] names = new String[numValues];

        //read and assign data from text file to the arrays
        inFile = new Scanner(fileName);
        int index = 0;
        while (inFile.hasNext()) {
            years[index] = inFile.nextInt();
            months[index] = inFile.next();
            pressures[index] = inFile.nextInt();
            windSpeeds[index] = inFile.nextDouble();
            names[index] = inFile.next();
            index++;
        }
        inFile.close();

        //convert the windspeed, determine categories, calculate sums


        //create a Hurricane ArrayList using the data above

        ArrayList<Hurricane> hurricaneData = new ArrayList<Hurricane>();

        for (int i = 0; i < years.length; i++) {

            hurricaneData.add(new Hurricane(years[i], names[i], months[i], pressures[i], windSpeeds[i]));

        }

        //user prompted for range of years

        Scanner in = new Scanner(System.in);

        System.out.print("Minimum year (Between 1995 and 2019): ");
        int minYear = in.nextInt();
        while (minYear < 1995 || 2019 < minYear) {

            System.out.print("Please enter a VALID minimum year (Between 1995 and 2019): ");
            minYear = in.nextInt();

        }

        System.out.print("Maximum year (Between 1995 and 2019): ");
        int maxYear = in.nextInt();
        while ( (maxYear < minYear) || (2019 < maxYear) ) {

            System.out.print("Please enter a VALID maximum year (Between 1995 and 2019): ");
            maxYear = in.nextInt();

        }

        int minYrIndex = 0;
        boolean minYr = true;
        int maxYrIndex = 0;

        for (int i = 0; i < years.length; i++) {

            if (years[i] == minYear && minYr) {

                minYrIndex = i;
                minYr = false;

            }

            if (years[i] == maxYear) {

                maxYrIndex = i;

            }

        }


        //print the data

        String outFileName = "HurricaneOutputData.txt";
        PrintWriter outFile = new PrintWriter(outFileName);

        int[] max = {Integer.MIN_VALUE, Integer.MIN_VALUE};
        double maxD = Integer.MIN_VALUE;

        int[] min = {Integer.MAX_VALUE, Integer.MAX_VALUE};
        double minD = Integer.MAX_VALUE;

        int i = 0;

        double[] avCatPresSpeed = new double[3];

        int[] minCatPres = new int[2];
        double minSpeed = 0;

        int[] maxCatPres = new int[2];
        double maxSpeed = 0;

        outFile.println("Year\tHurricane\tCategory\tPressure (mb)\tWind Speed (mph)");
        outFile.println("----------------------------------------------------------------");

        for (Hurricane hurr : hurricaneData) {

            if (i >= minYrIndex && i <= maxYrIndex) {
                hurr.setCat();
                avCatPresSpeed[0] += hurr.getCat();
                avCatPresSpeed[1] += hurr.getPressure();
                avCatPresSpeed[2] += hurr.getWindspeed();

                if (hurr.getCat() < min[0]) {
                    min[0] = hurr.getCat();
                    minCatPres[0] = hurr.getCat();
                }
                if (hurr.getCat() > max[0]) {
                    max[0] = hurr.getCat();
                    maxCatPres[0] = hurr.getCat();
                }

                if (hurr.getPressure() < min[1]) {
                    min[1] = hurr.getPressure();
                    minCatPres[1] = hurr.getPressure();
                }
                if (hurr.getPressure() > max[1]) {
                    max[1] = hurr.getPressure();
                    maxCatPres[1] = hurr.getPressure();
                }

                if (hurr.getWindspeed() < minD) {
                    minD = hurr.getWindspeed();
                    minSpeed = hurr.getWindspeed();
                }
                if (hurr.getWindspeed() > maxD) {
                    maxD = hurr.getWindspeed();
                    maxSpeed = hurr.getWindspeed();
                }

                outFile.println(hurr);

            }

            ++i;

        }

        outFile.println("----------------------------------------------------------------");
        outFile.printf("%-20s %-6.2f %11.2f %15.2f\n", "Average:", (avCatPresSpeed[0] / (maxYrIndex - minYrIndex + 1)), (avCatPresSpeed[1] / (maxYrIndex - minYrIndex + 1)), (avCatPresSpeed[2] / (maxYrIndex - minYrIndex + 1)));
        outFile.printf("%-20s %-6d %11d %15.2f\n", "Minimum:", minCatPres[0], minCatPres[1], minSpeed);
        outFile.printf("%-20s %-6d %11d %15.2f\n", "Maximum:", maxCatPres[0], maxCatPres[1], maxSpeed);

        outFile.close();
     }
}