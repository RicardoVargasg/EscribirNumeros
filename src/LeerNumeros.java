import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class LeerNumeros {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";

        try (BufferedReader br = new BufferedReader(new FileReader(nombreArchivo))) {
            String linea;
            System.out.println("Leyendo...:");

            while ((linea = br.readLine()) != null) {
                System.out.println("Número: " + linea);
            }
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}