package vista;

import java.util.Scanner;

public class VistaJuegoConsola {
    private Scanner scanner;

    public VistaJuegoConsola() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("-----------------------");
        System.out.println("        \nMENU         ");
        System.out.println("-----------------------");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.print("Opcion: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public void mostrarResultado(int dado1, int dado2, int suma, boolean gano) {
        System.out.println("Dado 1: " + dado1);
        System.out.println("Dado 2: " + dado2);
        System.out.println("Suma: " + suma);
        System.out.println(gano ? "Ganaste" : "Perdiste");
    }

    public boolean confirmarSalida() {
        System.out.print("Salir: S/N ");
        String respuesta = scanner.nextLine();
        return respuesta.equalsIgnoreCase("S");
    }

    public void cerrarScanner() {
        scanner.close();
    }
}

