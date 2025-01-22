import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.stream.Collectors;

@Configuration
@BindToRegistry("arrayListToStringProcessor")
public class arrayListToStringProcessor implements Processor {

    public void process(Exchange exchange) throws Exception {
        
       ArrayList<Map<String, Object>> list = exchange.getIn().getBody(ArrayList.class);

        // Initialize a StringBuilder to build the result
        StringBuilder result = new StringBuilder();

        // Iterate over the list of maps and process the "column_1" data
        for (Map<String, Object> map : list) {
            // Extract value for "column_1"
            Object column1Value = map.get("column_1");
            if (column1Value != null) {
                result.append(column1Value.toString()).append(", ");
            }
        }

        // Remove the trailing comma and space if any
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        // Return the processed result
        return result.toString();
        
    }
}