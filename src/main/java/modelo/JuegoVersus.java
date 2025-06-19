package modelo;

public class JuegoVersus {
    private Jugador jugador1;
    private Jugador jugador2;
    private int rondasMaximas;

    public  JuegoVersus(Jugador jugador1, Jugador jugador2, int rondasMaximas) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.rondasMaximas = rondasMaximas;
    }

    public String jugarRonda() {
        JuegoDados juego1 = new JuegoDados();
        juego1.jugar();
        int resultado1 = juego1.getResultado();

        JuegoDados juego2 = new JuegoDados();
        juego2.jugar();
        int resultado2 = juego2.getResultado();

        StringBuilder ronda = new StringBuilder();
        ronda.append(jugador1.getNombre()).append(" sacó ").append(resultado1).append("\n");
        ronda.append(jugador2.getNombre()).append(" sacó ").append(resultado2).append("\n");

        if (resultado1 > resultado2) {
            jugador1.sumarPuntos(jugador1.getPuntos());
            ronda.append("Ganador de la ronda: ").append(jugador1.getNombre());
        } else if (resultado2 > resultado1) {
            jugador2.sumarPuntos(jugador2.getPuntos());
            ronda.append("Ganador de la ronda: ").append(jugador2.getNombre());
        } else {
            ronda.append("Ronda empatada");
        }

        return ronda.toString();
    }

    public boolean juegoTerminado() {
        int objetivo = (rondasMaximas + 1) / 2;
        return jugador1.getPuntos() >= objetivo || jugador2.getPuntos() >= objetivo;
    }

    public Jugador getGanador() {
        if (jugador1.getPuntos() > jugador2.getPuntos()) return jugador1;
        if (jugador2.getPuntos() > jugador1.getPuntos()) return jugador2;
        return null;
    }

    public Jugador getJugador1() {
        return jugador1;
    }

    public Jugador getJugador2() {
        return jugador2;
    }
}
