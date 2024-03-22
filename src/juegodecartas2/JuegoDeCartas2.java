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
        System.out.println("Creamos Baraja y mostramos la baraja");
        System.out.println("------------------------------------");
        System.out.println("BARAJA CREADA");
        System.out.println("------------------------------------");
        baraja.crearBaraja();
        baraja.mostrarBaraja();
        System.out.println("------------------------------------");
        System.out.println("BARAJAMOS");
        baraja.barajar();
        System.out.println("------------------------------------");
        System.out.println("Mostramos Baraja mezclada");
        baraja.mostrarBaraja();
        System.out.println("------------------------------------");
        System.out.println("Damos 8 cartas");
        baraja.darCartas(8);
        System.out.println("Mostramos las cartas que dimos");
        System.out.println("------------------------------------");
        baraja.cartasMonton();
    }
}
