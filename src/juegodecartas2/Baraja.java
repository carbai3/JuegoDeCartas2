/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juegodecartas2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

/**
 *
 * @author carba
 */
public class Baraja {
    ArrayList<Carta> baraja = new ArrayList<>();
    ArrayList<Carta> cartasADar = new ArrayList<>();

    public Baraja() {
    }

    public Baraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public ArrayList<Carta> getBaraja() {
        return baraja;
    }

    public void setBaraja(ArrayList<Carta> baraja) {
        this.baraja = baraja;
    }

    public void crearBaraja() {

        String[] palos = {"espadas", "bastos", "oros", "copas"};

        for (String palo : palos) {
            for (int numero = 1; numero <= 12; numero++) {
                if (numero != 8 && numero != 9) {
                    baraja.add(new Carta(numero, palo));
                }
            }
        }
    }
    // barajar(): cambia de posición todas las cartas aleatoriamente.

    public void barajar() {
        Set<Integer> numeros = new HashSet<>();
        Random random = new Random();
        while (numeros.size() < baraja.size()) {
            int numeroAleatorio = random.nextInt(40) + 1;
            numeros.add(numeroAleatorio);
        }
        ArrayList<Integer> numerosAleatorios = new ArrayList<>(numeros);
        for (int i = 0; i < baraja.size(); i++) {
            baraja.set(i, baraja.get(numerosAleatorios.get(i) - 1));
        }
    }
    // siguienteCarta(): devuelve la siguiente carta que está en la baraja,
    // cuando no haya más o se haya llegado al final, se indica al usuario que no hay más cartas.

    public Carta siguienteCarta(ArrayList<Carta> baraja) {
        if (baraja.isEmpty()) {
            System.out.println("No hay más cartas facha");
            return null;
        } else {
            return baraja.remove(baraja.size() - 1);
        }
    }

    public void cartasDisponibles(ArrayList<Carta> cartas) {
        System.out.println("El numero de cartas disponibles es: " + cartas.size());
    }

    /* dado un número de cartas que nos pidan, le devolveremos ese número de cartas. 
En caso de que haya menos cartas que las pedidas, no devolveremos nada, 
pero debemos indicárselo al usuario.
     */
    public ArrayList<Carta> darCartas(int numCartas) {
        if (baraja.size() < numCartas) {
            System.out.println("no hay suficientes cartas para dar");
            return new ArrayList<>();
        } /* Al llamar a siguienteCarta(), se verifica si hay cartas 
        disponibles en la baraja. Si la baraja no está vacía, se retira 
        la primera carta de la baraja. Si la baraja está vacía, se muestra un mensaje 
        indicando que no hay más cartas en la baraja y se devuelve null.
        Se crea un ArrayList con las cartasADar, almacenando la carta devuelta 
        por siguienteCarta() en la variable carta y permite 
        luego agregar esa carta a la lista cartasADar, que es la lista que 
        se devolverá al final del método darCartas(int numCartas) con todas 
        las cartas solicitadas por el usuario.*/
       
        for (int i = 0; i < numCartas; i++) {
            Carta carta = siguienteCarta(baraja); 
            if (carta != null) {
                cartasADar.add(carta);
            }

        }
        return cartasADar;
    }
    public void cartasMonton(){
        
        if(cartasADar.size()>0){
            for(Carta i:cartasADar){
                System.out.println("las casrtas del monton son: "+ i.toString());
            }
        }else{
                    System.out.println("no salio n inguna carta");
                    }
    }
    public void mostrarBaraja(){
        for(Carta i:baraja){
            System.out.println("las cartas disponibles en la baraja son "+ i.toString());
        }
    }
}
