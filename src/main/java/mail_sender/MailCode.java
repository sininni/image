package mail_sender;

import java.io.File;
import java.io.FileNotFoundException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

public enum MailCode {
    HAPPY_BIRTHDAY("happy_birthday.txt"), GREETINGS("greetings.txt");

    private final String filename;

    MailCode(String filename) {
        this.filename = filename;
    }

    public String generateText() throws FileNotFoundException {
        File file = new File(filename);
        Scanner scanner = new Scanner(file);
        StringBuilder text = new StringBuilder();
        while (scanner.hasNextLine()) {
            text.append(scanner.nextLine());
        }
        String finalText = text.toString();

        // Read file
        // Inject client data
        // Return text
        return finalText;
    }
}
