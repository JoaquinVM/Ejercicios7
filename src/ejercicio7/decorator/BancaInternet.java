package ejercicio7.decorator;

public class BancaInternet extends Decorator {
    public BancaInternet(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public double getMonto() {
        return super.getMonto();
    }

    @Override
    public boolean isBancaInternetActiva() {
        return true;
    }
}
