/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Dyra Zaki R
 */
public class NoDua {
    public static void main(String[] args) {
        
        int nilai = 80;
        int absen = 30;
        
        boolean lulusNilai = nilai >= 75;
        boolean lulusAbsen = absen >= 75;
        
        boolean lulus = lulusNilai && lulusAbsen;
        
        if (nilai >= 75 && absen <= 75) {
        System.out.println("Selamat Anda Lulus");
    } else {
        System.out.println("Selamat Coba Lagi Tahun Depan");
    }
    if (nilai >= 80 && absen >= 80) {
        System.out.println("Nilai Anda A");
    } else if (nilai >= 70 && absen >= 70) {
        System.out.println("Nilai Anda B");
    } else if (nilai >= 60 && absen >= 60) {
        System.out.println("Nilai Anda C");
    } else if (nilai >= 50 && absen >= 50) {
        System.out.println("Nilai Anda D");
    } else {
        System.out.println("Nilai Anda E");
    }
    }
    
}
