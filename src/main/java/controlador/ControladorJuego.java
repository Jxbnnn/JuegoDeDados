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