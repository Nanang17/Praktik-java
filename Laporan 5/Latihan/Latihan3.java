import java.util.Scanner;
public class Latihan3{
public static void main(String[]args){
 String Nama;
 Scanner input=new Scanner(System.in);
 System.out.print("Enter your name : ");
 Nama= input.next();
 if(Nama.equals ("Moe")){
	 System.out.println("You are the king of rock and roll");
 }
 else{
	 System.out.println("You are not the king");
 }
 }
}