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
        double nbEntier1;
        Scanner sc = new Scanner(System.in);
        System.out.println("Saisir une valeur :");
         nbEntier1 = sc.nextDouble();
        
        int rep;
        do { 
            rep = menu(); 
            switch (rep) {
                case 1: 
                    CelciusVersKelvin (nbEntier1);
                    System.out.println(CelciusVersKelvin (nbEntier1));
                    break;
                case 2:
                    KelvinVersCelcius(nbEntier1);
                    System.out.println(KelvinVersCelcius (nbEntier1));
                    break;
                case 3: 
                    FarenheitVersKelvin(nbEntier1);
                    System.out.println(FarenheitVersKelvin (nbEntier1));
                case 4:
                    KelvinVersFarenheit(nbEntier1);
                    System.out.println(KelvinVersFarenheit (nbEntier1));
                    break;
                case 5:
                    CelciusVersFarenheit(nbEntier1);
                    System.out.println(CelciusVersFarenheit (nbEntier1));
                    break;
                case 6:
                    FarenheitVersCelcius(nbEntier1);
                    System.out.println(FarenheitVersCelcius (nbEntier1));
                    break;
                default:
                    System.out.println("Choix non valide");
                    break;
            }
        } while (rep > 6); 
        
    }      
    public static double CelciusVersKelvin ( double tempCelcius) {
        
        double tempKelvin = tempCelcius+273.15f;
        return tempKelvin;
        
   }
    
    
     public static double KelvinVersCelcius ( double tempKelvin) {
        
        double tempCelcius = tempKelvin-273.15f;
        return tempCelcius;

    }
    public static double FarenheitVersCelcius ( double tempFarenheit) {
        
        double tempCelcius = (tempFarenheit-32)*5f/9;
        return tempCelcius;

    }
    public static double CelciusVersFarenheit ( double tempCelcius) {
        
        double tempFarenheit = (tempCelcius*9f/5)+32;
        return tempFarenheit;

    }
    public static double KelvinVersFarenheit ( double tempKelvin) {
        
        double tempFarenheit = ((tempKelvin-273.15f)*9f/5)+32;
        return tempFarenheit;

    }
    public static double FarenheitVersKelvin ( double tempFarenheit) {
        
        double tempKelvin = ((tempFarenheit-32f)*5f/9)+273.15f;
        return tempKelvin;

    }
    
    public static int menu() {
        
        Scanner sc;
        int rep;
        sc = new Scanner(System.in);
        System.out.println("Saisissez la convertion que vous voulez effectuer :");
        System.out.println("1) De Celcius vers Kelvin");
        System.out.println("2) De Kelvin vers Celcius");
        System.out.println("3) De Farenheit vers Kelvin");
        System.out.println("4) De Kelvin vers Farenheit");
        System.out.println("5) De Celcius vers Farenheit");
        System.out.println("6) De Farenheit vers Celcius");
        rep = sc.nextInt();
        return rep;
}   }





