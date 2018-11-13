import java.util.Scanner;
public class DaysMonth{
public static void main(String[]args){
	Scanner in= new Scanner(System.in);
	System.out.print("Enter your number of month: ");
	int month= in.nextInt();
	switch (month){
	case 1: case 3: case 5: case 7:
	case 8: case 10: case 12:
		System.out.println("31 days in a month");
		break;
	case 2: 
		System.out.println("not leap year 28 days in the month");
		System.out.println("leap year 29 days in the month");
		break;
	default:
		System.out.println("30 days in a month");
}
}
}
