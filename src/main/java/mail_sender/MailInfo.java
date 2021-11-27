package mail_sender;

import lombok.Getter;

import java.io.FileNotFoundException;
import java.util.HashMap;

@Getter
public class MailInfo {
    private MailCode mailCode;
    private Client client;

    public String getMailText() throws FileNotFoundException {
        String text = mailCode.generateText();
        HashMap<String, String> templates = new HashMap<>();
        templates.put("%NAME%", client.getName());
        for (String key: templates.keySet()) {
            text = text.replace(key, templates.get(key));
        }
        return text;
    }

}
