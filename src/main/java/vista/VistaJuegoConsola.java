package vista;

import java.util.Scanner;

public class VistaJuegoConsola {
    private Scanner scanner;

    public VistaJuegoConsola() {
        scanner = new Scanner(System.in);
    }

    public int mostrarMenu() {
        System.out.println("=====================");
        System.out.println("       \nMENÚ        ");
        System.out.println("=====================");
        System.out.println("1. Jugar");
        System.out.println("2. Salir");
        System.out.print("Opción: ");
        try {
            return Integer.parseInt(scanner.nextLine());
        } catch (NumberFormatException e) {
            return -1;
        }
    }