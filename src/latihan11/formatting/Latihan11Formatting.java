/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package latihan11.formatting;

/**
 *
 * @author Aero
 * NAMA     : Irman Novryansah
 * KELAS    : IF-1
 * NIM      : 10118018
 * Deskripsi Program : Program ini untuk formatting tampilan keluaran
 * 
 * 
 */
public class Latihan11Formatting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //Deklarasi variabel
        int i = 3546764;
        int iMinus = -i;
        
        //Tampilan
        System.out.println("i : " + i);
        System.out.printf("%%d : %d%n", i);
        System.out.printf("%%10d : %10d%n", i);
        System.out.printf("%%+10d : %+10d%n", i);
        System.out.printf("%%+10d : %+10d%n", iMinus);
        System.out.printf("%%,10d : %,10d%n", i);
        System.out.printf("%%-10d : %-10d%n", i);
        
        //Deklarasi Variabel
        double f =5675482.982;
        
        //Tampilan
        System.out.println("f : " + f);
        System.out.printf("%%f : %f%n", f);
        System.out.printf("%%.2f : %.2f%n", f);
        System.out.printf("%%12.2f : %12.2f%n", f);
        System.out.printf("%%,12.2f : %,12.2f%n", f);
    }
    
}
