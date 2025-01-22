import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Configuration
@BindToRegistry("arrayListToStringProcessor")
public class arrayListToStringProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        
       ArrayList<String> list = exchange.getIn().getBody(ArrayList.class);

        // Convert the ArrayList to a comma-separated String
        String result = list.stream().collect(Collectors.joining(", "));

        // Set the result back to the exchange body
        exchange.getMessage().setBody(result);
        
    }
}