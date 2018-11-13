import java.util.Scanner;
public class latihan {
    public static void main(String[]args){
        String produk1,produk2,produk3;
        produk1 = "Smartphone";
        produk2 = "Laptop";
        produk3 = "Printer";
        int harga1,harga2,harga3;
        harga1 = 2500000;
        harga2 = 7250000;
        harga3 = 500000;
        System.out.println("========== Daftar Produk ===========");
        System.out.print("1. "+produk1 +" dengan harga "+harga1+" ribu || ");
        System.out.print("2. "+produk2+" dengan harga "+harga2+" ribu || ");
        System.out.println("3. "+produk3+" dengan harga"+harga3+ "ribu || ");
        System.out.println("====== Pilih produk (1,2,3) ========");
        Scanner iProduk = new Scanner(System.in);
        int produk = iProduk.nextInt();
        if (produk == 1){
            System.out.println("anda memilih produk "+produk1);
        }if(produk == 2){
            System.out.println("anda memilih produk "+produk2);
        }if(produk == 3){
            System.out.println("anda memilih produk "+produk3);
        }
        System.out.println("Silahkan masukkan jumlah yang ingin anda beli ");
        Scanner iJumlah = new Scanner(System.in);
        int jumlah = iJumlah.nextInt();
        if (produk ==1){
            int total1 = harga1*jumlah;
            System.out.println("Produk yang anda pilih "+produk1+" dengan harga "+harga1);
            System.out.println("jumlah pesanan = "+jumlah);
            System.out.println("total harga  = harga x jumlah pesanan");
            System.out.println("total harga ="+harga1+" x " +jumlah);
            System.out.println("Harga Total = "+total1);
        }if (produk ==2){
            int total2 = harga2*jumlah;
            System.out.println("Produk yang anda pilih "+produk2+" dengan harga "+harga2);
            System.out.println("jumlah pesanan = "+jumlah);
            System.out.println("total harga  = harga x jumlah pesanan");
            System.out.println("total harga ="+harga2+" x " +jumlah);
            System.out.println("Harga Total = "+total2);
        }if (produk ==3){
            int total3= harga3*jumlah;
            System.out.println("Produk yang anda pilih "+produk3+" dengan harga "+harga3);
            System.out.println("jumlah pesanan = "+jumlah);
            System.out.println("total harga  = harga x jumlah pesanan");
            System.out.println("total harga ="+harga3+" x " +jumlah);
            System.out.println("Harga Total = "+total3);
        }

    }
}
