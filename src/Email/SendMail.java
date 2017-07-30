package email;

import java.util.Properties;
import java.util.Date;
import javax.mail.Address;
import javax.mail.Authenticator;
import javax.mail.Message;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;

public class SendMail {

    public static String sendMail(String toEmailId, String text, String subject) {
//mail bhejni...text...mail body msg+password...title of mail
        try {

//--[ Set up the default parameters
            Properties p = new Properties();
            p.put("mail.smtp.auth", "true");
            p.put("mail.transport.protocol", "smtp");
            p.put("mail.smtp.host", "smtp.gmail.com");
            p.put("mail.smtp.port", "587");
            p.put("mail.smtp.starttls.enable", "true");

//--[ Create the session and create a new mail message
            Authenticator auth = new SMTPAuthenticator("objbean1@gmail.com", "987456321");
            Session mailSession = Session.getInstance(p, auth);
            Message msg = new MimeMessage(mailSession);
//--[ Set the FROM, TO, DATE and SUBJECT fields
            msg.setFrom(new InternetAddress("objbean1@gmail.com"));
            msg.setRecipients(Message.RecipientType.TO, InternetAddress.parse(toEmailId));
            msg.setSentDate(new Date());
            msg.setSubject(subject);

//--[ Create the body of the mail
            msg.setText(text);
            Transport.send(msg);
            return "sent";
        } catch (Exception E) {
            System.out.println("Something gone wrong while sending mail!");
            return "falied";
        }
    }
}
