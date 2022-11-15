/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan4;

/**
 *
 * @author USER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         BukuGambar bg=new BukuGambar("B001","BUKU GAMBAR",2500,3000,5,2);
        BukuGambar pn=new BukuGambar("P002","PENSIL 2B",1500,1750,10,1);
        System.out.println(bg.TampilBuku());
        System.out.println("----------------------------------");
        System.out.println(pn.TampilBuku());
    }
    
}
