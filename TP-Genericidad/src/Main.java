import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        GestionMenu menuOpciones = new GestionMenu();
        menuOpciones.gestionarMenu(scanner);
        scanner.close();
    }
}