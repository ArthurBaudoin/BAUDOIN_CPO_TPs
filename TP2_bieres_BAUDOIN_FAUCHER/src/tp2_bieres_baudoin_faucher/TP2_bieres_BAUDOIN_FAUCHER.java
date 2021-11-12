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
  BouteilleBiere uneBiere =new BouteilleBiere("Cuvée des trolls",7.0,"Dubuisson");
        uneBiere.lireEtiquette();
        
        BouteilleBiere deuxBiere = new BouteilleBiere("Leffe", 6.6 , "Abbaye de Leffe");
        deuxBiere.lireEtiquette();        

        BouteilleBiere troisBiere = new BouteilleBiere ("Tripel Karmeliet", 8.6 , "Brasserie Bosteels");
        troisBiere.lireEtiquette();
        
        BouteilleBiere quatreBiere = new BouteilleBiere ("Kronenbourg", 4.2 , "Brasserie Kronenbourg");
        quatreBiere.lireEtiquette();
        
        BouteilleBiere cinqBiere = new BouteilleBiere ("pelforth", 6.5 , "Brasseries Heineken");
        cinqBiere.lireEtiquette();
        
        System.out.println(cinqBiere.ouverte);
        cinqBiere.Decapsuler();
        System.out.println(cinqBiere.ouverte);
        
        System.out.println(uneBiere) ;
        uneBiere.Decapsuler();
        System.out.println(uneBiere);

    }
   
}
