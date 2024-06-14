import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Conjunto <T> {

    //Atributos
    Set<T> conjunto = new HashSet<T>();

    //Método constructor
    public Conjunto() {

        this.conjunto = new HashSet<>();
    }

    //Otros métodos
    public boolean agregar(T elemento) {

        return conjunto.add(elemento);
    }

    public boolean eliminar(T elemento) {

        return this.conjunto.remove(elemento);
    }

    public T buscar(T elemento) {

        if(conjunto.contains(elemento)) return elemento;
        else return null;
    }

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Conjunto<?> conjunto1 = (Conjunto<?>) object;
        return Objects.equals(conjunto, conjunto1.conjunto);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(conjunto);
    }
}
