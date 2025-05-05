import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PracticaLab {

    static BufferedReader leer = new BufferedReader(new InputStreamReader(System.in));
    static double notaEjercicio;

    public static void main(String[] args) throws IOException {

        while (notaEjercicio <= 70) {

            System.out.println("Digite la nota que nos va a poner por el ejercicio: ");
            notaEjercicio = Double.parseDouble(leer.readLine());

            if (notaEjercicio <= 50) {

                System.out.println("No profe... Ponga una mejor nota, por favor :(");

            } else if (notaEjercicio > 50 && notaEjercicio < 70) {

                System.out.println("Está pasable, pero no es suficiente para un 70...");

            } else {

                System.out.println("¡Gracias profe! Nos alegra que nos45 haya puesto un 70 o más :)");

            }
        }
    }
}