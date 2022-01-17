import java.io.*;
import java.util.Scanner;

public class IOPractice {
    /*
    todo create a text file.
    todo read file using scanner class
    todo use PrintWriter to write to another file
     */
    public static void main(String[] args) {
        Scanner scannerIn = null;
        PrintWriter writer = null;
        try {
            scannerIn = new Scanner(new FileInputStream("ScannerInput"));
            writer = new PrintWriter(new FileOutputStream("outputScanner"));
            while (scannerIn.hasNext()) {
                //System.out.println(scannerIn.next());
                writer.println(scannerIn.next());
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } finally {
            scannerIn.close();
            writer.close();
        }
    }
}
