package ejercicioTres;

public class Computadora {
    private String procesador;
    private int cantidadMemoriaRAM;
    private int cantidadMemoriaCPU;

    public Computadora(int cantidadMemoriaCPU, int cantidadMemoriaRAM, String procesador) {
        this.cantidadMemoriaCPU = cantidadMemoriaCPU;
        this.cantidadMemoriaRAM = cantidadMemoriaRAM;
        this.procesador = procesador;
    }
}
