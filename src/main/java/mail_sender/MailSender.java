package mail_sender;

import java.io.FileNotFoundException;

public class MailSender {
    private MailInfo mailInfo;

    public MailSender (MailInfo mailInfo) {
        this.mailInfo = mailInfo;
    }

    private void send(String mail, String text) {
        System.out.format("Message was sended to %s", mail);
    }

    public void sendMail() throws FileNotFoundException {
        String mailText = mailInfo.getMailText();
        String mail = mailInfo.getClient().getMail();
        send(mail, mailText);
    }
}
