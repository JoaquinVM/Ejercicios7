package ejercicio7.decorator;

import java.util.Random;

public class Promocion extends Decorator {

    private boolean ganoSorteo;

    public Promocion(ICuenta cuenta) {
        super(cuenta);
        int r = new Random().nextInt(100);
        ganoSorteo = r % 2 == 0;
    }

    @Override
    public double getMonto() {
        return ganoSorteo ? super.getMonto() * 2 : super.getMonto();
    }

    @Override
    public boolean isBancaInternetActiva(){
        return super.isBancaInternetActiva();
    }
}
