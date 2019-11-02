package ejercicio7.bridge;

import ejercicio7.bridge.cuentas.CuentaAhorros;
import ejercicio7.bridge.cuentas.CuentaCredito;
import ejercicio7.bridge.cuentas.CuentaPlazoFijo;
import ejercicio7.bridge.monedas.Boliviano;
import ejercicio7.bridge.monedas.Dolar;
import ejercicio7.bridge.monedas.Euro;

public class Client {
    public static void main(String[] args){
        Boliviano boliviano = new Boliviano();
        Dolar dolar = new Dolar();
        Euro euro = new Euro();

        CuentaAhorros cuentaAhorros = new CuentaAhorros(7000, boliviano);
        CuentaPlazoFijo cuentaPlazoFijo = new CuentaPlazoFijo(1000, euro);
        CuentaCredito cuentaCredito = new CuentaCredito(1000, dolar);

        cuentaAhorros.depositar(700);
        cuentaAhorros.pagarInteres();
        cuentaAhorros.printFondos();

        cuentaPlazoFijo.depositar(100);
        cuentaPlazoFijo.pagarInteres();
        cuentaPlazoFijo.printFondos();

        cuentaCredito.depositar(100);
        cuentaCredito.pagarInteres();
        cuentaCredito.printFondos();
    }
}
