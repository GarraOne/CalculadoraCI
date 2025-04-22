package calculadora;

import Calculadora.Calculadora;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author 1072410296
 */
class CalculadoraTest {
    
@Test
    void testGetSOMA(){
        Calculadora calculadora = new Calculadora(4.0, 20.0);
        double retornoEsperado = 6.0;
        double retornoFeito = calculadora.getSoma();
        assertEquals(retornoEsperado, retornoFeito, 0);
    }
}
