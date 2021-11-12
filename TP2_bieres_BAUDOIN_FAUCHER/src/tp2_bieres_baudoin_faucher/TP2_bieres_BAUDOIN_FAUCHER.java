/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package tp2_bieres_baudoin_faucher;

/**
 *
 * @author arthu
 */
public class TP2_bieres_BAUDOIN_FAUCHER {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
  /*
        BouteilleBiere uneBiere = new BouteilleBiere() ;
        
        uneBiere.Nom = "Cuvée des trolls";
        uneBiere.degreAlcool =  7.0 ;
        uneBiere.brasserie = "Dubuisson";
        uneBiere.ouverte = false;
        
        uneBiere.lireEtiquette();

        BouteilleBiere uneBiere2 = new BouteilleBiere() ;
        
        uneBiere2.Nom = "Leffe";
        uneBiere2.degreAlcool = 6.6 ;
        uneBiere2.brasserie = "Abbaye de Leffe";
        uneBiere2.ouverte = false; 
        
        uneBiere2.lireEtiquette(); 
        */

        BouteilleBiere Leffe = new BouteilleBiere("Leffe", 6.6,"Abbaye de Leffe") ;
        BouteilleBiere Trolls = new BouteilleBiere("Cuvée des trolls",7.0 ,"Dubuisson") ;
        BouteilleBiere Pelforth = new BouteilleBiere("Pelforth",5.8 ,"brasserie du Pelican") ;
        BouteilleBiere Chouffe = new BouteilleBiere("Chouffe", 8.0 ,"brasserie d'Achouffe") ;
        BouteilleBiere demon = new BouteilleBiere("Bière du démon", 12.0 ,"brasserie de Gayant") ;
        
        
        Leffe.lireEtiquette();
        Trolls.lireEtiquette();
        Pelforth.lireEtiquette();
        Chouffe.lireEtiquette();
        demon.lireEtiquette();
    
    
    
    }
    
    
}
