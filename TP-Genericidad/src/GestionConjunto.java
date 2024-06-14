import java.util.Scanner;

public class GestionConjunto implements GestionPersona {

    //Atributo
    private Conjunto<Persona> conjuntoDePersonas;

    //Método constructor
    public GestionConjunto() {
        this.conjuntoDePersonas = new Conjunto<>();
    }

    //Otros métodos
    public void subMenuEjercicio4(Scanner scanner) {

        int opcionMenu;
        boolean verificacion;

        do {
            System.out.println("\nMenú de opciones\n");
            System.out.println("1. Agregar persona al conjunto");
            System.out.println("2. Eliminar persona del conjunto");
            System.out.println("3. Buscar persona en el conjunto");
            System.out.println("4. Salir");

            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\nHa elegido la opción 1.\n");

                    verificacion = this.conjuntoDePersonas.agregar(pedirDatosPersona(scanner));
                    if(verificacion) System.out.println("\nPersona agregada con éxito");
                    else System.out.println("\nPersona no agregada");
                    break;

                case 2:
                    System.out.println("\nHa elegido la opción 2.");

                    verificacion = this.conjuntoDePersonas.eliminar(pedirDatosPersona(scanner));
                    if(verificacion) System.out.println("\nPersona eliminada con éxito");
                    else System.out.println("\nPersona no eliminada");
                    break;

                case 3:
                    System.out.println("\nHa elegido la opción 3.");

                    Persona personaBuffer = this.conjuntoDePersonas.buscar(pedirDatosPersona(scanner));
                    if(personaBuffer != null) System.out.println("\nPersona encontrada: " + personaBuffer.toString());
                    else System.out.println("\nPersona no encontrada");
                    break;

                case 4:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }while(opcionMenu != 4);
    }
}
