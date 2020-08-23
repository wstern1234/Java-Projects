/**
 * @purpose Hurricane Object Class
 *
 * @author Wills Stern
 * @version 8/21/2020
 *
 */
 

public class Hurricane {
   private String name, month;
   private int year, cat;
   private int pressure;
   private double windspeed;

     
   
   //constructor - all private instance variables initialized
   public Hurricane(int y, String n, String m, int p, double w) {
      this.year = y;
      this.name = n;
      this.month = m;
      this.pressure = p;
      this.windspeed = w;
   }

   //accessor for year
   public int getYear() {
      return year; 
   }

   //accessor for name
   public String getName() {
      return name; 
   }
   
   //accessor for month
   public String getMonth() {
      return month;  
   }
   
   //accessor for pressure
   public int getPressure() {
      return pressure;
   }
   
   //accessor for windspeed
   public double getWindspeed() {
      return (windspeed * 1.15078);
   }

   public int getCat() {
      return cat;
   }
   
   //mutator for year
   public void setYear(int y) {
      year = y;
   }
   
   //mutator for name
   public void setName(String n) {
      name = n;
   }
   
   //mutator for month
   public void setMonth(String m) {
      month = m;
   }
   
   //mutator for pressure
   public void setPressure(int p) {
      pressure = p;
   }
   
   //mutator for windspeed
   public void setWindspeed (double w) {
      windspeed = w;
   }


   public void setCat() {

      if (windspeed >= 157) {

         cat = 5;

      } else if (windspeed >= 130) {

         cat = 4;

      } else if (windspeed >= 111) {

         cat = 3;

      } else if (windspeed >= 96) {

         cat = 2;

      } else {

         cat = 1;

      }

   }


   public String toString() {

      return String.format("%-7d %-12s %-6d %11d %15.2f", getYear(), getName(), getCat(), getPressure(), getWindspeed());

   }

}