package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;

public class Tablet implements IDevice {
    @Override
    public int precio() {
        return 800;
    }

    @Override
    public int tiempoDeVida() {
        return 10;
    }
}
