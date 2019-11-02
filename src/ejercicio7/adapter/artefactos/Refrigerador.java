package ejercicio7.adapter.artefactos;

import ejercicio7.adapter.IArtefacto;

public class Refrigerador implements IArtefacto {
    @Override
    public int costo() {
        return 2000;
    }

    @Override
    public int tiempoGarantia() {
        return 5;
    }
}
