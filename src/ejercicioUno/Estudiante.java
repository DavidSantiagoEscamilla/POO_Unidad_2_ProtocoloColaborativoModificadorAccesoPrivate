package ejercicioUno;

public class Estudiante {
    private String nombre;
    private int edad;
    private double notaPromedio;

    public Estudiante(int edad, String nombre, double notaPromedio) {
        this.edad = edad;
        this.nombre = nombre;
        this.notaPromedio = notaPromedio;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if(edad >= 2) {
            this.edad = edad;
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if(nombre.length() > 2) {
            this.nombre = nombre;
        }
    }

    public double getNotaPromedio() {
        return notaPromedio;
    }

    public void setNotaPromedio(double notaPromedio) {
        if(notaPromedio >= 0) {
            this.notaPromedio = notaPromedio;
        }
    }
}
