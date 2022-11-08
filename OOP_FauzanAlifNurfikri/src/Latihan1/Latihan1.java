
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author hp
 */
public class Latihan1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String input1, input2;
        
         input1 = JOptionPane.showInputDialog("Masukan Angka Pertama: ");
         input2 = JOptionPane.showInputDialog("Masukan Angka Kedua: ");
         
         JOptionPane.showMessageDialog(null,parseInt(input1)+parseInt(input2));
    }
    
}
