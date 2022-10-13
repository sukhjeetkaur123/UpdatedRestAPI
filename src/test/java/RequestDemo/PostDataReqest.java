package RequestDemo;

import base.BaseTest;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

import static io.restassured.RestAssured.given;

public class PostDataReqest extends BaseTest {
    @Test
    public void CreatePostRequestAndVerifyStatusCodeAndStatusLine() throws IOException {
        PostReqest req=new PostReqest();

        FileInputStream fis = new FileInputStream(System.getProperty("user.dir")+"\\TestData\\test.xls");
        HSSFWorkbook workbook = new HSSFWorkbook(fis);
        HSSFSheet sheet = workbook.getSheetAt(0);
        String name = sheet.getRow(1).getCell(0).getStringCellValue();
        String job = sheet.getRow(1).getCell(1).getStringCellValue();
        req.setName(name);
        req.setJob(job);

        Response response = given().contentType(ContentType.JSON).when().body(req)
                .post("https://reqres.in/api/users");

        //Print Response
        String responseBody = response.getBody().asString();
        System.out.println("Response Body is:" + responseBody);

        //Validate Status code
        int statusCode=response.getStatusCode();
        System.out.println("Status Code is: " + statusCode);
        Assert.assertEquals(statusCode, 201);

        //Validate the Status line
        String statusLine=response.getStatusLine();
        System.out.println("Status line is: " + statusLine);
        Assert.assertEquals(statusLine, "HTTP/1.1 201 Created");
    }
}
