import java.io.IOException;
import java.util.Scanner;
import java.io.File;

public class Utils {
    public static Scanner readFile(String fileName) {
        File file = new File(fileName);
        try {
            return new Scanner(file);
        }
        catch (IOException ex) {
            System.out.println(String.format("Unable to read file, %1$s", ex.getMessage()));
        }

        return null;
    }
}
