package ejercicio7.bridge.cuentas;

public  interface Cuenta {

    void depositar(double monto);
    void pagarInteres();
    void printFondos();

}
