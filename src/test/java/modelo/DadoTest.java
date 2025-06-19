package modelo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DadoTest {

    @Test
    void lanzar() {
        Dado dado = new Dado();
        for (int i = 0; i < 50; i++) {
            dado.lanzar();
            int cara = dado.getCara();
            assertTrue(cara >= 1 && cara <= 6, "La cara debe estar entre 1 y 6");
        }
    }

    @Test
    void getCara() {
        Dado dado = new Dado();
        dado.lanzar();
        int cara = dado.getCara();
        assertTrue(cara >= 1 && cara <= 6, "getCara debe devolver valor valido luego de lanzar");
    }

    @Test
    void testToString() {
        Dado dado = new Dado();
        dado.lanzar();
        String resultado = dado.toString();
        assertTrue(resultado.contains("Dado muestra"), "toString debe contener texto descriptivo");
        assertTrue(resultado.matches("Dado muestra: \\d"), "toString debe incluir numero");
    }
}