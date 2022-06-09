/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Alumno extends Persona {

    private double notamedia;
    private Estudios estudios;

    public Alumno(double notamedia, Estudios estudios, String nombre, String direccion, String DNI, boolean genero) {
        super(nombre, direccion, DNI, genero);
        this.notamedia = Math.round(notamedia);
        if (notamedia < 5 || notamedia > 10) {
            this.notamedia = 5;
        }
        if (!(estudios.equals(estudios.FP_Medio) && estudios.equals(estudios.Bachillerato))) {
            this.estudios = estudios;
        } else {
            this.estudios = estudios.Otros;
        }
    }

    public double getNotamedia() {
        return notamedia;
    }

    public void setNotamedia(double notamedia) {
        this.notamedia = notamedia;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }

    @Override
    public String toString() {

        String devuelve = super.toString();
        devuelve = "\nAccede al instituto desde " + this.estudios + "con una nota media de " + this.notamedia;
        return devuelve;
    }

}
