package ejercicio7.bridge.cuentas;

import ejercicio7.bridge.monedas.Moneda;

public class CuentaPlazoFijo implements Cuenta{

    private double fondos;
    private Moneda moneda;

    public CuentaPlazoFijo(double fondos, Moneda moneda) {
        this.fondos = fondos;
        this.moneda = moneda;
    }

    @Override
    public void depositar(double monto) {
        fondos += monto;
        System.out.println("Se ha depositado " + moneda.abreviatura() + " " + monto+ " en la cuenta de plazo fijo");
    }

    @Override
    public void pagarInteres() {
        System.out.println("Se ha pagado interes del 5%");
        fondos *= 1.05;
    }

    @Override
    public void printFondos() {
        System.out.printf("Los fondos de la cuenta de plazo fijo son: %s %.3f (Bs %.3f)\n\n", moneda.abreviatura(), fondos, fondos * moneda.tipoDeCambio());
    }
}
