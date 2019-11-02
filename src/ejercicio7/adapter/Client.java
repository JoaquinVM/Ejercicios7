package ejercicio7.adapter;

import ejercicio7.adapter.artefactos.Lavadora;
import ejercicio7.adapter.artefactos.Refrigerador;
import ejercicio7.adapter.artefactos.Televisor;
import ejercicio7.adapter.devices.*;

public class Client {
    public static void main(String[] args){

        Celular celular = new Celular();
        Computadora computadora = new Computadora();
        Tablet tablet = new Tablet();

        Lavadora lavadora = new Lavadora();
        Refrigerador refrigerador = new Refrigerador();
        Televisor televisor = new Televisor();

        AdapterLavadora adapterLavadora = new AdapterLavadora(lavadora);
        AdapterRegriferador adapterRegriferador = new AdapterRegriferador(refrigerador);
        AdapterTelevisor adapterTelevisor = new AdapterTelevisor(televisor);

        IDevice devices[] = {celular, computadora, tablet, adapterLavadora, adapterRegriferador, adapterTelevisor};

        for(IDevice device : devices){
            System.out.println("Precio: " + device.precio() + ", Tiempo de vida: " + device.tiempoDeVida());
        }
    }
}
