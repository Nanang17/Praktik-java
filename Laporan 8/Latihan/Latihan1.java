import java.util.Scanner;
public class Latihan1{
public static void main(String[]args){
	int integer;
	Scanner sc= new Scanner(System.in);
	System.out.print("Type a non-negatif integer: ");
	integer= sc.nextInt();
	while (integer<0){
	System.out.print("Invalid number, try again: ");
	integer= sc.nextInt();
	}
	System.out.println("The square of "+ integer +" is "+integer*integer);
}
}
