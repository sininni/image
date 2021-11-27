package mail_sender;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class MailBox {
    private List<MailInfo> infos = new ArrayList<>();

    public void addMailInfo(MailInfo mailInfo) {
        infos.add(mailInfo);
    }

    public void sendAll() throws FileNotFoundException {
        for (MailInfo info: infos) {
            MailSender mailSender = new MailSender(info);
            mailSender.sendMail();
        }
    }
}
