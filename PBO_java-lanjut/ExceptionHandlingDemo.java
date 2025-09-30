import java.io.FileReader;
import java.io.IOException;

public class ExceptionHandlingDemo {

    public static void main(String[] args) {
        // Try-Catch-Finally
        try {
            int hasil = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Terjadi error: " + e.getMessage());
        } finally {
            System.out.println("Blok finally selalu dijalankan");
        }

        // Throw
        cekUmur(15);
    }

    public static void cekUmur(int umur) {
        if (umur < 18) {
            throw new IllegalArgumentException("Umur harus >= 18");
        }
    }

    public void bacaFile(String namaFile) throws IOException {
        FileReader file = new FileReader(namaFile);
    }
}
