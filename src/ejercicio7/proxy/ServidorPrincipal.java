package ejercicio7.proxy;

import java.util.ArrayList;
import java.util.List;

public class ServidorPrincipal implements IServidorPrincipal {

    private List<String> archivos;

    public ServidorPrincipal(){
        archivos = new ArrayList<>();
    }


    @Override
    public boolean descarga(String archivo) {
        return archivos.contains(archivo);
    }

    @Override
    public void cargar(String archivo) {
        archivos.add(archivo);
    }
}
