package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {
    double tempCelcius = 100;
    double tempFahrenheit = 32;
    System.out.println("Celcius " + tempCelcius + " = " + convertC2F(tempCelcius) + " Fahrenheit");
    System.out.println("Fahrenheit " + tempFahrenheit + " = " + convertF2C(tempFahrenheit) + " Celcius");
  }

  public static double convertC2F(double celcius) {
    return celcius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
