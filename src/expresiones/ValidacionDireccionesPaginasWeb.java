package expresiones;

import java.util.ArrayList;
import java.util.regex.*;

public class ValidacionDireccionesPaginasWeb {

    public static void main(String[] args) {
        String texto = "Este es un texto de ejemplo que contiene algunas direcciones de p ́aginas web.\n"
                + "Puedes encontrar URLs como https://www.ejemplo.com, http://www.otra-url.com,\n"
                + "\n"
                + "o incluso www.sitio-web.org. Aseg ́urate de buscar todas las URLs, independien-\n"
                + "temente de si comienzan con ”https://”, ”http://”, o simplemente ”www.”.";

        ArrayList<String> urls = obtenerURL(texto);

        System.out.println("URLs encontradas:");
        for (String url : urls) {
            System.out.println(url);
        }//cierre del for
    }//cierre del main

    public static ArrayList<String> obtenerURL(String texto) {

        // Expresión regular corregida
        String regex = "(https?://)?(www\\.)?[a-zA-Z0-9\\-]+(\\.[a-zA-Z]+)+(/[a-zA-Z0-9\\-._~:/?#\\[\\]@!$&'()*+,;=]*)?";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(texto);
        ArrayList<String> urls = new ArrayList<>();

        while (matcher.find()) {
            String url = matcher.group();
            urls.add(url);
        }//cierre del while

        return urls;
    }//cierre de obtenerURL
}//cierre de la clase principal
