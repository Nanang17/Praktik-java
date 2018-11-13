import java.util.Scanner;
public class Nanang{
public static void main(String[]args){
	int NIM;
	String Nama, Jurusan;
	double IPK;
Scanner keyboard=new Scanner(System.in);
System.out.println("Masukkan Nama");
Nama= keyboard.next();
System.out.println("Masukkan NIM");
NIM= keyboard.nextInt();
System.out.println("Masukkan Jurusan");
Jurusan= keyboard.next();
System.out.println("Masukkan IPK");
IPK= keyboard.nextDouble();
System.out.println("===========================");
System.out.println("     Nama:"+Nama           );
System.out.println("     NIM:"+NIM             );
System.out.println("     Jurusan:"+Jurusan     );
System.out.println("     IPK:"+IPK             );
System.out.println("===========================");
}
}