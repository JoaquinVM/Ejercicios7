package ejercicio7.adapter.devices;

import ejercicio7.adapter.IDevice;

public class Computadora implements IDevice {
    @Override
    public int precio() {
        return 1000;
    }

    @Override
    public int tiempoDeVida() {
        return 12;
    }
}
