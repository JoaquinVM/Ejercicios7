package ejercicio7.visitor;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Veterinario implements IVeterinario {

    private DateFormat dateFormat;

    public Veterinario(){
        dateFormat = new SimpleDateFormat("hh:mm:ss dd-MM-yyyy");
    }

    @Override
    public void visit(Perro perro) {
        String enfermedad = perro.getEnfermedad();

        if(enfermedad == null){
            System.out.println("El perro no esta enfermo");
        }else if (enfermedad.equals("Enfermedad1")){
            System.out.println("Se ha aplicado curacion para caninos de tipo A al perro - " + dateFormat.format(new Date()));
            perro.recibirCuracion();
        }else if(enfermedad.equals("Enfermedad2")){
            System.out.println("Se ha aplicado curacion para caninos de tipo B al perro - " + dateFormat.format(new Date()));
            perro.recibirCuracion();
        }else{
            System.out.println("No se pudo curar al perro ");
        }
    }

    @Override
    public void visit(Gato gato) {
        String enfermedad = gato.getEnfermedad();
        if(enfermedad == null){
            System.out.println("El gato no esta enfermo");
        }else if (enfermedad.equals("Enfermedad1")){
            System.out.println("Se ha aplicado curacion para felinos de tipo A al gato - " + dateFormat.format(new Date()));
            gato.recibirCuracion();
        }else if(enfermedad.equals("Enfermedad2")){
            System.out.println("Se ha aplicado curacion para felinos de tipo B al gato - " + dateFormat.format(new Date()));
            gato.recibirCuracion();
        }else{
            System.out.println("No se pudo curar al gato");
        }
    }

    @Override
    public void visit(Caballo caballo) {
        String enfermedad = caballo.getEnfermedad();
        if(enfermedad == null){
            System.out.println("El caballo no esta enfermo");
        }else if (enfermedad.equals("Enfermedad1")){
            System.out.println("Se ha aplicado curacion general de tipo A al caballo - " + dateFormat.format(new Date()));
            caballo.recibirCuracion();
        }else if(enfermedad.equals("Enfermedad2")){
            System.out.println("Se ha aplicado curacion general de tipo B al caballo - "  + dateFormat.format(new Date()));
            caballo.recibirCuracion();
        }else{
            System.out.println("No se pudo curar al caballo");
        }
    }
}
