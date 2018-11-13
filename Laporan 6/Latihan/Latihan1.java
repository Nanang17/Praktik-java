import java.util.Scanner;
public class Latihan1{
public static void main(String[]args){
 int harga, rating;
 Scanner sc= new Scanner(System.in);
 System.out.print("Masukkan harga tiket: $");
 harga= sc.nextInt();
 System.out.print("Masukkan rating film: ");
 rating= sc.nextInt();
 if(harga>=12){
	 if(rating==5){
	 System.out.println("I'm interested in watching the movie");
 }
 }
 else{
	System.out.println("I am not interested in watching the movie");
 }
 }
}
