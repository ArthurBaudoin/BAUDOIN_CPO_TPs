/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_baudoin._faucher;

/**
 *
 * @author arthu
 */
public class Cellule {
    Jeton jetonCourant;
    boolean desintegrateur;
    boolean trounoir;
    
    Cellule(){
        jetonCourant = null;
        trounoir = false;
        desintegrateur = false;    
    }
    
    boolean affecterjeton(Jeton newjeton){
        if(jetonCourant == null){
            jetonCourant = newjeton;
            return true;
        }
        return false;
    }
}
