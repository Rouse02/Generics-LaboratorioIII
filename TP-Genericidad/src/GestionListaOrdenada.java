import java.util.Scanner;

public class GestionListaOrdenada implements GestionPersona {

    //Atributo
    ListaOrdenada<Persona> listaOrdenadaPersonas;

    //Método constructor
    public GestionListaOrdenada() {
        this.listaOrdenadaPersonas = new ListaOrdenada<>();
    }

    //Otros métodos
    public void gestionarSubMenuEjercicio5(Scanner scanner) {

        int opcionMenu;

        do {
            System.out.println("\n1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Obtener persona mediante índice");
            System.out.println("4. Mostrar elementos");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\nHa elegido la opción 1.");

                    listaOrdenadaPersonas.agregarOrdenado(pedirDatosPersona(scanner));
                    break;

                case 2:
                    System.out.println("\nHa elegido la opción 2.");

                    boolean isEliminado = listaOrdenadaPersonas.eliminar(pedirDatosPersona(scanner));
                    if (isEliminado) System.out.println("\nPersona eliminada");
                    else System.out.println("\nPersona no eliminada");
                    break;

                case 3:
                    System.out.println("\nHa elegido la opción 3.");

                    System.out.println("\nIngrese la posición: ");
                    int posicion = scanner.nextInt();

                    Persona personaBuffer = listaOrdenadaPersonas.obtenerElemento(posicion);

                    if (personaBuffer != null) System.out.println("\nPersona: " + personaBuffer.toString());
                    else System.out.println("\nPersona no encontrada");
                    break;

                case 4:
                    System.out.println("\nHa elegido la opción 4.");

                    listaOrdenadaPersonas.mostrarElementos();
                    break;

                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }while(opcionMenu != 5);
    }
}
