/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sihaynumeros;

/**
 *
 * @author FAMILIAGGG
 */
public class Sihaynumeros {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       String nombre = "Gloria 1 2 3 4";
      for(int i=0; i < nombre.length(); i++) {
      boolean isNumeric ;
        if (isNumeric = nombre.chars().allMatch( Character::isDigit ) == true){
            System.out.println("Esta cadena contine numeros y letras");
      }else (isNumeric = nombre.chars().allMatch( Character::isDigit ) == false) {
            System.out.println("Esta cadena contiene solamente letras");
        }
    }
}
}
