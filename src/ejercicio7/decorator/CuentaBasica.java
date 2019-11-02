package ejercicio7.decorator;

public class CuentaBasica implements ICuenta {

    private int monto;
    private String nombrePropietario;

    public CuentaBasica(int monto, String nombrePropietario) {
        this.monto = monto;
        this.nombrePropietario = nombrePropietario;
    }

    @Override
    public double getMonto() {
        return monto;
    }

    @Override
    public boolean isBancaInternetActiva(){
        return false;
    }
}
