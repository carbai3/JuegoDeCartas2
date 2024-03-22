/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas2;

/**
 *
 * @author carba
 */
public class JuegoDeCartas2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         Baraja baraja = new Baraja();
    baraja.crearBaraja();
    baraja.barajar();
    baraja.darCartas(8);
    baraja.cartasMonton();
    }
}
    
    

