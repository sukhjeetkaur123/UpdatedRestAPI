package serialiazeAndDeserialaization;


import org.apache.juneau.html.HtmlSerializer;
import org.apache.juneau.json.JsonParser;
import org.apache.juneau.json.JsonSerializer;
import org.apache.juneau.parser.ParseException;
import org.apache.juneau.serializer.SerializeException;
import org.apache.juneau.xml.XmlSerializer;

public class TestProduct {
    public static void main(String[] args) throws SerializeException, ParseException {
//        serilaization(serialaization)
    JsonSerializer jsonSerializer = JsonSerializer.DEFAULT_READABLE;
    String sellerName[] = {"abc","Abc", "sofware", "bbc", "software"};
    Product product = new Product("mac",12,"pink",sellerName);
    String json = jsonSerializer.serialize(product);
    System.out.println("the test is :"+json);

//    pojo to xml
        XmlSerializer xmlSerializer = XmlSerializer.DEFAULT_NS_SQ_READABLE;
       String xmlResponse = xmlSerializer.serialize(product);
       System.out.println(xmlResponse);

//       pojo to html
        HtmlSerializer htmlSerializer = HtmlSerializer.DEFAULT_SQ_READABLE;
        String htmlResponse = htmlSerializer.serialize(product);
        System.out.println(product);



//        deserialaization(deserialaisation)
        JsonParser jsonParser = JsonParser.DEFAULT;
        String jsonResponse = "{\n" +
                "\t\"color\": \"pink\",\n" +
                "\t\"name\": \"mac\",\n" +
                "\t\"price\": 12,\n" +
                "\t\"sellerName\": [\n" +
                "\t\t\"abc\",\n" +
                "\t\t\"Abc\",\n" +
                "\t\t\"sofware\",\n" +
                "\t\t\"bbc\",\n" +
                "\t\t\"software\"\n" +
                "\t]\n" +
                "}";
      Product pro =  jsonParser.parse(jsonResponse, Product.class);
      System.out.println("the de serialzation form "+pro.getColor());
        System.out.println("the de serialzation form "+pro);
    }


}
