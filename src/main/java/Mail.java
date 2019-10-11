import org.apache.commons.mail.Email;
import org.apache.commons.mail.EmailException;
import org.apache.commons.mail.SimpleEmail;

public class Mail {


    public static void main(String[] args) throws EmailException {
        Email email = new SimpleEmail();
        email.setHostName("poczta.interia.pl");
        email.setAuthentication("kaco17", Inne.getPassik());
        email.setSSLOnConnect(true);
        email.setFrom("kaco17@interia.pl");
        email.setSubject("WITAM łazego");
        email.setMsg("meczyk//");
        email.addTo("bvb099@interia.pl");
        System.out.println("Przygotowanie Maila");
        email.send();
        System.out.println("Kiedy oglądamy mecz?");



    }
}
