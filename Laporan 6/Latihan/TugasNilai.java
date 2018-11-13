import java.util.Scanner;
public class TugasNilai{
public static void main(String[]args){
 int nNIM, tugas, UTS, UAS, nakhir;
 Scanner sc= new Scanner(System.in);
 System.out.print("Masukkan NIM: ");
 nNIM= sc.nextInt();

 System.out.print("Masukkan Nilai tugas: ");
 tugas= sc.nextInt();
 System.out.print("Masukkan Nilai UTS: ");
 UTS= sc.nextInt();
 System.out.print("Masukkan Nilai UAS: ");
 UAS= sc.nextInt();
 nakhir= ((tugas*30/100)+(UTS*30/100)+(UAS*40/100));
 System.out.println("Nilai akhir: "+nakhir);
 if(nakhir>=80){
	 System.out.println("Nilai A");
 }
 else if(nakhir>=70 && nakhir<=79){
	 System.out.println("Nilai B");
}
else if(nakhir>=60 && nakhir<=69){
	 System.out.println("Nilai C");
}
else if(nakhir>=50 && nakhir<=59){
	 System.out.println("Nilai D");
}
else{
	System.out.println("Nilai E");
}
}
}