/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sp4_console_baudoin._faucher;

/**
 *
 * @author arthu
 */
public class Grille {
    Cellule CellulesJeu [][] = new Cellule[6][7];
    
    Grille(){
        for (int i=0; i<6; i++){
            for (int j=0; j<7; j++){
                CellulesJeu [i][j] = new Cellule();
            }
        }
    }
    
}
