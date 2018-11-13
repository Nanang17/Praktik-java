public class Latihan5{
public static void main(String[]args){
	int counter= 0;
	while (counter<10){
	 counter++;
	 if(counter%2==0){
	  continue;
	 }
	 if(counter>7){
	  break;
	 }
	 System.out.print(counter+"\t");
	}
}
}
