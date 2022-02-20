
package Challenge;
import java.util.Scanner;
public class challengeBatch2 {

    public static void main(String[] args) {
       //Deklarasi Variabel
     int bukuMatematika, bukuKimia, bukuBiologi, bukuFisika;
     Double totalBayar, hargaBuku, diskon, total;
     boolean transaksi = true;
     Scanner ui =  new Scanner(System.in);
     int jawab = 0 ;
     
     //Perulangan
     //Masukan data pembelian bunga
     while(transaksi){
         System.out.println("=============== Online Shop Buku Saintek ===============");
         System.out.print("Jumlah Buku Matematika: ");
         bukuMatematika = ui.nextInt();
         System.out.print("Jumlah Buku Kimia : ");
         bukuKimia = ui.nextInt();
         System.out.print("Jumlah Buku Biologi : ");
         bukuBiologi = ui.nextInt();
         System.out.print("Jumlah Buku Fisika : ");
         bukuFisika = ui.nextInt();
         
         //Perhitungan Total
         hargaBuku = 25000.5;//Harga semua buku sama
         total = (bukuMatematika + bukuKimia + bukuBiologi + bukuFisika) * hargaBuku;//Menghitung total pembelian sebelum diskon
         
         //Percabangan Diskon
         if (total > 100000){
             diskon = 0.2 * total;
             totalBayar = total - diskon;
             System.out.println("Selamat diskon 20% untuk anda");
             System.out.println("--------------------- Nota Pembelian --------------------");
             System.out.println("Total Sebelum Diskon ===> Rp " + total);
             System.out.println("Total yang harus dibayar ==> Rp " + totalBayar);
         }else{
             System.out.println("Total yang harus dibayar ==> Rp " + total);
         }
         
         //Percabangan pembelian ulang
         System.out.println("Apakah anda ingin belanja lagi ?" );
         System.out.println("1. Ya");
         System.out.println("2. Tidak");
         System.out.print("Jawab: ");
         jawab = ui.nextInt();
         switch (jawab){
             case 1: transaksi = true;
             break;
             case 2: transaksi = false;
             break;
             default: transaksi = false;
                 System.out.println("Mohon maaf pilihan anda tidak ada");
         }
        
         }
    }
    
}
