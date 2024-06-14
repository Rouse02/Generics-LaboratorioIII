import java.util.Scanner;

public class GestionPilaPersona implements GestionPersona {

    //Atributo
    private Pila<Persona> pilaPersonas;

    //Método constructor
    public GestionPilaPersona() {
        this.pilaPersonas = new Pila<>();
    }

    //Otros métodos
    public void gestionarSubMenuEjercicio2(Scanner scanner) {

        int opcionMenu;

        do {
            System.out.println("\n1. Agregar persona a la Pila");
            System.out.println("2. Eliminar persona de la Pila");
            System.out.println("3. Pila vacía");
            System.out.println("4. Obtener tamaño de la Pila");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\nHa elegido la opción 1.");

                    this.pilaPersonas.agregar(pedirDatosPersona(scanner));
                    break;

                case 2:
                    System.out.println("\nHa elegido la opción 2.");

                    Persona isEliminado = this.pilaPersonas.eliminar(pedirDatosPersona(scanner));

                    if (isEliminado != null) System.out.println("\nPersona Eliminada: " + "\n" + isEliminado);
                    else System.out.println("\nPersona no encontrada");
                    break;

                case 3:
                    System.out.println("\nHa elegido la opción 3.");

                    boolean isPilaVacia = this.pilaPersonas.isEmpty();

                    if (isPilaVacia) System.out.println("\nPila vacía");
                    else System.out.println("\nLa pila no está vacía");
                    break;

                case 4:
                    System.out.println("\nHa elegido la opción 4.");

                    int sizePila = this.pilaPersonas.obtenerSize();
                    System.out.println("\nElementos de la pila: " + sizePila);
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
