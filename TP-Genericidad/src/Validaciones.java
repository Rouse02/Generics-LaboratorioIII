public class Validaciones {

    public Validaciones() {}

    //Verificamos que un String no esté vacío
    public boolean validarEmptyString(String cadenaTexto) throws InvalidEmptyString {

        if(!cadenaTexto.isEmpty()) return true;
        else throw new InvalidEmptyString("La cadena no puede ser vacía");
    }

    //Verificamos que un String no contenga caracteres especiales y números
    public boolean validarString(String cadenaTexto) throws InvalidString {

        if((cadenaTexto.matches(".*\\d.*") || (cadenaTexto.matches(".*[!@#$%^&*()\\[\\]{};:,.<>?\\/\\\\].*")))) throw new InvalidString("La cadena contiene al menos un número o caracteres especiales");
        else return true;
    }

    //Verificamos que el DNI contenga 8 dígitos numéricos enteros
    public boolean validarDNI(String numeroDNI) throws InvalidDNI {

        if(numeroDNI.matches("\\d{8}")) return true;
        else throw new InvalidDNI("El DNI debe contener 8 dígitos numéricos enteros");
    }

    //Verificamos que el número de teléfono contenga 10 dígitos numéricos enteros
    public boolean validarNumeroTelefonico(String numeroTelefono)  throws InvalidPhone {

        if(numeroTelefono.matches("\\d{10}")) return true;
        else throw new InvalidPhone("El número telefónico debe contener 10 dígitos numéricos enteros");
    }

    //Verificamos que la dirección contenga al menos una letra y al menos un número entero
    public boolean validarDomicilio(String domicilio) throws InvalidAddress {

        if((domicilio.matches(".*[a-zA-Z].*") && domicilio.matches(".*\\d.*"))) return true;
        else throw new InvalidAddress("El domicilio debe contener letras y números enteros");
    }

    //Verificamos que la edad contenga al menos un número entero y que esté comprendido entre 1-110
    public boolean validarEdad(String edad) throws InvalidAge {

        if(edad.matches("([1-9]|[1-9][0-9]|1[0-1][0-9]|110)")) return true;
        else throw new InvalidAge("La edad debe contener números enteros comprendidos entre 1-110");
    }

    //Verificar que los números ingresados no sean null
    public boolean verificarNumero(Double nro1, Double nro2) throws InvalidNumber {

        if(nro1 != null && nro2 != null) return true;
        else throw new InvalidNumber("Número inválido");
    }
}
