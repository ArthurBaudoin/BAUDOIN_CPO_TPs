/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp_exo4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author arthu
 */
public class TP_exo4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         int [] TabEntier = new int[6];
        for (int i=0; i <=5; i++){
            TabEntier[i]=0;
        }
        int m;

        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("saisir le nombre :");
        m=sc.nextInt(); 
        
        
        
        Random generateurAleat = new Random();
        for (int i=0; i<m; i++){
            int n = generateurAleat.nextInt(6);
            TabEntier[n] = TabEntier[n]+1;
        }
  
        
        
        for (int i=0; i<=5; i++){
            System.out.println("face "+(i+1)+"du dé : "+((TabEntier[i])/(float)(m))*100+"%");
    }
    }
    
}
