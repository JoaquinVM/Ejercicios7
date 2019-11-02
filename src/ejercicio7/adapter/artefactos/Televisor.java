package ejercicio7.adapter.artefactos;

import ejercicio7.adapter.IArtefacto;

public class Televisor implements IArtefacto {
    @Override
    public int costo() {
        return 1500;
    }

    @Override
    public int tiempoGarantia() {
        return 2;
    }
}
