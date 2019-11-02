package ejercicio7.decorator;

public class SeguroCuenta extends Decorator {
    public SeguroCuenta(ICuenta cuenta) {
        super(cuenta);
    }

    @Override
    public double getMonto() {
        return super.getMonto() * 0.95;
    }

    @Override
    public boolean isBancaInternetActiva(){
        return super.isBancaInternetActiva();
    }
}
