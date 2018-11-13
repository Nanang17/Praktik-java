import java.util.Scanner;
public class Latihan1{
public static void main(String[]args){
 int nAge;
 boolean drivingUnderAge;
 Scanner input=new Scanner(System.in);
 System.out.println("Enter your Age");
 nAge= input.nextInt();
 drivingUnderAge= false;
 if(nAge<=18){
	 drivingUnderAge= true;
}
	 System.out.println(drivingUnderAge);
}
}

