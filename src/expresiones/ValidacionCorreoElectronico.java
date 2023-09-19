package expresiones;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ValidacionCorreoElectronico {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingresa el correo electronico: ");
        String correo = scanner.nextLine();
        scanner.close();

        String regex = "^[a-zA-Z0-9]+([._]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+([.-]?[a-zA-Z0-9]+)*\\.[a-zA-Z]{2,}$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(correo);

        if (matcher.matches()) {
            System.out.println("ES CORRECTO");
        } else {
            System.out.println("NO ES VALIDO");
        }//cierre de else
    }//cierre de main
}//cierre de clase principal
