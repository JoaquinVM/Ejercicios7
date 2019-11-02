package ejercicio7.visitor;

public class Caballo implements IAnimal {
    private String enfermedad;

    public void recibirCuracion(){
        if(enfermedad != null){
            System.out.println("El caballo  ha sido curado de " + enfermedad);
            enfermedad = null;
        }
    }

    @Override
    public void accept(IVeterinario visitor) {
        visitor.visit(this);
    }

    @Override
    public void enfermarse(String enfermedad) {
        System.out.println("El caballo se ha enfermado de " + enfermedad);
        this.enfermedad = enfermedad;
    }

    public String getEnfermedad() {
        return enfermedad;
    }

}
