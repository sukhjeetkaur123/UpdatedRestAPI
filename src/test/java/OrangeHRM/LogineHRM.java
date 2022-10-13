package OrangeHRM;

import com.fasterxml.jackson.databind.ObjectMapper;
import comJson_parsing_getSet.Person;
import groovy.lang.GString;
import io.github.bonigarcia.wdm.WebDriverManager;
import jdk.internal.org.objectweb.asm.tree.analysis.Value;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.List;

import static java.lang.String.valueOf;

public class LogineHRM {

    private static final String USER_DATA = "(//div[@class=\"oxd-table-row oxd-table-row--with-border oxd-table-row--clickable\"]//div[@role=\"cell\"])[%d]";

    WebDriver driver = WebDriverManager.chromedriver().create();

    public void initialize() throws InterruptedException {
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(4000);

        driver.manage().window().maximize();
        driver.findElement(By.xpath("//input[@name='username']")).sendKeys("Admin");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//input[@name='password']")).sendKeys("admin123");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
        Thread.sleep(3000);
    }

//    public Map<String, String> getSensorValue() throws IOException {
//
//        HashMap<String, String> a = new HashMap<>();
//        a.put("First Name", userData.getFirstName());
//        a.put("Last Name", userData.getLastName());
//        return a;


//        getSensorValue().putAll(userData.);
//        gsensorValues.put("x","25");
//        sensorValues.put("y","26");
//        sensorValues.put("z","27");
//         sensorValues;
//    }

    public void verifyUiVAlueWithAPIValue() throws Exception {


        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\SukhjeetKaur\\RestAPI\\TestData\\empinfo.json"));
        ObjectMapper mapper = new ObjectMapper();
        UserData person = mapper.readValue(jsonData, UserData.class);
//        UserData userData = mapper.readValue(jsonData, UserData.class);
//        HashMap<String, String> actual = new HashMap<>();
//        actual.put("First Name", person.getFirstName());
//        actual.put("Last Name", person.getLastName());
//        List<WebElement> elements = driver.findElements(By.xpath("(//div[@role='row'])[2]"));
//        for (WebElement e : elements) {
//        List<HashMap> imageInfo = new ArrayList<HashMap>();
//        HashMap<String, String> attributes = new HashMap<>();
//        imageInfo.add(attributes);
//            System.out.println("the actual value" + userData.get());
//            System.out.println("the expect value" + e.getText());
//            ArrayList<String> expectedText = new ArrayList<String>();
//           Boolean res = expectedText.add(e.getText());

//            Assert.assertEquals(actual, e.getText());


        List<WebElement> uiValues = driver.findElements(By.xpath(String.format(USER_DATA, person.getIndex())));
        System.out.println("Number of elements:" + uiValues.size());

        for (int i = 2; i < uiValues.size(); i++) {
            System.out.println("text:" + uiValues.get(i).getText());
        }

//        verifyCardValuesOnUI(uiValues., userData.getEmployeeId(), EmpDetails.values());
//      System.out.println("the hashmap data is :"+a);
//        System.out.println("the text is from json file :" + userData.getEmployeeId());
//        String s = (new StringBuilder()).append("00").append(userData.getEmployeeId()).toString();
//        System.out.println("the text of id is :" + s);
//        String data = "(//div[@role='row'])[2]";
//        List<WebElement> elements = driver.findElements(By.xpath(data));
//        for (WebElement e : elements) {
//            System.out.println("the text is :" + e.getText());
    }

    public void verifyUiValueWithAPI() throws Exception {

        byte[] jsonData = Files.readAllBytes(Paths.get("C:\\Users\\SukhjeetKaur\\RestAPI\\TestData\\empinfo.json"));
        ObjectMapper mapper = new ObjectMapper();
        UserData person = mapper.readValue(jsonData, UserData.class);
        HashMap<String, String> actual = new HashMap<>();
        actual.put("First Name", person.getFirstName());
       actual.put("Last Name", person.getLastName());
          for (int i = 3; i<5; i++) {
            WebElement uiValues = driver.findElement(By.xpath(String.format(USER_DATA, i)));
            System.out.println("text:" + uiValues.getText());
            Assert.assertEquals(actual.values(), uiValues.getText());
       }
    }


    public static void main(String[] args) throws Exception {
        LogineHRM gs = new LogineHRM();
        gs.initialize();
//        gs.verifyUiVAlueWithAPIValue();

        gs.verifyUiValueWithAPI();
//        Map<String, String> ak = gs.getSensorValue();
//        System.out.println(ak);
    }

    public <T, E extends Enum<?>> void verifyCardValuesOnUI(List<String> cardUIValues, T random, E[] uiEnum) throws Exception {
        for (E field : uiEnum) {
            ReflectionUtil.verifyUIValue(random, cardUIValues, field);
        }
    }
}


