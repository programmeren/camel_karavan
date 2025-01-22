import org.apache.camel.BindToRegistry;
import org.apache.camel.Configuration;
import org.apache.camel.Exchange;
import org.apache.camel.Processor;

import java.util.ArrayList;
import java.util.Map;

@Configuration
@BindToRegistry("dbArrayResultToFileContent")
public class dbArrayResultToFileContent implements Processor {

    public void process(Exchange exchange) throws Exception {



         ArrayList<Map<String, Object>> list = exchange.getIn().getBody(ArrayList.class);

        // Process the ArrayList (example: concatenate column_1 values)
        StringBuilder result = new StringBuilder();
        for (Map<String, Object> map : list) {
            if (map.containsKey("column_1")) {
                result.append(map.get("column_1")).append(", ");
            }
        }

        // Remove the trailing comma and space
        if (result.length() > 0) {
            result.setLength(result.length() - 2);
        }

        exchange.getIn().setBody(result);
    }
}