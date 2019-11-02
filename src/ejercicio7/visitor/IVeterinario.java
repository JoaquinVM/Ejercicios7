package ejercicio7.visitor;

public interface IVeterinario {
    void visit(Perro perro);
    void visit(Gato gato);
    void visit(Caballo caballo);
}
