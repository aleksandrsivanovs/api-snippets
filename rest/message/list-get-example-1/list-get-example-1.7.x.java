// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.rest.Twilio;
import com.twilio.rest.resource.ResourceSet;
import com.twilio.rest.resource.api.v2010.account.Message;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    ResourceSet<Message> messages = Message.read().execute();

    // Loop over messages and print out a property for each one.
    for (Message message : messages) {
      System.out.println(message.getBody());
    }
  }
}
