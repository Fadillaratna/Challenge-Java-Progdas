
package Challenge;

import java.util.Scanner;

public class ChallengeBatchMrGood1 {

    public static void main(String[] args) {
        //Pendeklarasian Variabel
        String nama, kelas;
        int absen;
        Double nilaiMatematika, nilaiKimia, nilaiBiologi, nilaiFisika;
        Double nilaiRataRata;
        boolean pengecekan = true;//Untuk perulangan
        Scanner ui =  new Scanner(System.in);
        String jawab  ;//Untuk menjawab pilihan 
        
        System.out.println("<<<<<<<<<<<_________Pengecekan Kelulusan Siswa SMK TELKOM MALANG_________>>>>>>>>>>>");
        
        //Perulangan
        while(pengecekan){
            //Menginput data siswa
            System.out.print("Masukkan Nama Siswa : ");
            nama = ui.nextLine();
            System.out.print("Masukkan Kelas Siswa : ");
            kelas  = ui.nextLine();
            System.out.print("Masukkan Nomor Absen Siswa :");
            absen = ui.nextInt();
            
            //Menginput/Memasukkan Nilai Siswa
            System.out.print("Nilai Matematika : ");
            nilaiMatematika = ui.nextDouble();
            System.out.print("Nilai Kimia : ");
            nilaiKimia = ui.nextDouble();
            System.out.print("Nilai Biologi : ");
            nilaiBiologi = ui.nextDouble();
            System.out.print("Nilai Fisika : ");
            nilaiFisika = ui.nextDouble();
          
        //Perhitungan nilai rata-rata
          nilaiRataRata = ((nilaiMatematika + nilaiKimia + nilaiBiologi + nilaiFisika)/4);
          System.out.println("Nilai Rata Rata Siswa Atas Nama " + nama + " : " + nilaiRataRata); //Mencetak nilai rata rata siswa
          
        //Percabangan untuk menentukan siswa lulus atau tidak
        if(nilaiRataRata>=75){
            System.out.println("Siswa Atas Nama " + nama + " Dinyatakan Lulus Dengan Nilai Rata Rata Sebagaimana Diatas. Selamat !!");
        }else{
           System.out.println("Siswa Atas Nama " + nama + " Dinyatakan Tidak Lulus Dengan Nilai Rata Rata Sebagaimana Diatas. Mohon Maaf !!");
        }
        
        
        System.out.println("Apakah anda ingin mengecek lagi ?" );
         System.out.println("Ya");
         System.out.println("Tidak");
         System.out.print("Jawab: ");
         jawab = ui.nextLine();
        //Percabangan untuk pengecekan ulang
        
         if(jawab.equalsIgnoreCase("Ya")){
             pengecekan = true;
         }else if(jawab.equalsIgnoreCase("Tidak")){
             pengecekan = false;
         }else{
             pengecekan = false;
         }
                    
        }
        
    }
    
}
