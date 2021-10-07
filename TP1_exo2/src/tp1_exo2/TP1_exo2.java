/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp1_exo2;

import java.util.Scanner;

/**
 * Baudoin Arthur
 * Victor Faucher
 * TDb
 */
public class TP1_exo2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("saisir nombre décimal ");
    float T = sc.nextFloat();
    
    float K = T + 273,15;
    System.out.println("le résultat est " + K);
    
   
}}

public float CelciusVersKelvin ( float tempCelcius);{
    float K1 = 273,15;
    float tempkelvin = 0;
    tempKelvin = tempCelcius + K1;
    System.out.println( tempKelvin );
    



}
