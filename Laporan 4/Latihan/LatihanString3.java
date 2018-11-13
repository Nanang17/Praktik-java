public class LatihanString3{
public static void main(String[]args){
 String phoneNum= "0823-9473-669";
 int idx1= phoneNum.indexOf('-');
 System.out.println("index of first dash: "+idx1);
 int idx2= phoneNum.indexOf('-',4);
 System.out.println("second dash index: "+idx2);
 }
}