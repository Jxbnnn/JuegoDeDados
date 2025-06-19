package vista;

import modelo.Jugador;

import java.util.Scanner;

public class VistaVersusConsola {
    private Scanner scanner;

    public VistaVersusConsola() {
        scanner = new Scanner(System.in);
    }

    public String pedirNombreJugador(int numero) {
        System.out.print("Ingrese nombre del jugador " + numero + ": ");
        return scanner.nextLine();
    }

    public int pedirCantidadRondas() {
        int rondas;
        while (true) {
            System.out.print("¿Cuántos intentos? (1, 3 o 5): ");
            try {
                rondas = Integer.parseInt(scanner.nextLine());
                if (rondas == 1 || rondas == 3 || rondas == 5) {
                    return rondas;
                } else {
                    System.out.println("Debe elegir 1, 3 o 5.");
                }
            } catch (NumberFormatException e) {
                System.out.println("Entrada inválida.");
            }
        }
    }

    public void mostrarSeparador() {
        System.out.println("\n-------------------------");
    }

    public void mostrarMarcador(Jugador j1, Jugador j2) {
        System.out.println("Marcador actual:");
        System.out.println(j1.getNombre() + ": " + j1.getPuntaje() + " puntos");
        System.out.println(j2.getNombre() + ": " + j2.getPuntaje() + " puntos");
    }

    public void mostrarGanador(Jugador ganador) {
        if (ganador != null) {
            System.out.println("¡Ganador final: " + ganador.getNombre() + "!");
        } else {
            System.out.println("El juego terminó en empate.");
        }
    }

    public boolean confirmarSalida() {
        System.out.print("¿Desean salir del juego? (S/N): ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("S");
    }

    public void mostrarDespedida() {
        System.out.println("¡Gracias por jugar!");
    }
}
