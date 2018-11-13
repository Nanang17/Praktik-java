public class ShortCircuitAnd{
public static void main(String[]args){
 int x= 0;
 int y= 2;
 boolean b;
 b= (x!=0) && ((y/x)>2); // mengapa tidak terjadi error di baris ini
 System.out.println(b);
 }
}