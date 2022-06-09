/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Practica_Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Persona Adri = new Persona("Adri","C/Alozaina", "45821795F", true);
      Persona Pablo = new Persona("Pablo","C/kerry Copo John", "67830412E", true);
      Persona Lorena = new Persona("Lorena","C/illoloco", "78795918G", false);
      Persona Barbara = new Persona("Barbara","C/keloque", "623764325K", false);
      
      Profesor ProfeAdri = new Profesor(1000,Estudios.Doctorado,"Adri","C/Alozaina","45821795F", true);
      Profesor ProfePablo = new Profesor(100,Estudios.FP_Medio,"Pablo","C/kerry Copo John", "67830412E", true);
      Profesor ProfeLorena = new Profesor(1000,Estudios.Doctorado,"Lorena","C/illoloco", "78795918G", false);
      Profesor ProfeBarbara = new Profesor(100,Estudios.FP_Medio,"Barbara","C/keloque", "623764325K", false);
      
      
     
    }
    
}
