import java.util.Scanner;
public class Latihan6{
public static void main(String[]args){
	String hati;
	String b= "marah";
	System.out.println("Daftar suasana hati\n1. Senang\n2. Marah");
	Scanner sc= new Scanner(System.in);
	System.out.print("Bagaimana suasana hati adik? : ");
	hati= sc.next();
	while (hati.equals(b)){
	System.out.print("Senyum dong . . .:)\nBagaimana suasana hati adik? : ");
	hati= sc.next();
	}
	System.out.println("Yeah. . . Gitu kan manis");
}
}
