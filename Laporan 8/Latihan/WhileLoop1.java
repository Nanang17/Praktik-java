import java.util.Scanner;
public class WhileLoop1{
public static void main(String[]args){
	Scanner sc= new Scanner(System.in);
	int sum= 0;
	System.out.println("Enter a number (-1 to quit):");
	int num= sc.nextInt();
	while (num!= -1){
	 sum= sum + num;
	 System.out.println("Enter a number (-1 to quit):");
	 num= sc.nextInt();
	}
	System.out.println("The sum is " + sum);
}
}
