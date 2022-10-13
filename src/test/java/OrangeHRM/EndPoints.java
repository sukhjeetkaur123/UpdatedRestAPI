package OrangeHRM;

import com.google.common.net.HttpHeaders;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import org.apache.commons.logging.Log;
import org.apache.hc.client5.http.classic.methods.HttpGet;

import java.util.ArrayList;

public class EndPoints {

//    protected JsonObject retrieveJsonObject(String url) throws AutomationException {
//        return httpCommunicator.getJson(url);
//    }
//
//    private List<Sector> retrieveData(String urlFilter) throws AutomationException {
//        Log.debug(String.format("This is filter URL %s", urlFilter));
//        JsonObject jsonObject = retrieveJsonObject(urlFilter).getJsonObject("options");
//        Gson gson = new Gson();
//        return new ArrayList<>((gson.fromJson(jsonObject.get("sectors").toString(), new TypeToken<List<Sector>>(){}.getType())));
//        }
//
//    @Override
//    public JsonObject getJson(String urlFilter) throws AutomationException {
//        HttpGet httpget = new HttpGet(loginInfo.getUrl().replace(REPLACEMENT_STRING,"") + urlFilter);
//        httpget.setHeader(HttpHeaders.CONTENT_TYPE, APPLICATION_STRING);
//        httpget.setHeader(COOKIE_STRING, loginInfo.getCookie());
//        httpHandler.retrieveHttpResponse(httpget);
//        return httpHandler.getJson();
    }
