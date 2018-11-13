import java.util.Scanner;
public class Latihan3{
public static void main(String[]args){
	Scanner in= new Scanner(System.in);
	int i= 0, numInputs= 10, input= 0, sum= 0;
	System.out.println("Enter 10 Numbers");
	input= in.nextInt();
	do{
	input= in.nextInt();
	i++;
	sum += input;
	}while(i<numInputs);
	System.out.println("The sum of numbers : "+sum);
}
}
