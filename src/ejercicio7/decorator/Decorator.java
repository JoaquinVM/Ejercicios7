package ejercicio7.decorator;

public class Decorator implements ICuenta {

    private ICuenta cuenta;

    public Decorator(ICuenta cuenta){
        this.cuenta = cuenta;
    }

    @Override
    public double getMonto() {
        return cuenta.getMonto();
    }

    @Override
    public boolean isBancaInternetActiva() {
        return cuenta.isBancaInternetActiva();
    }
}
