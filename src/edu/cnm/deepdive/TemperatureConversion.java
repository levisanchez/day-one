package edu.cnm.deepdive;

public class TemperatureConversion {

  public static void main(String[] args) {
    double c = 100;
    double f = 32;
    System.out.println("Celcius " + c + " = " + convertC2F(c) + " Fahrenheit");
    System.out.println("Fahrenheit " + f + " = " + convertF2C(f) + " Celcius");
  }

  public static double convertC2F(double celcius) {
    return celcius * 9 / 5 + 32;
  }

  public static double convertF2C(double fahrenheit) {
    return (fahrenheit - 32) * 5 / 9;
  }

}
