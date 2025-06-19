package controlador;

import modelo.JuegoDados;
import vista.VistaJuegoConsola;

public class ControladorJuego {
    private VistaJuegoConsola vista;
    private JuegoDados juego;

    public ControladorJuego() {
        vista = new VistaJuegoConsola();
        juego = new JuegoDados();
    }

    public void iniciar() {
        boolean salir = false;

        while (!salir) {
            int opcion = vista.mostrarMenu();

            switch (opcion) {
                case 1:
                    juego.jugar();
                    int d1 = juego.getDado1().getCara();
                    int d2 = juego.getDado2().getCara();
                    int suma = juego.getResultado();
                    boolean gano = juego.haGanado();
                    vista.mostrarResultado(d1, d2, suma, gano);
                    break;
                case 2:
                    if (vista.confirmarSalida()) {
                        salir = true;
                        System.out.println("Gracias por jugar.");
                    }
                    break;
                default:
                    System.out.println("Opción inválida.");
            }
        }

        vista.cerrarScanner();
    }

    public static void main(String[] args) {
        new ControladorJuego().iniciar();
    }
}
