// Install the Java helper library from twilio.com/docs/java/install
import com.twilio.rest.Twilio;
import com.twilio.rest.http.HttpMethod;
import com.twilio.rest.resource.api.v2010.account.Application;

public class Example {
  // Find your Account Sid and Token at twilio.com/user/account
  public static final String ACCOUNT_SID = "ACXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX";
  public static final String AUTH_TOKEN = "your_auth_token";

  public static void main(String[] args) {
    Twilio.init(ACCOUNT_SID, AUTH_TOKEN);

    Application app =
        Application.create("Phone Me").setVoiceUrl("http://demo.twilio.com/docs/voice.xml")
            .setVoiceMethod(HttpMethod.GET).execute();

    System.out.println(app.getSid());
  }
}
