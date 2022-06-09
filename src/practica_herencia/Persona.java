/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Persona {

    private String nombre;
    private String direccion;
    private String DNI;
    protected boolean genero;

    public Persona(String nombre, String direccion, String DNI, boolean genero) {
        this.nombre = nombre;
        this.direccion = direccion;
        this.DNI = DNI;
        this.genero = genero;
    }

    public Persona(Persona persona) {
        this.nombre = persona.nombre;
        this.direccion = persona.direccion;
        this.DNI = persona.DNI;
        this.genero = persona.genero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public boolean isGenero() {
        return genero;
    }

    public void setGenero(boolean genero) {
        this.genero = genero;
    }

    @Override
    public String toString() {
        String devuelve = "Nombre=" + this.nombre + " - DNI=" + DNI;
        if (genero) {
            devuelve += "\nEs un chico";
        } else {
            devuelve += "\nEs una chica";
        }
        devuelve += "\nDirección: " + this.direccion;
        return devuelve;
    }

}
