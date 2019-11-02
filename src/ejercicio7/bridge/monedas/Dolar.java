package ejercicio7.bridge.monedas;

public class Dolar implements Moneda {
    @Override
    public double tipoDeCambio() {
        return 6.96;
    }


    @Override
    public String abreviatura() {
        return "$";
    }
}
