package org.example;

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

    public int getResultado() {
        return dado1.getCara() + dado2.getCara();
    }

    public boolean haGanado() {
        return getResultado() == 7;
    }

    public Dado getDado1() {
        return dado1;
    }

    public Dado getDado2() {
        return dado2;
    }
}
