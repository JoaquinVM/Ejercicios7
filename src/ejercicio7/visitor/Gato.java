package ejercicio7.visitor;

public class Gato implements IAnimal {
    private String enfermedad;

    public void recibirCuracion(){
        if(enfermedad != null){
            System.out.println("El gato ha sido curado de " + enfermedad);
            enfermedad = null;
        }
    }

    @Override
    public void accept(IVeterinario visitor) {
        visitor.visit(this);
    }

    @Override
    public void enfermarse(String enfermedad) {
        System.out.println("El gato se ha enfermado de " + enfermedad);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

}
