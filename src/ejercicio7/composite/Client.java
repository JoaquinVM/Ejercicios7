package ejercicio7.composite;

public class Client {
    public static void main(String []args){
        Composite laboratorio1 = new Composite("laboratorio1");
        laboratorio1.add(new Computadora("Computadora1", 100));
        laboratorio1.add(new Computadora("Computadora2", 100));

        Composite laboratorio2 = new Composite("laboratorio2");
        laboratorio2.add(new Computadora("Computadora3", 100));
        laboratorio2.add(new Computadora("Computadora4", 100));


        Composite laboratorio3 = new Composite("laboratorio3");
        laboratorio3.add(new Computadora("Computadora5", 100));
        laboratorio3.add(new Computadora("Computadora6", 100));


        Composite contenedor = new Composite("contenedor");
        contenedor.add(laboratorio1);
        contenedor.add(laboratorio2);
        contenedor.add(laboratorio3);

        System.out.println("Precio total: " + contenedor.calcPrecio());

    }
}