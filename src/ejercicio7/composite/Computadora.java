package ejercicio7.composite;

public class Computadora extends Component {

    private int precio;

    public Computadora(String name, int precio) {
        super(name);
        this.precio = precio;
    }

    public int getPrecio() {
        return precio;
    }

    @Override
    public int calcPrecio() {
        return precio;
    }

    @Override
    public void add(Component component) {
        System.out.println("not applicable on computadora");
    }

    @Override
    public void remove(Component component) {
        System.out.println("not applicable on computadora");
    }

    @Override
    public void getChild(int position) {
        System.out.println("\tComputadora: " + this.getName());
    }
}
