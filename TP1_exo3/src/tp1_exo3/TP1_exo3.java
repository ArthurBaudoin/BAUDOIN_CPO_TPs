/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_exo3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP1_exo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    
        Scanner sc = new Scanner(System.in);
        Random generateurAleat = new Random();

        System.out.println("Choisir la difficulté");
        System.out.println("1) Facile");
        System.out.println("2) Normal");
        System.out.println("3) Difficile");
        int diff = sc.nextInt();
        while (diff > 3 || diff < 1) {
            System.out.println("ERREUR Selectioner une valeur entre 1 et 3");
            System.out.println("Choisir la difficulté");
            diff = sc.nextInt();
        }
        int x = 100;
        switch (diff) {
            case 1 -> {
                System.out.println("Cherche entre 1 et 100");
            }
            case 2 -> {
                x = 1000;
                System.out.println("Cherche entre 1 et 1000");
            }
            case 3 -> {
                x = 2000;
                System.out.println("Cherche entre 1 et 2000");

            }
        }

        int alea = generateurAleat.nextInt(x);

        System.out.println("Entre 0 et " + x + " : ");
        int nb = sc.nextInt();

        int z = 1;
        do {
            if (nb < alea) {
                System.out.println("trop petit");
                nb = sc.nextInt();
            }
            if (nb > alea) {
                System.out.println("trop grand");
                nb = sc.nextInt();
            }
            z++;
        } while (nb != alea);
        if (nb == alea) {
            System.out.println(
                    "trouvée en " + z + " coups");
        }
    }
   
    
    
    
    
    
    
    } 
