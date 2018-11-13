import java.util.Scanner;
public class Latihan{
public static void main(String[]args){
	double weight, height;
	double BMI;
	Scanner input= new Scanner (System.in);
	System.out.print("Enter your weight in pounds:");
	weight=(int)input.nextDouble();
	System.out.print("Enter your height in inches:");
	height=(int)input.nextDouble();
	height= Math.pow(height,2);
	BMI= ((weight*70)/height);
	System.out.println("Your body mass index is "+ BMI);
}
}