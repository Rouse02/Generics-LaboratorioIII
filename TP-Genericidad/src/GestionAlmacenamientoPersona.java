import java.util.Scanner;

public class GestionAlmacenamientoPersona implements GestionPersona {

    //Atributos
    private Almacenamiento<Persona> listadoPersonas;

    //Método constructor
    public GestionAlmacenamientoPersona() {
        this.listadoPersonas = new Almacenamiento<>();
    }

    //Otros método
    public void gestionarSubMenuEjercicio1(Scanner scanner) {
        int opcionMenu;

        do {
            System.out.println("\n1. Agregar persona");
            System.out.println("2. Eliminar persona");
            System.out.println("3. Buscar persona");
            System.out.println("4. Mostrar");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();

            switch (opcionMenu) {
                case 1:
                    scanner.nextLine();
                    System.out.println("\nHa elegido la opción 1.");
                    listadoPersonas.agregar(pedirDatosPersona(scanner));
                    break;

                case 2:
                    System.out.println("\nHa elegido la opción 2.");

                    boolean isEliminado = listadoPersonas.eliminar(pedirDatosPersona(scanner));

                    if(isEliminado) System.out.println("\nPersona eliminada con éxito");
                    else System.out.println("\nNo se encontró la persona\n");
                    break;

                case 3:
                    System.out.println("\nHa elegido la opción 3.");

                    Persona personaBuscada = listadoPersonas.buscar(pedirDatosPersona(scanner));

                    if(personaBuscada == null) System.out.println("\nPersona no encontrada");
                    else System.out.println("\nPersona encontrada");
                    break;

                case 4:
                    System.out.println("\nHa elegido la opción 4.");
                    listadoPersonas.mostrarAlmacenamiento();
                    break;

                case 5:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
            }
        }while(opcionMenu != 6);
    }

}
