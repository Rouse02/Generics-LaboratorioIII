import java.util.Scanner;

public interface GestionPersona {

    default Persona pedirDatosPersona(Scanner scanner) {

        Persona personaBuffer = null;

        String nombreApellido = pedirNombreApellido(scanner);
        String dni = pedirDNI(scanner);
        String telefono = pedirNroTelefono(scanner);
        String domicilio = pedirDomicilio(scanner);
        String edad = pedirEdad(scanner);
        System.out.println("\n");
        personaBuffer = new Persona(nombreApellido, edad, domicilio, telefono, dni);

        return personaBuffer;
    }

    default String pedirNombreApellido(Scanner scanner) {

        Validaciones validaciones = new Validaciones();
        boolean nombreApellidoValido;
        String nombreApellido;

        do {
            System.out.println("\nIngrese su nombre y apellido:");
            nombreApellido = scanner.nextLine();

            try {
                validaciones.validarEmptyString(nombreApellido);
                validaciones.validarString(nombreApellido);
                nombreApellidoValido = true;
            } catch (InvalidEmptyString exception) {
                System.out.println("\nError: " + exception.getMessage());
                nombreApellidoValido = false;
            } catch (InvalidString exception) {
                System.out.println("\nError: " + exception.getMessage());
                nombreApellidoValido = false;
            }
        } while (!nombreApellidoValido);

        return nombreApellido;
    }

    default String pedirDNI(Scanner scanner) {

        Validaciones validaciones = new Validaciones();
        boolean nroDniValido;
        String nroDNI;

        do {
            System.out.println("\nIngrese su número de DNI:");
            nroDNI = scanner.nextLine();

            try {
                validaciones.validarEmptyString(nroDNI);
                validaciones.validarDNI(nroDNI);
                nroDniValido = true;
            }
            catch(InvalidEmptyString exception) {
                System.out.println("\nError: " + exception.getMessage());
                nroDniValido = false;
            }
            catch(InvalidDNI exception) {
                System.out.println("\nError: " + exception.getMessage());
                nroDniValido = false;
            }
        }while(!nroDniValido);

        return nroDNI;
    }

    default String pedirNroTelefono(Scanner scanner) {

        Validaciones validaciones = new Validaciones();
        boolean nroTelefonoValido;
        String nroTelefono;

        do {
            System.out.println("\nIngrese su número de teléfono:");
            nroTelefono = scanner.nextLine();

            try {
                validaciones.validarEmptyString(nroTelefono);
                validaciones.validarNumeroTelefonico(nroTelefono);
                nroTelefonoValido = true;
            }
            catch(InvalidEmptyString exception) {
                System.out.println("\nError: " + exception.getMessage());
                nroTelefonoValido = false;
            }
            catch(InvalidPhone exception) {
                System.out.println("\nError: " + exception.getMessage());
                nroTelefonoValido = false;
            }
        }while(!nroTelefonoValido);

        return nroTelefono;
    }

    default String pedirDomicilio(Scanner scanner) {

        Validaciones validaciones = new Validaciones();
        boolean domicilioValido;
        String domicilio;

        do {
            System.out.println("\nIngrese su domicilio:");
            domicilio = scanner.nextLine();

            try {
                validaciones.validarEmptyString(domicilio);
                validaciones.validarDomicilio(domicilio);
                domicilioValido = true;
            }
            catch(InvalidEmptyString exception) {
                System.out.println("\nError: " + exception.getMessage());
                domicilioValido = false;
            }
            catch(InvalidAddress exception) {
                System.out.println("\nError: " + exception.getMessage());
                domicilioValido = false;
            }
        }while(!domicilioValido);

        return domicilio;
    }

    default String pedirEdad(Scanner scanner) {

        Validaciones validaciones = new Validaciones();
        boolean edadValida;
        String edad;

        do {
            System.out.println("\nIngrese su edad:");
            edad = scanner.nextLine();

            try {
                validaciones.validarEmptyString(edad);
                validaciones.validarEdad(edad);
                edadValida = true;
            }
            catch(InvalidEmptyString exception) {
                System.out.println("\nError: " + exception.getMessage());
                edadValida = false;
            }
            catch(InvalidAge exception) {
                System.out.println("\nError: " + exception.getMessage());
                edadValida = false;
            }
        }while(!edadValida);

        return edad;
    }
}
