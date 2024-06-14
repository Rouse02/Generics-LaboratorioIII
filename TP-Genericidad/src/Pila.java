import java.util.ArrayList;
import java.util.EmptyStackException;
import java.util.List;

public class Pila<T> {

    //Atributos
    private List<T> pilaDeObjects;

    //Método constructor
    public Pila() {
        this.pilaDeObjects = new ArrayList<T>();
    }

    //Otros métodos
    public void agregar(T object) {

        this.pilaDeObjects.add(object);
    }

    public boolean isEmpty() {

        if(this.pilaDeObjects.size() == 0) return true;
        else return false;
    }

    public T eliminar(T object) {

        if(!isEmpty()) {
            for(T pilaBuffer : this.pilaDeObjects) {

                if(pilaBuffer.equals(object)) {
                    this.pilaDeObjects.remove(this.pilaDeObjects.size() - 1);
                    return object;
                }
            }
        }
        return null;
    }

    public int obtenerSize() {
        return this.pilaDeObjects.size();
    }
}
