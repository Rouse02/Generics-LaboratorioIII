import java.util.ArrayList;
import java.util.List;

public class Almacenamiento<T> {

    //Atributos
    private List<T> almacenamientoItems;

    //Método constructor
    public Almacenamiento() {
        this.almacenamientoItems = new ArrayList<>();
    }

    //Otros métodos
    public void agregar(T item) {

        this.almacenamientoItems.add(item);
    }

    public boolean eliminar(T item) {

        for (T almacenamientoBuffer : this.almacenamientoItems) {

            if (almacenamientoBuffer.equals(item)) {
                this.almacenamientoItems.remove(almacenamientoBuffer);
                return true;
            }
        }
        return false;
    }

    public T buscar(T item) {

        for(T almacenamientoBuffer : this.almacenamientoItems) if(almacenamientoBuffer.equals(item)) return almacenamientoBuffer;

        return null;
    }

    public List<T> getAlmacenamientoItems() {
        return almacenamientoItems;
    }

    public void setAlmacenamientoItems(List<T> nuevoAlmacenamientoItems) {
        this.almacenamientoItems = nuevoAlmacenamientoItems;
    }

    public void mostrarAlmacenamiento() {
        for(T almacenamientoBuffer : this.almacenamientoItems) System.out.println("\n" + almacenamientoBuffer.toString());
    }
}
