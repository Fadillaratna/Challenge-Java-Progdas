
package Challenge;

import java.util.Scanner;

public class Batch {

    
    public static void main(String[] args) {
           //Deklarasi Variabel
     String nama;
     Double nilaiMatematika, nilaiKimia, nilaiBiologi, nilaiFisika;
     Double nilaiRataRata;
     boolean pengecekan = true;
     Scanner ui =  new Scanner(System.in);
     String jawab; 
     
     //Perulangan
     //Masukan data pembelian bunga
     while(pengecekan){
         System.out.println("=============== Pengecekan Kelulusan Siswa SMK TELKOM MALANG ===============");
         System.out.print("Masukkan Nama Siswa : ");
         nama = ui.next();
         System.out.print("Nilai Matematika: ");
         nilaiMatematika = ui.nextDouble();
         System.out.print("Nilai Kimia : ");
         nilaiKimia = ui.nextDouble();
         System.out.print("Nilai Biologi : ");
         nilaiBiologi = ui.nextDouble();
         System.out.print("Nilai Fisika : ");
         nilaiFisika = ui.nextDouble();
         
         //Perhitungan Nilai Rata Rata
        nilaiRataRata = (nilaiMatematika + nilaiKimia + nilaiBiologi + nilaiFisika) / 4;
        System.out.println("Nilai Rata Rata Siswa Atas Nama " + nama + " : " + nilaiRataRata); //Mencetak nilai rata rata siswa
         
         //Percabangan Menentukan Kelulusan
         if (nilaiRataRata >= 75){
            System.out.println("Siswa Atas Nama " + nama + " Dinyatakan Lulus Dengan Nilai Rata Rata Sebagaimana Diatas. Selamat !!");
         }else{
             System.out.println("Siswa Atas Nama " + nama + " Dinyatakan Tidak Lulus Dengan Nilai Rata Rata Sebagaimana Diatas. Mohon Maaf !!");
         }
         
         //Percabangan pembelian ulang
         System.out.println("Apakah anda ingin mengecek lagi ?" );
         System.out.println("1. Ya");
         System.out.println("2. Tidak");
         System.out.print("Jawab: ");
         jawab = ui.next();
         if(jawab.equalsIgnoreCase("Ya")){
             pengecekan = true;
         }else if(jawab.equalsIgnoreCase("Tidak")){
             pengecekan = false;
         }else{
             pengecekan = false;
             System.out.println("Mohon maaf error !!!");
         }
        
         }
    }
    
}
