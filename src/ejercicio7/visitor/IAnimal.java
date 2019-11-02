package ejercicio7.visitor;

public interface IAnimal {
    void accept(IVeterinario visitor);
    void enfermarse(String enfermedad);
    void recibirCuracion();
}
