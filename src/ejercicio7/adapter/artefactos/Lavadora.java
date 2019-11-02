package ejercicio7.adapter.artefactos;

import ejercicio7.adapter.IArtefacto;

public class Lavadora implements IArtefacto {
    @Override
    public int costo() {
        return 1800;
    }

    @Override
    public int tiempoGarantia() {
        return 3;
    }
}
