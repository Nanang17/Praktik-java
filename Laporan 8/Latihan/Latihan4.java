import java.util.Scanner;
public class Latihan4{
public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	int sum= 0;
	System.out.println("Enter a number (-1 to quit):");
	int num= sc.nextInt();
	do{
	  sum= sum + num;
	 System.out.println("Enter a number (-1 to quit):");
	 num= sc.nextInt();
	}while (num!= -1);
	System.out.println("The sum is " + sum);
}
}
