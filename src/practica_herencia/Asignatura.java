/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Asignatura {

    private String codigo;
    private String nombre;
    private int horasTotales;
    private boolean troncal;
    private Alumno[] AlumnosMatriculados;
    private Profesor profe;

    public Asignatura(String codigo, String nombre, int horasTotales, boolean troncal, Profesor profe, int numAlumnos) {
        this.codigo = codigo;
        this.nombre = nombre;
        if (numAlumnos < 0) {
            numAlumnos = 10;
        }
        AlumnosMatriculados = new Alumno[numAlumnos];
        if (horasTotales < 0) {
            horasTotales = 100;
        }

        this.horasTotales = horasTotales;
        profe.setNumHoras(profe.getNumHoras() + this.horasTotales);
        this.troncal = true;
        this.profe = profe;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public boolean isTroncal() {
        return troncal;
    }

    public void setTroncal(boolean troncal) {
        this.troncal = troncal;
    }

    public Alumno[] getAlumnosMatriculados() {
        return AlumnosMatriculados;
    }

    public void setAlumnosMatriculados(Alumno[] AlumnosMatriculados) {
        this.AlumnosMatriculados = AlumnosMatriculados;
    }

    public Profesor getProfe() {
        return profe;
    }

    public void setProfe(Profesor profe) {
        this.profe = profe;
    }

    public String matricularAlumno(Alumno nuevo) {
        String matricula = "";
        boolean matriculao = false;
        for (int i = 0; i < AlumnosMatriculados.length - 1; i++) {
            if (AlumnosMatriculados[i] == null) {
                AlumnosMatriculados[i] = nuevo;
                matriculao = true;
            }
        }
        if (matriculao) {
            matricula = "\nHa sido posible matricularse";
        } else {
            matricula = "\nNo ha sido posible matricularse";
        }
        return matricula;
    }

    public String estaMatriculado(Alumno alu) {
        String matricula = "";
        boolean matriculao = false;
        for (Alumno AlumnosMatriculado : AlumnosMatriculados) {
            if (AlumnosMatriculado == alu) {
                matriculao = true;
            }
        }
        if (matriculao) {
            matricula = "\nEstá matriculado";
        } else {
            matricula = "\nNo está matriculado";
        }
        return matricula;
    }

    public String borrarAlumno(Alumno borrar) {
        String borrado = "";
        boolean borrao = false;
        for (Alumno AlumnosMatriculado : AlumnosMatriculados) {
            if (AlumnosMatriculado == borrar) {
                AlumnosMatriculado = null;
                borrao = true;
            }
        }
        if (borrao) {
            borrado = "\nHa sido posible borrarlo";
        } else {
            borrado = "\nNo estaba de antes en esta asignatura";
        }
        return borrado;
    }

    public boolean asignaturaCompleta() {
        boolean completo = true;
        for (Alumno AlumnosMatriculado : AlumnosMatriculados) {
            if (AlumnosMatriculado == null) {
                completo = false;
            }
        }
        return completo;
    }

    public void cambiarProfesor(Profesor nuevo) {
        this.profe = nuevo;
        nuevo.setNumHoras(nuevo.getNumHoras() + this.horasTotales);
        profe.setNumHoras(profe.getNumHoras() - this.horasTotales);
    }

    @Override
    public String toString() {
        String devolver = this.codigo + " : " + this.nombre + " - " + this.horasTotales + " horas.";
        if (troncal) {
            devolver += "\nEs troncal";
        } else {
            devolver += "\nNo es troncal";
        }

        devolver += "\nProfesor e la asignatura: \n========================== \n"
                + this.profe.toString()
                + " \n\n "
                + "Lista de alumnos matriculados: \n"
                + "============================== \n"
                + " \n";
        for (Alumno AlumnosMatriculado : AlumnosMatriculados) {
            if (AlumnosMatriculado != null) {
                System.out.println("\n-----------------------------------\n");
                System.out.println(AlumnosMatriculado.toString());
            }
        }

        return devolver;
    }

}
