import java.util.Scanner;
public class Tugas {
    public static void main(String[]args){
		double IPK;
        int teori,praktik,praktikum,sppVar,tAkhir, tDiskon;
        teori = 80000;
        praktik = 120000;
        praktikum = 150000;

        System.out.println("Teori : Rp."+teori+"/sks | Praktik : Rp."+praktik+"/sks | Praktikum : Rp"+praktikum+"/sks");
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah sks Teori : ");
        int sksTeori = input.nextInt();
        System.out.print("Masukkan jumlah sks Praktik : ");
        int sksPraktik = input.nextInt();
        System.out.print("Masukkan jumlah sks praktikum : ");
        int sksPraktikum = input.nextInt();

        System.out.println("Jumlah sks teori anda :"+sksTeori+" *"+teori);
        System.out.println("jumlah sks praktik anda : "+sksPraktik+" *"+praktik);
        System.out.println("jumlah sks praktikum anda :"+sksPraktikum+" *"+praktikum);

        sksTeori = sksTeori*teori;
        sksPraktik = sksPraktik*praktik;
        sksPraktikum = sksPraktikum*praktikum;

        sppVar = sksTeori+sksPraktik+sksPraktikum;
        System.out.println("Total Spp Variable :"+sppVar);
        System.out.print("Masukkan IPK : ");
        IPK = input.nextDouble();
        if(IPK>=3.0){
        System.out.print("Anda mendapat diskon 25% dari total spp Vairable");
        System.out.println(" = (25*sppVariable)/100");
         tDiskon = (sppVar*25)/100;
        System.out.println("Total Diskon :"+tDiskon);
        tAkhir= sppVar-tDiskon;
        	System.out.println("Total Bayar :" +tAkhir);
	}
		else{
			System.out.println("Anda tidak mendapatkan diskon");
			System.out.println("Total Bayar :"+sppVar);
		}
    }
}
