package ejercicioDos;

public class Main {
    public static void main(String[] args) {
        Coche miCoche = new Coche("Tesla", "X", 230);

        miCoche.velocidadMaxima = 300;,   //Error de compilacion: illegal start of expression
    }
}
