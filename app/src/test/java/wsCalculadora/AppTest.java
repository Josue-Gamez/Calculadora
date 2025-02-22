/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package wsCalculadora;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
    @Test public void testSuma() {
        Calculadora c = new Calculadora();

        assertTrue(c.suma(2,3)==5);
        assertTrue(c.suma(3.1, 4.5)==7.6);
    }

    @Test public void testMultiplicacion() {
        Calculadora c = new Calculadora();

        assertTrue(c.multiplica(2,3)==6);
        assertTrue(c.multiplica(3.4,4.5)==3.4 * 4.5);
    }

    @Test public void testSeno() {
        Calculadora c = new Calculadora();

        assertTrue((Double) c.seno(0.0)*1.0==(Double)0.0);
    }

    @Test public void testCoseno() {
        Calculadora c = new Calculadora();

        assertTrue((Double) c.coseno(0.0)*1.0==(Double)1.0);
    }

    @Test public void testTangente() {
        Calculadora c = new Calculadora();

        assertTrue((Double) c.tangente(0.0)*1.0==(Double)0.0);
    }

    @Test public void testResta() {
        Calculadora c = new Calculadora();

        assertTrue(c.resta(5, 3) == 2);
        assertTrue(c.resta(3.5, 2.8) == 0.7000000000000002);

    }

    @Test public void testDivision() {
        Calculadora c = new Calculadora();

        assertTrue(c.division(6, 2) == 3);
        assertTrue(c.division(5.6, 2.0) == 2.8);

    }
}