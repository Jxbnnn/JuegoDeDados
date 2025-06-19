package modelo;

public class JuegoDados {
    private Dado dado1;
    private Dado dado2;

    public JuegoDados() {
        dado1 = new Dado();
        dado2 = new Dado();
    }

    public void jugar() {
        dado1.lanzar();
        dado2.lanzar();
    }
}
