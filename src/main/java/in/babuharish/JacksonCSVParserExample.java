package in.babuharish;


import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import in.babuharish.models.OrderDetailsResponse;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Objects;

public class JacksonCSVParserExample {

    public static void main(String[] args) throws IOException {

        // Now we try CSV Parsing
        final String CSV_DOC = "1,\"2,3\",true\n2,\"9,8\",false\n-13,\"0,7\",true\n";
        final CsvMapper mapper = new CsvMapper();
        CsvSchema schema = CsvSchema.builder()
                .addColumn("x")
                .addColumn("y")
                .addColumn("visible")
                .build();
        MappingIterator<Map<String, String>> it = mapper
                .readerForMapOf(String.class)
//                 NOTE: no wrapping needed
                .with(schema)
                .readValues(CSV_DOC);
        Map<String, String> row = it.nextValue();
        System.out.println("X : " + row.get ("x"));
        System.out.println("X : " + row.get ("y"));
        System.out.println("X : " + row.get ("visible"));

        MappingIterator<List<String>> newIterator = mapper
                .readerForListOf(String.class)
                .with(CsvParser.Feature.WRAP_AS_ARRAY) // !!! IMPORTANT
                .readValues(CSV_DOC);

//        or if not, we would instead:
//        StreamSupport.stream(Spliterators.spliteratorUnknownSize(newIterator, Spliterator.ORDERED), false)
//                .flatMap(item -> item.stream())
//                .forEach(System.out::println);

        while (newIterator.hasNextValue()) {
            List<String> newRow = newIterator.nextValue();
            newRow.stream().forEach(System.out::println);
        }
    }
}
