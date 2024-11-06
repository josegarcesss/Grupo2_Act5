package actividad5t2;

/**
 *
 * @author Gonzalo
 */
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class ConversorTest {

    private static Conversor conversor;

    @BeforeClass
    public static void setUpClass() {
        conversor = new Conversor();
        System.out.println("Bienvenido a las pruebas de ConversorDeMoneda");
    }

    @Before
    public void setUp() {
        System.out.println(Thread.currentThread().getStackTrace()[1].getMethodName());
    }
    
    @Test
    public void testConvertir() {
        System.out.println("convertir");
        double monto = 100.0;
        double tasaCambio = 1.2;
        Conversor instance = new Conversor();
        double expResult = 120.0;
        double result = instance.convertir(monto, tasaCambio);
        assertEquals(expResult, result, 0.001);
        double resultado = conversor.convertir(1000, 1.2);
        assertEquals(1200, resultado, 0.001);
    }

    /**
     * Test of calcularCotizacion method, of class Conversor.
     */
    @Test(expected=ArithmeticException.class)
    public void testCalcularCotizacion() {
        System.out.println("calcularCotizacion");
        double montoRecibido = 0.0;
        double montoOriginal = 0.0;
        Conversor instance = new Conversor();
        double expResult = 0.0;
        double result = instance.calcularCotizacion(montoRecibido, montoOriginal);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of aumentarSaldo method, of class Conversor.
     */
    @Test
    public void testAumentarSaldo_Positivo() {
        System.out.println("aumentarSaldo Positivo");
        double saldo = 100.0;
        double monto = 10.0;
        Conversor instance = new Conversor();
        double expResult = 110.0;
        double result = instance.aumentarSaldo(saldo, monto);
        assertEquals(expResult, result, 0.001);
    }
    @Test(expected=IllegalArgumentException.class)
    public void testAumentarSaldo_Negativo() {
        System.out.println("aumentarSaldo Positivo");
        double saldo = 100.0;
        double monto = -10.0;
        Conversor instance = new Conversor();
        double expResult = 90;
        double result = instance.aumentarSaldo(saldo, monto);
        assertEquals(expResult, result,0.001);
    }


    @Test(expected=IllegalArgumentException.class)
    public void test_SaldoInsuficiente_RetirarFisico(){
        System.out.println("test SaldoInsuficiente RetirarFisico");
        double saldo = 100.0;
        double montoARetirar = 200.0;
        Conversor instance = new Conversor();
        double expResult= 0;
        double result = instance.retirarFisico(saldo, montoARetirar);
        assertEquals(expResult, result, 0.001);
    }
    
    @Test(expected=IllegalArgumentException.class)
    public void test_MontoMinimo_RetirarFisico(){
        System.out.println("test MontoMinimo RetirarFisico");
        double saldo = 100.0;
        double montoARetirar = 20.0;
        Conversor instance = new Conversor();
        double expResult= 0;
        double result = instance.retirarFisico(saldo, montoARetirar);
        assertEquals(expResult, result, 0.001);
    }
   
    @Test(expected=IllegalArgumentException.class)
    public void test_Multiplo_RetirarFisico(){
        System.out.println("test Multiplo RetirarFisico");
        double saldo = 1000.0;
        double montoARetirar = 210.0;
        Conversor instance = new Conversor();
        double expResult= 0;
        double result = instance.retirarFisico(saldo, montoARetirar);
        assertEquals(expResult, result, 0.001);
    }


    @After
    public void tearDown() {
        System.out.println("Prueba finalizada, campos en 0");
    }

    @AfterClass
    public static void tearDownClass() {
        System.out.println("La operación ha finalizado");
    }
}
   
