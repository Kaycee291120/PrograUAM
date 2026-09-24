/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package veterinaria;

/**
 *
 * @author macbookpro
 */
public class Principal {
    public static void main(String[] args){
        Cliente cliente1 = new Cliente ("11111", "Ronaldo", "777777");
        Mascota mascota1 = new Mascota("Luna", "Perro", 5, 5.25, cliente1);
        Mascota mascota2 = new Mascota("Goku", "Loro", 2, 0.8);
        
        mascota1.mostrarResumen();
        System.out.println("Dueno: " + mascota1.getDuenio().getNombre());
        System.out.println("=========");
        mascota2.mostrarResumen();
    }
            
}
