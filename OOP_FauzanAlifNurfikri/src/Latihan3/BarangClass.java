/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan3;

/**
 *
 * @author hp
 */
public class BarangClass {
String kodeBarang, namaBarang;
int harga, stok, JumlahJual, HPP;

void input(String kode, String namaBarang, int HPP, int Harga, int stok, int JumlahJual){
    this.kodeBarang=kodeBarang;
    this.HPP=HPP;
    this.namaBarang=namaBarang;
    this.harga=harga;
    this.stok=stok;
    this.JumlahJual=JumlahJual;
    
    System.out.println("Kode barang     :"+this.kodeBarang);
    System.out.println("Nama barang     :"+this.namaBarang);
    System.out.println("HPP             :"+this.HPP);
    System.out.println("Harga Jual      :"+this.harga);
    System.out.println("Stok            :"+this.stok);
    System.out.println("Jumlah Jual     :"+this.JumlahJual);
}

    void input(String showInputDialog) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void Pembelian(int parseInt) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void hitunglah() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
    }

