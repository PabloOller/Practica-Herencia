/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Profesor extends Persona {

    private double sueldo;
    private Estudios estudios;
    private int NumHoras;
    private boolean ocupado;
    private boolean DarClase;

    public Profesor(double sueldo, Estudios estudios, String nombre, String direccion, String DNI, boolean genero) {
        super(nombre, direccion, DNI, genero);
        this.sueldo = sueldo;
        if (sueldo < 350) {
            this.sueldo = 350;
        }
        this.estudios = estudios;
        if (estudios.equals(estudios.NoValido) || estudios.equals(estudios.Otros)) {
            this.estudios = estudios.FP_Medio;
        }
        this.NumHoras = 0;
        this.ocupado = false;
        this.DarClase = false;

    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Estudios getEstudios() {
        return estudios;
    }

    public void setEstudios(Estudios estudios) {
        this.estudios = estudios;
    }

    public int getNumHoras() {
        return NumHoras;
    }

    public void setNumHoras(int NumHoras) {
        this.NumHoras = NumHoras;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public boolean isDarClase() {
        return DarClase;
    }

    public void setDarClase(boolean DarClase) {
        this.DarClase = DarClase;
    }
    
    
    public String EnClase() {
        if (super.genero == true) {
            if (DarClase == false) {
                return "El profesor " + super.getNombre() + " no esta dando clase.";
            } else {
                return "El profesor " + super.getNombre() + " está dando clase.";
            }
        } else {
            if (DarClase == false) {
                return "La profesora " + super.getNombre() + " no esta dando clase.";
            } else {
                return "La profesora " + super.getNombre() + " está dando clase.";
            }

        }

    }

    @Override
    public String toString() {
        String devuelve = super.toString();
        devuelve += "\nSu nivel de estudios es: " + this.estudios;
        if (super.genero) {
            devuelve += "\nTrabaja como Profesor durante " + this.NumHoras + " horas y cobra " + this.sueldo;
        } else {
            devuelve += "\nTrabaja como Profesor durante " + this.NumHoras + " horas y cobra " + this.sueldo;
        }

        if (DarClase) {
            devuelve += "\nAhora esta dando clase";
        } else {
            devuelve += "\nAhora esta dando clase";
        }

        return devuelve;
    }

}
