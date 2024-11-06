/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5t2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;
import static org.junit.Assert.assertEquals;
/**
 *
 * @author Gonzalo
 */
@RunWith(Parameterized.class)
public class DolaritosTest {

    private double monto;
    private double tasa;
    private double resultadoEsperado;

    public DolaritosTest(double monto, double tasa, double resultadoEsperado) {
        this.monto = monto;
        this.tasa = tasa;
        this.resultadoEsperado = resultadoEsperado;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> datos() {
        return Arrays.asList(new Object[][] {
            { 180000, 1.5, 270000 },
            { 1500, 0, 0 },
            { 120, 10, 1200 },
            { 120000, -1, -120000 }
        });
    }

    @Test
    public void testCotizar() {
        Conversor conversor = new Conversor();
        assertEquals(resultadoEsperado, conversor.convertir(monto, tasa), 0.001);
    }
}

