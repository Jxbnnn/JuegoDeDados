package modelo;

public class Jugador {
    private String nombre;
    private int puntaje;

    public Jugador(String nombre) {
        this.nombre = nombre;
        this.puntaje = 0;
    }

    public String getNombre() {
        return nombre;
    }

    public void sumarPuntos(int puntos) {
        this.puntaje += puntos;
    }

    public int getPuntos() {
        return puntaje;
    }

    public void reiniciarPuntaje() {
        this.puntaje = 0;
    }
}
