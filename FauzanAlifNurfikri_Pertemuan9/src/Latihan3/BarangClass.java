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
String kodeBarang, nama;
int harga, stok, JumlahJual, HPP;

    void input(String kode, String nama, int HPP, int Harga, int stok){
    this.kodeBarang=kode;
    this.HPP=HPP;
    this.nama=nama;
    this.harga=Harga;
    this.stok=stok;
    
    
    System.out.println("Kode barang     :"+this.kodeBarang);
    System.out.println("Nama barang     :"+this.nama);
    System.out.println("HPP             :"+this.HPP);
    System.out.println("Harga Jual      :"+this.harga);
    System.out.println("Stok            :"+this.stok);
    
}

     void Pembelian(int jumlah){
        if(this.stok-jumlah >0){
            this.JumlahJual=this.JumlahJual+jumlah;
            this.stok=this.stok-this.JumlahJual;
            
            System.out.println("Pembelian Berhasil, Jumlah Pembelian : "+jumlah);
        }else{
            System.out.println("Stok            : "+this.stok);
        }   
    }
    void hitungLaba(){
        int laba= (this.JumlahJual*this.harga)-(this.HPP * this.JumlahJual);
        System.out.println("Stok Saat ini   : "+this.stok);
        System.out.println("Total Bayar     : "+this.JumlahJual*this.harga);
        System.out.println("Laba            : "+laba);
    }

  
}


