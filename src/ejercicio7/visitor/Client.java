package ejercicio7.visitor;

public class Client {
    public static void main(String[] args){
        Perro perro = new Perro();
        Gato gato = new Gato();
        Caballo caballo = new Caballo();

        Veterinario veterinario = new Veterinario();

        perro.enfermarse("Enfermedad1");
        gato.enfermarse("Enfermedad2");

        perro.accept(veterinario);
        gato.accept(veterinario);
        caballo.accept(veterinario);

    }
}
