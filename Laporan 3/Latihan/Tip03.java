public class Tip03{
public static void main(String[]args){
	double tax=0.05;
	double tip=0.15;
	double person1=10;
	double total1=person1+(person1*(tax+tip));
	System.out.println("Person 1:$"+total1);
	double person2=12;

	double total2=person2+(person2*(tax+tip));
	System.out.println("Person 2:$"+total2);
	double person3=9;

	double total3=person3+(person3*(tax+tip));
	System.out.println("Person 3:$"+total3);
	double person4=8;

	double total4=person4*(1+tax+tip);
	System.out.println("Person 4:$"+total4);
	double person5=7;

	double total5=person5*(1+tax+tip);
	System.out.println("Person 5:$"+total5);
	double person6=15;

	double total6=person6*(1+tax+tip);
	System.out.println("Person 6:$"+total6);
	double person7=11;
	double total7=person7*(1+tax+tip);
	System.out.println("Person 7:$"+total7);

	double person8=30;
	double total8=person8*(1+tax+tip);
	System.out.println("Person 8:$"+total8);
	}
}