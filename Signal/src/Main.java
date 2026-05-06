import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

// Dennis Sanchez y Fran Arroyo
// Equipo 23
public class Main {
    static char [] abecedario={'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'ñ', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int numero, cifrado;
        ArrayList<String> palabras = new ArrayList<>();
        System.out.println("¿Cuantos mensajes quieres introducir? ");
        numero = sc.nextInt();
        sc.nextLine();
        for (int i =0; i < numero; i++){
            System.out.println("Mensaje " + (i+1) + ":");
            String mensaje =sc.nextLine();
            palabras.add(mensaje);
        }
        System.out.println("Introduce la clave de cifrado: ");
        cifrado = sc.nextInt();

        System.out.println("-----Mensajes originales----");
        for (int i = 0; i< palabras.size(); i++){
            System.out.println(palabras.get(i));
        }
        System.out.println("-----Mensajes cifrados----");
        for (int i= 0; i<palabras.size();i++){
            for (int j=0; j<palabras.get(i).length(); j++){
                for (int k=0; k<abecedario.length; k++){
                    if (palabras.get(j)==abecedario[k])
                }
            }
        }

    }
}




