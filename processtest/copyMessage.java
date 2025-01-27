import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

@Configuration
@BindToRegistry("copyMessage")
public class copyMessage implements Processor {
    public Exchange copiedExchange;
    public void process(Exchange exchange) throws Exception {
        copiedExchange = exchange.copy();
        exchange = copiedExchange;
        
    }
    public Exchange getMessage(){

        return copiedExchange;

    }

}