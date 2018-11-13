import java.util.Scanner;
public class TestCalculator{
public static void main(String[]args){
	Scanner keyboard=new Scanner(System.in);
	Calculator calc=new Calculator();
	System.out.println("Enter the originalPrice:");
	Double originalPrice=keyboard.nextDouble();
	System.out.println("Person:$"+calc.findTotal(originalPrice));
	}
}