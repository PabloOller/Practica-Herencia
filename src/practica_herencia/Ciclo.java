/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practica_herencia;

/**
 *
 * @author Pablo
 */
public class Ciclo {

    private String nombre;
    private String Codigo;
    private int horas;
    private TipoGrado tipoGrado;
    private Asignatura[] ListaAsignaturas;

    public Ciclo(String nombre, String Codigo, int horas, TipoGrado tipoGrado, int numAsignaturas) {
        this.nombre = nombre;
        this.Codigo = Codigo;
        this.horas = horas;
        this.tipoGrado = tipoGrado;
        if (numAsignaturas < 3 || numAsignaturas > 10) {
            numAsignaturas = 5;
        }
        this.ListaAsignaturas = new Asignatura[numAsignaturas];
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String Codigo) {
        this.Codigo = Codigo;
    }

    public int getHoras() {
        return horas;
    }

    public void setHoras(int horas) {
        this.horas = horas;
    }

    public TipoGrado getTipoGrado() {
        return tipoGrado;
    }

    public void setTipoGrado(TipoGrado tipoGrado) {
        this.tipoGrado = tipoGrado;
    }

    public Asignatura[] getListaAsignaturas() {
        return ListaAsignaturas;
    }

    public void setListaAsignaturas(Asignatura[] ListaAsignaturas) {
        this.ListaAsignaturas = ListaAsignaturas;
    }

    public String aniadirAsignatura(Asignatura nueva) {
        String aniade;
        boolean aniadida = false;
        for (int i = 0; i < ListaAsignaturas.length - 1; i++) {
            if (ListaAsignaturas[i] == null) {
                ListaAsignaturas[i] = nueva;
                aniadida = true;
            }
        }
        if (aniadida) {
            aniade = "\nHa sido posible añadir la asignatura";
        } else {
            aniade = "\nNo ha sido posible añadir la asignatura";
        }
        return aniade;
    }

    public String enCiclo(Asignatura asig) {
        String dentro;
        boolean esta = false;
        for (Asignatura ListaAsignatura : ListaAsignaturas) {
            if (ListaAsignatura == asig) {
                esta = true;
            }
        }
        if (esta) {
            dentro = "\nEstá en el Ciclo";
        } else {
            dentro = "\nNo está en el ciclo";
        }
        return dentro;
    }

    public String eliminarAsignatura(Asignatura borrar) {
        String borrado;
        boolean borrao = false;
        for (Asignatura ListaAsignatura : ListaAsignaturas) {
            if (ListaAsignatura == borrar) {
                ListaAsignatura = null;
                borrao = true;
            }
        }
        if (borrao) {
            borrado = "\nSe ha eliminado";
        } else {
            borrado = "\nEsta asignatura no estaba en la lista de antes";
        }
        return borrado;
    }

    public boolean asignaturaCompleta() {
        boolean CicloCompleto = true;
        for (Asignatura ListaAsignatura : ListaAsignaturas) {
            if (ListaAsignatura == null) {
                CicloCompleto = false;
            }
        }
        return CicloCompleto;
    }
}
