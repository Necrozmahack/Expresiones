package expresiones;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

public class ValidacionNumerosTelefono {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un número de teléfono(ejemplo:(55) 1234-5678 o (933) 121-9389):");
        String numeroTelefono = scanner.nextLine();
        scanner.close();

        String regex = "^\\(\\d{2,3}\\) \\d{3,4}-\\d{4}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(numeroTelefono);

        if (matcher.matches()) {
            System.out.println("EL NUMERO ES VALIDO");
        } else {
            System.out.println("EL NUMERO NO ES VALIDO");
        }//cierre de else
    }//cierre de main
}//cierre de clase principal
