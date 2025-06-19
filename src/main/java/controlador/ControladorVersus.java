package controlador;

import modelo.Jugador;
import modelo.JuegoVersus;
import vista.VistaVersusConsola;

public class ControladorVersus {
    private VistaVersusConsola vista;
    private JuegoVersus juego;

    public ControladorVersus() {
        vista = new VistaVersusConsola();

        String nombre1 = vista.pedirNombreJugador(1);
        String nombre2 = vista.pedirNombreJugador(2);
        int rondas = vista.pedirCantidadRondas();

        Jugador j1 = new Jugador(nombre1);
        Jugador j2 = new Jugador(nombre2);

        this.juego = new JuegoVersus(j1, j2, (rondas + 1) / 2);
    }

    public void iniciar() {
        boolean salir = false;