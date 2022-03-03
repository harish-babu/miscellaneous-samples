package in.babuharish;


import com.fasterxml.jackson.databind.MappingIterator;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.dataformat.csv.CsvMapper;
import com.fasterxml.jackson.dataformat.csv.CsvParser;
import com.fasterxml.jackson.dataformat.csv.CsvSchema;
import in.babuharish.models.ItemsItem;
import in.babuharish.models.OrderDetailsResponse;
import org.glassfish.jersey.client.ClientConfig;
import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.model.internal.RankedComparator;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Invocation;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.Cookie;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class JacksonObjectMapperExample {

    public static void main(String[] args) throws IOException {

        // Read json file data to String
        // byte[] jsonData = Files.readAllBytes(Paths.get("OrderDetailsResponse.json"));

        // Create ObjectMapper instance
        // ObjectMapper objectMapper = new ObjectMapper();

        // Convert json string to object
        // OrderDetailsResponse orderDetailsResponse = objectMapper.readValue(jsonData, OrderDetailsResponse.class);

        Client client = ClientBuilder.newClient(new ClientConfig()).register(JacksonFeature.class) ;
        WebTarget webTarget = client.target("https://www.bigbasket.com/mapi/v4.0.0/order/invoice/")
                .queryParam("order_id", "223074270");

        Invocation.Builder invocationBuilder = webTarget.request(MediaType.APPLICATION_JSON);
        Response response = invocationBuilder
//                .cookie(Cookie.valueOf("_bb_ftvid=\"MjA5MDgyMDgzNw==|Yw0MTkMBA04jAFJVUFJRAhBTU18CQVhWUBB3LjE=\""))
                .cookie(Cookie.valueOf("_bb_vid=\"MjA5MDgyMDgzNw==\""))
//                .cookie(Cookie.valueOf("_bb_tc=0"))
//                .cookie(Cookie.valueOf("_client_version=2512"))
//                .cookie(Cookie.valueOf("_bb_rdt=\"MzEyNzg0MDAxMQ==.0\""))
//                .cookie(Cookie.valueOf("csurftoken=4E7auQ.MjA5MDgyMDgzNw==.1644726583165.eU90ewGerMye8+dEVkiqaepNsfx5iEUCbIU9Mygk9zY="))
//                .cookie(Cookie.valueOf("adb=0"))
//                .cookie(Cookie.valueOf("ufi=1"))
                .cookie(Cookie.valueOf("BBAUTHTOKEN=eyJ0eXAiOiJKV1QiLCJhbGciOiJIUzI1NiJ9.eyJjaGFmZiI6IlpOSl9JTm9xYlJLYVJ3IiwidGltZSI6MTY0NDcyNjY3MS44MzMyOTAzLCJtaWQiOjMyMTQyMjMsInZpZCI6MzM0NDkxODUzOSwiZGV2aWNlX2lkIjoiV0VCIiwic291cmNlX2lkIjoxLCJlY19saXN0IjpbMyw0LDEwLDEwMF0sIlRETFRPS0VOIjoiNDBlNGVlZjYtZWNlZC00YzJiLWI4YWUtY2JmNjg0NDA5OTNjIiwicmVmcmVzaF90b2tlbiI6ImQ1OTM3NGFkLTIzZmMtNGI0Yy04ZWVhLThkMjMwOGVlMWUyYSIsInRkbF9leHBpcnkiOjE2NDUzMzE0NzB9.hmR5dc1UwslFFp0TOF4rCZXdF75SCn9JU2t2wctbtqM"))
//                .cookie(Cookie.valueOf("_bb_mid=\"MzE1MzEzNTQ1Nw==\""))
//                .cookie(Cookie.valueOf("sessionid=fivenxsyefd5xu4s81b9t0ilzlppcgon"))
//                .cookie(Cookie.valueOf("access_token=40e4eef6-eced-4c2b-b8ae-cbf68440993c"))
//                .cookie(Cookie.valueOf("_sp_van_encom_hid=3273"))
//                .cookie(Cookie.valueOf("_bb_hid=3274"))
//                .cookie(Cookie.valueOf("_sp_bike_hid=3271"))
//                .cookie(Cookie.valueOf("csrftoken=HbF26lGZU4YNkPKHDBSNYQ6WSLV98lbVRFRVqWuVEjl1s5kB3IWWmPl2rOxizpDu"))
//                .cookie(Cookie.valueOf("_bb_rd=1"))
//                .cookie(Cookie.valueOf("device-type=pwa"))
//                .cookie(Cookie.valueOf("PWA=1"))
//                .cookie(Cookie.valueOf("_bb_cid=1"))
//                .cookie(Cookie.valueOf("_bb_aid=\"MzEzMjA1NjA2OQ==\""))
//                .cookie(Cookie.valueOf("bb_home_cache=278ce88b.3630.member.bbstar"))
//                .cookie(Cookie.valueOf("ReferrerURL=https://www.bigbasket.com/?nc=logo"))
//                .cookie(Cookie.valueOf("ReferrerSlug=/"))
//                .cookie(Cookie.valueOf("ReferrerInPageContext=menu"))
//                .cookie(Cookie.valueOf("ReferrerType=hp"))
//                .cookie(Cookie.valueOf("data={\"referrerInPageContext\":\"backbtn\"}"))
//                .cookie(Cookie.valueOf("ts=\"2022-02-13 10:17:56.419\""))
                .get();


        OrderDetailsResponse orderDetailsResponse = response.readEntity(OrderDetailsResponse.class);
//        System.out.println(response.readEntity(String.class));

        System.out.println("Order Details Response Status : " + orderDetailsResponse.getStatus());
        System.out.println("Order Number : " + orderDetailsResponse.getResponse().getOrderNumber());
        System.out.println("Order Id : " + orderDetailsResponse.getResponse().getOrderId());
        long numberOfItems = orderDetailsResponse.getResponse().getItems()
                .stream()
                .flatMap(item -> item.getLineItems().stream())
                .filter(Objects::nonNull)
                .count();

        System.out.println("Number of Items in Order : " + numberOfItems);
    }
}
