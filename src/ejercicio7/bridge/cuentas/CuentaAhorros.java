package ejercicio7.bridge.cuentas;

import ejercicio7.bridge.monedas.Moneda;

public class CuentaAhorros implements Cuenta {

    private double fondos;
    private Moneda moneda;

    public CuentaAhorros(double fondos, Moneda moneda) {
        this.fondos = fondos;
        this.moneda = moneda;
    }

    @Override
    public void depositar(double monto) {
        fondos += monto;
        System.out.println("Se ha depositado " + moneda.abreviatura() + " " + monto + " en la cuenta de ahorros");
    }

    @Override
    public void pagarInteres() {
        System.out.println("Se ha pagado interes del 2%");
        fondos *= 1.02;
    }

    @Override
    public void printFondos() {
        System.out.printf("Los fondos de la cuenta de ahorros son: %s %.3f (Bs %.3f)\n\n", moneda.abreviatura(), fondos, fondos * moneda.tipoDeCambio());
    }
}
