import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;
import com.fasterxml.jackson.databind.ObjectMapper; 
import com.fasterxml.jackson.databind.ObjectWriter; 
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@Configuration
@BindToRegistry("usersResponse")
public class usersResponse implements Processor {

@JsonIgnoreProperties(ignoreUnknown = true)
    public static class User {
    
    private int id;
    private String firstName;
    private String lastName;

    // Default constructor
    public User() {}

    // Constructor
    public User(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    // Getters and Setters
    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getFirstName() { return firstName; }
    public void setFirstName(String firstName) { this.firstName = firstName; }

    public String getlastName() { return lastName; }
    public void setlastName(String lastName) { this.lastName = lastName; }

    
}
    
    public void process(Exchange exchange) throws Exception {

            ObjectMapper objectMapper = new ObjectMapper();

            String jsonBody = exchange.getIn().getBody(String.class);
            
            User user = objectMapper.readValue(jsonBody, User.class);
            
            String json = objectMapper.writeValueAsString(user);
     
            exchange.getMessage().setBody(json);
    }
}