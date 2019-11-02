package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;

public class Celular implements IDevice {

    @Override
    public int precio() {
        return 600;
    }

    @Override
    public int tiempoDeVida() {
        return 10;
    }
}
