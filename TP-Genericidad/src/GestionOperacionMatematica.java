import java.util.Scanner;

public class GestionOperacionMatematica {

    //Atributos
    private OperaciónMatematica operacionesMatematicas;

    //Método constructor
    public GestionOperacionMatematica() {
        this.operacionesMatematicas = new OperaciónMatematica<>();
    }

    //Otros métodos
    public void gestionarSubMenuEjercicio3(Scanner scanner) {

        int opcionMenu;
        Validaciones validaciones = new Validaciones();
        boolean validacionCorrecta;
        Double resultado, numero1,  numero2;

        do {
            System.out.println("\nMenú de opciones\n");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("\nElija una opción: ");
            opcionMenu = scanner.nextInt();
            scanner.nextLine();

            switch (opcionMenu) {

                case 1:
                    do {
                        try {
                            System.out.println("\nIngrese el primer número");
                            numero1 = scanner.nextDouble();
                            System.out.println("\nIngrese el segundo número");
                            numero2 = scanner.nextDouble();

                            validaciones.verificarNumero(numero1, numero2);
                            operacionesMatematicas.establecerNumeros(numero1, numero2);

                            resultado = (Double)this.operacionesMatematicas.sumar();
                            System.out.println("\nResultado: " + resultado);
                            validacionCorrecta = true;
                        }
                        catch(InvalidNumber exception) {
                            System.out.println("\nError: " + exception.getMessage());
                            validacionCorrecta = false;
                        }
                    }while(!validacionCorrecta);
                    break;

                case 2:
                    do {
                        try {
                            System.out.println("\nIngrese el primer número");
                            numero1 = scanner.nextDouble();
                            System.out.println("\nIngrese el segundo número");
                            numero2 = scanner.nextDouble();

                            validaciones.verificarNumero(numero1, numero2);
                            operacionesMatematicas.establecerNumeros(numero1, numero2);

                            resultado = (Double)this.operacionesMatematicas.restar();
                            System.out.println("\nResultado: " + resultado);
                            validacionCorrecta = true;
                        }
                        catch(InvalidNumber exception) {
                            System.out.println("\nError: " + exception.getMessage());
                            validacionCorrecta = false;
                        }
                    }while(!validacionCorrecta);
                    break;

                case 3:
                    do {
                        try {
                            System.out.println("\nIngrese el primer número");
                            numero1 = scanner.nextDouble();
                            System.out.println("\nIngrese el segundo número");
                            numero2 = scanner.nextDouble();

                            validaciones.verificarNumero(numero1, numero2);
                            operacionesMatematicas.establecerNumeros(numero1, numero2);

                            resultado = (Double)this.operacionesMatematicas.multiplicar();
                            System.out.println("\nResultado: " + resultado);
                            validacionCorrecta = true;
                        }
                        catch(InvalidNumber exception) {
                            System.out.println("\nError: " + exception.getMessage());
                            validacionCorrecta = false;
                        }
                    }while(!validacionCorrecta);
                    break;

                case 4:
                    do {
                        try {
                            System.out.println("\nIngrese el primer número");
                            numero1 = scanner.nextDouble();
                            System.out.println("\nIngrese el segundo número");
                            numero2 = scanner.nextDouble();

                            validaciones.verificarNumero(numero1, numero2);
                            operacionesMatematicas.establecerNumeros(numero1, numero2);

                            resultado = (Double)this.operacionesMatematicas.dividir();
                            System.out.println("\nResultado: " + resultado);
                            validacionCorrecta = true;
                        }
                        catch(InvalidNumber exception) {
                            System.out.println("\nError: " + exception.getMessage());
                            validacionCorrecta = false;
                        }
                    }while(!validacionCorrecta);
                    break;

                default:
                    System.out.println("\nOpción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        }while(opcionMenu != 5);
    }
}
