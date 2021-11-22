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
    
    boolean affecterjeton(Jeton Newjeton){
        if(jetonCourant == null){
            jetonCourant = Newjeton;
            return true;
        }
        return false;
    }
    
    Jeton recupererJeton(){
        Jeton Backjeton = jetonCourant;
        jetonCourant = null;
        return Backjeton;
        }
    
    boolean supprimerJeton(){
        if(jetonCourant == null){
            return false;     
        }
        jetonCourant = null;
        return true;
    }






}
