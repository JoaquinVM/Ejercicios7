package ejercicio7.bridge.cuentas;

import ejercicio7.bridge.monedas.Moneda;

public class CuentaCredito implements Cuenta{

    private double fondos;
    private Moneda moneda;

    public CuentaCredito(double fondos, Moneda moneda) {
        this.fondos = fondos;
        this.moneda = moneda;
    }

    @Override
    public void depositar(double monto) {
        fondos += monto;
        System.out.println("Se ha depositado " + moneda.abreviatura() + " " + monto+ " en la cuenta de credito");
    }

    @Override
    public void pagarInteres() {
        System.out.println("No existe interes que pagar");
    }

    @Override
    public void printFondos() {
        System.out.printf("Los fondos de la cuenta de credito son: %s %.3f (Bs %.3f)\n\n", moneda.abreviatura(), fondos, fondos * moneda.tipoDeCambio());
    }
}
