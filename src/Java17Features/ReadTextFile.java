package Java17Features;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class ReadTextFile {
    public static void main(String[] args) {
        // Path to the file
        Path filePath = Paths.get("src/Java17Features/ReadUsingJava.txt");
        //System.out.println("Looking for file at: " + filePath.toAbsolutePath());
        try {
            // Read the content of the file as a single String
            String content = Files.readString(filePath);
            System.out.println("File Content:");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("An error occurred while reading the file.");
            e.printStackTrace();
        }
    }
}
