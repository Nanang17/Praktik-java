import java.util.Scanner;
public class Latihan2{
public static void main(String[]args){
 int number;
 Scanner sc= new Scanner(System.in);
 System.out.print("Enter a number :");
 number= sc.nextInt();
        System.out.println((number%2==0 && number<=10)?"number is even":((number%2!=0 && number<=10)?"number is odd":"error index"));

}
}