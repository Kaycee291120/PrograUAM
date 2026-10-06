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
        
        cliente1.setIdentificacion("22222222");
        System.out.println("Dueno: " + mascota1.getDuenio().getIdentificacion());
        
        Veterinario veterinario1 = new Veterinario("V001", "Medicina general", "Dra Shirley Cruz");
        
        Consulta consulta1 = new Consulta(
                "5/10/2026", 
                "Control general", 
                mascota1, 
                15000,
                veterinario1);
        consulta1.mostrarResumen();
        System.out.println("====================");
        consulta1.actualizarCosto(17500);
        consulta1.mostrarResumen();
        System.out.println("====================");
        consulta1.actualizarCosto(18000, "Control y medicamento");
        consulta1.mostrarResumen();
        
        Cliente cliente2 = new cliente("22222222", "Carlos Mora", "888888888");
        Persona personaReferencia = cliente2;
        
        System.out.println(cliente2.getNombre());
        System.out.println(personaReferencia.getNombre());
    }
            
}
