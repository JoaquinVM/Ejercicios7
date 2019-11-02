package ejercicio7.decorator;

public class Client {
    public static void main(String[] args){
        ICuenta cuenta = new CuentaBasica(1000, "Juan");
        cuenta = new BancaInternet(cuenta);
        cuenta = new SeguroCuenta(cuenta);
        cuenta = new Promocion(cuenta);

        System.out.println("Monto: " + cuenta.getMonto());
        System.out.println("Banca Internet activa: " + cuenta.isBancaInternetActiva());
    }
}
