package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;
import ejercicio7.adapter.artefactos.Lavadora;

public class AdapterLavadora implements IDevice {

    private Lavadora lavadora;

    public AdapterLavadora(Lavadora lavadora) {
        this.lavadora = lavadora;
    }

    @Override
    public int precio() {
        return lavadora.costo();
    }

    @Override
    public int tiempoDeVida() {
        return lavadora.tiempoGarantia() + 8;
    }
}
