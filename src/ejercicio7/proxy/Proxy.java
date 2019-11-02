package ejercicio7.proxy;

public class Proxy implements IServidorPrincipal {

    private ServidorPrincipal servidorPrincipal = null;
    private ServidorSecundario servidorSecundario;

    public Proxy(){
        servidorSecundario = new ServidorSecundario();
    }

    @Override
    public boolean descarga(String archivo) {
        if(servidorPrincipal == null) servidorPrincipal = new ServidorPrincipal();
        if(archivo.endsWith(".zip") || archivo.endsWith(".rar")){

            if(servidorPrincipal.descarga(archivo)){
                servidorSecundario.addLog("Descarga de [" + archivo + "] exitosa");
                return true;
            }else{
                servidorSecundario.addLog("Descarga de [" + archivo + "] fallida, archivo no encontrado");
            }
        }else{
            servidorSecundario.addLog("Descarga de [" + archivo + "] fallida, extension incorrecta");
        }
        return false;
    }

    @Override
    public void cargar(String archivo) {
        if(servidorPrincipal == null) servidorPrincipal = new ServidorPrincipal();
        if(archivo.endsWith(".zip") || archivo.endsWith(".rar")){
            servidorSecundario.addLog("Carga archivo [" + archivo + "] exitosa");
            servidorPrincipal.cargar(archivo);
        }else{
            servidorSecundario.addLog("Carga archivo [" + archivo + "] fallida, extension incorrecta");
        }
    }

    public ServidorSecundario getServidorSecundario() {
        return servidorSecundario;
    }
}
