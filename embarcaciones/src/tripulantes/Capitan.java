package tripulantes;

public class Capitan {
    private String nombre;
    private String apellido;
    private int matriculaDeNavegacion;

    // Constructor
    public Capitan(String nombre, String apellido, int matriculaDeNavegacion){
        this.nombre = nombre;
        this.apellido = apellido;
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    // getter & setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getMatriculaDeNavegacion() {
        return matriculaDeNavegacion;
    }

    public void setMatriculaDeNavegacion(int matriculaDeNavegacion) {
        this.matriculaDeNavegacion = matriculaDeNavegacion;
    }

    // toString

    @Override
    public String toString() {
        return "Capitan {" +
                "nombre='" + nombre + '\'' +
                ", apellido='" + apellido + '\'' +
                ", matriculaDeNavegacion=" + matriculaDeNavegacion +
                '}';
    }
}
