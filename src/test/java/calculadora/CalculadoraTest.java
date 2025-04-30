package calculadora;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculadoraTest {

    @Test
    void testGetSOMA() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetDiferenca() {
        Calculadora calculadora = new Calculadora(4.0, 2.0);
        double retornoEsperado = 2.0;
        double retornoFeito = calculadora.getDiferenca();
        assertEquals(retornoEsperado, retornoFeito, 0);

    }

    @Test
    void testGetProduto() {

        Calculadora calculadora = new Calculadora(4.0, 2.0);

        double retornoEsperado = 8.0;

        double retornoFeito = calculadora.getProduto();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetQuociente() {

        Calculadora calculadora = new Calculadora(4.0, 2.0);

        double retornoEsperado = 2.0;

        double retornoFeito = calculadora.getQuociente();

        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testgetExponencial() {
        Calculadora calculadora = new Calculadora(2.0, 3.0);
        double retornoEsperado = 8.0;
        double retornoFeito = calculadora.getExponencial();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testgetFatorial() {
        Calculadora calculadora = new Calculadora(6.0, 3.0);
        double retornoEsperado = 720.0;
        double retornoFeito = calculadora.getFatorial();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }

    @Test
    void testGetVazio() {
        Calculadora calculadora = new Calculadora();
        double retornoEsperado = 0.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
