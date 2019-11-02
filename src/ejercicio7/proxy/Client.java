package ejercicio7.proxy;

public class Client {
    public static void main(String[] args){
        Proxy proxy = new Proxy();
        proxy.cargar("hola.txt");
        proxy.cargar("chau.zip");
        proxy.descarga("hola.txt");
        proxy.descarga("chau.zip");
        proxy.descarga("hello.rar");

        proxy.getServidorSecundario().printLogs();
    }
}
