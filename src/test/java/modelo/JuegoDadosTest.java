package modelo;

import static org.junit.jupiter.api.Assertions.*;

class JuegoDadosTest {

    @org.junit.jupiter.api.Test
    void jugar() {
        JuegoDados juego = new JuegoDados();
        juego.jugar();
        int cara1 = juego.getDado1().getCara();
        int cara2 = juego.getDado2().getCara();
        assertTrue(cara1 >= 1 && cara1 <= 6, "Dado 1 debe estar entre 1 y 6");
        assertTrue(cara2 >= 1 && cara2 <= 6, "Dado 2 debe estar entre 1 y 6");
    }

    @org.junit.jupiter.api.Test
    void getResultado() {
        JuegoDados juego = new JuegoDados();
        for (int i = 0; i < 20; i++) {
            juego.jugar();
            int suma = juego.getResultado();
            assertTrue(suma >= 2 && suma <= 12, "La suma debe estar entre 2 y 12");
        }
    }

    @org.junit.jupiter.api.Test
    void haGanado() {
        JuegoDados juego = new JuegoDados();
        boolean vioGanador = false;
        boolean vioPerdedor = false;

        for (int i = 0; i < 50; i++) {
            juego.jugar();
            int suma = juego.getResultado();
            if (suma == 7) {
                assertTrue(juego.haGanado(), "Debe ganar si la suma es 7");
                vioGanador = true;
            } else {
                assertFalse(juego.haGanado(), "No debe ganar si la suma no es 7");
                vioPerdedor = true;
            }
        }
        assertTrue(vioGanador, "Debe detectar al menos una victoria");
        assertTrue(vioPerdedor, "Debe detectar al menos una derrota");
    }

    @org.junit.jupiter.api.Test
    void getDado1() {
        JuegoDados juego = new JuegoDados();
        assertNotNull(juego.getDado1(), "Dado 1 no debe ser nulo");
        assertInstanceOf(Dado.class, juego.getDado1(), "Dado 1 debe ser instancia de Dado");
    }

    @org.junit.jupiter.api.Test
    void getDado2() {
        JuegoDados juego = new JuegoDados();
        assertNotNull(juego.getDado2(), "Dado 2 no debe ser null");
        assertInstanceOf(Dado.class, juego.getDado2(), "Dado 2 debe ser instancia de Dado");
    }
}