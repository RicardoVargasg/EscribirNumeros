import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class EscribirNumeros {
    public static void main(String[] args) {
        String nombreArchivo = "numeros.txt";

        try (BufferedWriter bw = new BufferedWriter(new FileWriter(nombreArchivo))) {
            for (int i = 1; i <= 10; i++) {
                bw.write(String.valueOf(i));
                bw.newLine();
            }
            System.out.println("Archivo creado");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}