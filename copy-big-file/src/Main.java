import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        File sourceFile = new File("data/baguette cat.gif");
        File destFile = new File("destination/baguette cat.gif");

        try {
            copyFileUsingStream(sourceFile, destFile);
            System.out.print("Copy completed");
        } catch (IOException ioe) {
            System.out.print("Can't copy that file");
            System.out.printf(ioe.getMessage());
        }
    }

    private static void copyFileUsingStream (File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
