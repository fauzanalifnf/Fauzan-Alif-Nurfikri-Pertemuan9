/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Pelajar {
    private String nama;
    private long tinggi;
    private long berat;
    
    public Pelajar (String nama, long tinggi, long berat){
        this.nama = nama;
        this.tinggi = tinggi;
        this.berat = berat;
    }
    public String tampilPelajar(){
        return ("Nama\t: " + nama + "\nTinggi\t: " + tinggi +"\nBerat\t:"+
                berat + "\n");
    }
}
class Siswa extends Pelajar {
    private String nim, asalsekolah;
    private long nilai;
    public Siswa (String nama, long tinggi, long berat, String nim,
            String asalsekolah, long nilai){
        super(nama,tinggi,berat);
        this.nim = nim;
        this.asalsekolah = asalsekolah;
        this.nilai = nilai;
    }
    public String tampilSiswa(){
        return (super.tampilPelajar()+"nim\t " + nim + "\nAsal Sekolah:" +
                asalsekolah + "\nNilai\t"+ nilai);
    }
}

    
