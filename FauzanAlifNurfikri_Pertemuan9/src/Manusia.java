/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class Manusia {
    public String nama, hobby, pekerjaan;
    public Manusia(String nama, String hobby, String kerja) {
        this.nama = nama;
        this.hobby = hobby;
        this.pekerjaan = kerja;
    }
    public String tampilManusia (){
        return ("Nama\t\t: " + nama + "\n"+
                "Hobby\t\t: " + hobby + "\n"+
                "Pekerjaan\t: " + pekerjaan + "\n");
    }
    
}
class programmer extends Manusia {
    public programmer(String nama, String hobby, String kerja){
        super(nama, hobby, kerja);
    }
}
class polisi extends Manusia {
    public polisi(String nama, String hobby, String kerja){
        super(nama, hobby, kerja);
    }
}