package testy;

import io.qameta.allure.Description;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import io.qameta.allure.TmsLink;
import konfiguracja.PropConfiguration;
import konfiguracja.PropDefiner;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class HttpResponseTest extends TestBase {

    @TmsLink("ID-8")
    @Severity(SeverityLevel.BLOCKER)
    @Test
    @Description("httpRespond test with get method and 200 resond code")
    public void httpResponseTest () throws MalformedURLException {

        HttpURLConnection httpURLConnection;
        URL url = new URL(PropDefiner.getUrl());

        try {
            httpURLConnection = (HttpURLConnection)(url).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            String responseCode = String.valueOf(httpURLConnection.getResponseCode());
            System.out.println(responseCode);
            assertTrue(responseCode.contains("200"));

        }
        catch (IOException e){
            throw new RuntimeException("time has run out");
        }













    }
}
