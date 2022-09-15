package ru.stqa.pft.sandbox;

public class test_program {
  public static void main(String[] args) {
    hello("kek");
    hello("lol");
    System.out.println(area(6));
  }

  public static void hello(String somebody) {
    System.out.println("Hello, " + somebody);
  }

  public static double area(double l) {
    return l * l;
  }

}