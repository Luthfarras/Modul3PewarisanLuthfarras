/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Praktikum;

/**
 *
 * @author Faras
 */
public class ekskul {
    String suborgan;
    int jumlahpeserta;
    
    void suborgan(String sub){
        suborgan = sub;
        System.out.println("Kegiatan ekskul: " +suborgan);
    }
    
    void jumlahpeserta(int jumlah){
        jumlahpeserta = jumlah;
        System.out.println("Jumlah peserta: " +jumlahpeserta);
    }
}