package ejercicioUno;

public class Main {
    public static void main(String[] args) {
        Estudiante primerEstudiante = new Estudiante(15, "Pedro", 4.8);

        System.out.println("Nombre del estudiante: " + primerEstudiante.getNombre());
        System.out.println("edad  del estudiante: " +primerEstudiante.getEdad());
        System.out.println("promedio del estudiante: " +primerEstudiante.getNotaPromedio());
    }
}
