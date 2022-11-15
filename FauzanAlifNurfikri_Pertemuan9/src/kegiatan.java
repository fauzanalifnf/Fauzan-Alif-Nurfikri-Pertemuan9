/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author USER
 */
public class kegiatan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Manusia[]informasi= new Manusia[2];
        informasi[0]=new programmer("Programmer", "Futsal", "Mengetik Sintak");
        informasi[1]=new polisi("Polisi","Futsal","Operasi keliling");
        for (int i=0; i<2; i++) {
            System.out.println("-------------------------------");
            System.out.println(informasi[i].tampilManusia());
        
    }
    }
    
}
