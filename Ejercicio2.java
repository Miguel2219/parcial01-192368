import java.util.Scanner;
public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese una cadena de texto:");
        String texto = scanner.nextLine();

        int contador = 0;
        boolean bandera = false;

        for (int i = 0; i < texto.length(); i++) {
            char indice = texto.charAt(i);

            if (indice != ' ') {
                if (!bandera) {
                    contador++;
                    bandera = true;
                }
            } else {
                bandera = false;
            }
        }

        System.out.println("El numero de palabras: " + contador);
    }



}

