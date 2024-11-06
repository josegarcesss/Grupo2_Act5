/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5t2;

import org.junit.Test;


/**
 *
 * @author Gonzalo
 */
public class CotizacionTest {

    @Test(expected = ArithmeticException.class)
    public void testCotizarCero() {
        Conversor conversor = new Conversor();
        conversor.calcularCotizacion(1620, 0);
    }
}

