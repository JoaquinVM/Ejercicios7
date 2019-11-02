package ejercicio7.bridge.monedas;

public class Boliviano implements Moneda {
    @Override
    public double tipoDeCambio() {
        return 1;
    }

    @Override
    public String abreviatura() {
        return "Bs";
    }
}
