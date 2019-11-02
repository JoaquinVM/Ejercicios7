package ejercicio7.bridge.monedas;

public class Euro implements Moneda {
    @Override
    public double tipoDeCambio() {
        return 7.66326;
    }

    @Override
    public String abreviatura() {
        return "EUR";
    }
}
