package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;
import ejercicio7.adapter.artefactos.Televisor;

public class AdapterTelevisor implements IDevice {

    private Televisor televisor;

    public AdapterTelevisor(Televisor televisor) {
        this.televisor = televisor;
    }

    @Override
    public int precio() {
        return televisor.costo();
    }

    @Override
    public int tiempoDeVida() {
        return televisor.tiempoGarantia() + 9;
    }
}
