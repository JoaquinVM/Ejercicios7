package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;
import ejercicio7.adapter.artefactos.Refrigerador;

public class AdapterRegriferador implements IDevice {

    private Refrigerador refrigerador;

    public AdapterRegriferador(Refrigerador refrigerador) {
        this.refrigerador = refrigerador;
    }

    @Override
    public int precio() {
        return refrigerador.costo();
    }

    @Override
    public int tiempoDeVida() {
        return refrigerador.tiempoGarantia() + 10;
    }
}
