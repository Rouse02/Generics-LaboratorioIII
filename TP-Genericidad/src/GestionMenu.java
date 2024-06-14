import java.util.Scanner;

public class GestionMenu {

    public GestionMenu() {}

    public void gestionarMenu(Scanner scanner) {

        int opcionMenu;

        do {
            System.out.println("\nMenú de opciones\n");
            System.out.println("1. Ejercicio 1");
            System.out.println("2. Ejercicio 2");
            System.out.println("3. Ejercicio 3");
            System.out.println("4. Ejercicio 4");
            System.out.println("5. Ejercicio 5");
            System.out.println("6. Salir");
            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {
                case 1:
                    System.out.println("\nHa elegido la opción 1.\n");

                    GestionAlmacenamientoPersona gestionarPersonasAlmacenamiento = new GestionAlmacenamientoPersona();
                    gestionarPersonasAlmacenamiento.gestionarSubMenuEjercicio1(scanner);
                    break;

                case 2:
                    System.out.println("\nHa elegido la opción 2.");

                    GestionPilaPersona gestionarPersonasPila = new GestionPilaPersona();
                    gestionarPersonasPila.gestionarSubMenuEjercicio2(scanner);
                    break;

                case 3:
                    System.out.println("\nHa elegido la opción 3.");

                    GestionOperacionMatematica gestionarOperacionesMatematicas = new GestionOperacionMatematica();
                    gestionarOperacionesMatematicas.gestionarSubMenuEjercicio3(scanner);
                    break;

                case 4:
                    System.out.println("\nHa elegido la opción 4.");

                    GestionConjunto gestionarConjuntoPersonas = new GestionConjunto();
                    gestionarConjuntoPersonas.subMenuEjercicio4(scanner);
                    break;

                case 5:
                    System.out.println("\nHa elegido la opción 5.");

                    GestionListaOrdenada gestionarListaPersonas = new GestionListaOrdenada();
                    gestionarListaPersonas.gestionarSubMenuEjercicio5(scanner);
                    break;

                case 6:
                    System.out.println("\nSaliendo del programa...");
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }while(opcionMenu != 6);
    }
}
