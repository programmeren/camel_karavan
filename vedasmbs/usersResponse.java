import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 


@Configuration
@BindToRegistry("usersResponse")
public class usersResponse implements Processor {


    class users{
        private int id;
        private String firstName;
        private String lastName;
    }



    public void process(Exchange exchange) throws Exception {

        users user = new users();

        user.firstName = "eren";
        user.lastName = "meric";
        user.id = 3;

        ObjectWriter ow = new ObjectMapper().writer().withDefaultPrettyPrinter();
        String json = ow.writeValueAsString(user);
        exchange.getIn().setBody(json);
    }
}