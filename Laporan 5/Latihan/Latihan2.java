import java.util.Scanner;
public class Latihan2{
public static void main(String[]args){
 int Nmr;
 Scanner input=new Scanner(System.in);
 System.out.print("Enter a number:");
 Nmr= input.nextInt();
 if(Nmr%2==0){
	 System.out.println("The Num is even " +Nmr);
}
else{
	 System.out.println("The Num is odd " +Nmr);
 }
 }
}