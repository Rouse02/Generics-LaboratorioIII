import java.util.*;

public class ListaOrdenada<T extends Comparable<T>> {

    //Atributo
    private List<T> listaOrdenada;

    //Método constructor
    public ListaOrdenada() {
        this.listaOrdenada = new LinkedList<T>();
    }

    //Otros métodos
    public void agregarOrdenado(T elemento) {

        int posicion = 0;
        boolean encontrado = false;

        while(posicion < this.listaOrdenada.size() && !encontrado) {

            T elementoActual = this.listaOrdenada.get(posicion);

            if(elemento.compareTo(elementoActual) < 0) encontrado = true;

            else posicion++;
        }
            listaOrdenada.add(posicion, elemento);
    }

    public boolean eliminar(T elemento) {

        return listaOrdenada.remove(elemento);
    }

    public T buscarElemento(T elemento) {

        if(listaOrdenada.contains(elemento)) return elemento;
        else return null;
    }

    public T obtenerElemento(int posicion) {

        if(posicion >= 0 && posicion <= listaOrdenada.size()) return listaOrdenada.get(posicion);
        else return null;
    }

    public void mostrarElementos() {

        for(T elementoBuffer : this.listaOrdenada) {
            System.out.println("\n" + elementoBuffer.toString());
        }
    }
}
