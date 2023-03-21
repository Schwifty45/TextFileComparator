import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class TextFileComparator {

    public static void main(String[] args) {
        String file1 = "src/main/java/file1.txt";
        String file2 = "src/main/java/file2.txt";

        try {
            BufferedReader reader1 = new BufferedReader(new FileReader(file1));
            BufferedReader reader2 = new BufferedReader(new FileReader(file2));

            String line1 = reader1.readLine();
            String line2 = reader2.readLine();
            int lineNumber = 1;

            while (line1 != null || line2 != null) {
                if (!line1.equals(line2)) {
                    System.out.println("Line " + lineNumber + ": case switch " + line1 + " case switch");
                    System.out.println("Line " + lineNumber + ": case switch " + line2 + " case switch");
                }

                line1 = reader1.readLine();
                line2 = reader2.readLine();
                lineNumber++;
            }

            reader1.close();
            reader2.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
