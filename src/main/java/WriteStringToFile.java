import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class WriteStringToFile {
    public static void Writetofile(ArrayList<String> args) {
        try {
            File file = new File("TIC arrays.txt");
            FileWriter fileWriter = new FileWriter(file);
            for (int i=0;i<10;i++) {
                String str = args.get(i);
                fileWriter.write(str);
            }
        } catch (IOException exception) {
            System.out.println("File not there");
        }
    }
}