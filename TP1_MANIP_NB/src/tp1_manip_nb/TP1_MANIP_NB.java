/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_manip_nb;

import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_MANIP_NB {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir deux entiers");
        double nb1 = sc.nextDouble();
        double nb2 = sc.nextDouble();
        
        double somme1 = nb1 + nb2;
        double diff1 = nb1 - nb2;
        double produit1 = nb1 * nb2;
        System.out.println(" La somme est " + somme1);
        System.out.println(" La différence est " + diff1);
        System.out.println(" Le produit est " + produit1);
        
        double q1 = nb1/nb2;
        double r = nb1%nb2;
        System.out.println(" Le quotient est " + q1);
        System.out.println(" Le reste est " + r);
        
        

    }
}
