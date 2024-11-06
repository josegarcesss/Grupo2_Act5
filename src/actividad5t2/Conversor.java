/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividad5t2;

/**
 *
 * @author Gonzalo
 */
public class Conversor {
    
    public double convertir(double monto, double tasaCambio) {
        return monto * tasaCambio;
    }

    public double calcularCotizacion(double montoRecibido, double montoOriginal) {
        if (montoOriginal == 0) {
            throw new ArithmeticException("División por cero no permitida.");
        }
        return montoRecibido / montoOriginal;
    }

    public double aumentarSaldo(double saldo, double monto) {
        if(monto<0){
            throw new IllegalArgumentException("El monto es menor a 0.");
        }
        return saldo + monto;
    }

    public double retirarFisico(double saldo, double montoARetirar) {

        if(montoARetirar < 100){
            throw new IllegalArgumentException("No se puede retirar esa cantidad de dinero, \n (MONTO MINIMO 100)");
        }
        if (montoARetirar>saldo){
            throw new IllegalArgumentException("Saldo insuficiente.(Saldo disponible: "+saldo+")");
        }
        if (montoARetirar % 100 != 0) {
            throw new IllegalArgumentException("Solo se pueden retirar múltiplos de 100.");
        }
        return saldo - montoARetirar;
    }
}

