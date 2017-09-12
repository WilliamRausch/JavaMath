package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	// write your code here
    System.out.println("Pleas input your first number");
    Scanner scanner = new Scanner(System.in);
    String usernum1 = scanner.nextLine();
    System.out.println("Pleas input your second number");
    String usernum2 = scanner.nextLine();
    System.out.println(usernum1 + usernum2);
    double operand1 = Double.parseDouble(usernum1);
    double operand2 = Double.parseDouble(usernum2);
    double division;
    double difference;
    double remainder;
    System.out.println(operand1);
    double sum = (operand1 + operand2);
    if(operand1>operand2){
        difference = operand1-operand2;
    }else{
        difference = operand2-operand1;
    }
        if(operand1>operand2){
             division = operand1/operand2;
        }else{
             division = operand2/operand1;
        }
        double multiplication = operand1 * operand2;
        if(operand1>operand2){
            remainder = operand1%operand2;
        }else{
            remainder = operand2%operand1;
        }
        showresults(sum, multiplication, difference, division, remainder);
    }
    public static void showresults(double Sum, double Mult, double Diff, double Div, double Rem){
      System.out.println("The sum is " + Sum);
      System.out.println("The multiplication product is "+ Mult);
      System.out.println("The difference is "+ Diff);
      System.out.println("The division product is "+ Div);
      System.out.println("The remainder from dividing is "+ Rem);
    }
}
