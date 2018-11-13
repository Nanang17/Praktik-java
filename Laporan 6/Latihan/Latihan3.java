import java.util.Scanner;
public class Latihan3{
public static void main(String[]args){
 int age;
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter Your Age: ");
 age= sc.nextInt();
 if(age<11){
	 System.out.println("your fare is $3");
}
else if((age>11) && (age<65)){
	System.out.println("Your fare is $5");
}
else{
	System.out.println("your fare is $8");
}
}
}