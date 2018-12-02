package testy;

import konfiguracja.PropConfiguration;
import konfiguracja.PropDefiner;
import org.testng.annotations.Test;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class HttpRespondTest extends TestBase {


    @Test
    public void httpResponseTest () throws MalformedURLException {

        HttpURLConnection httpURLConnection;
        URL url = new URL(PropDefiner.getUrl());

        try {
            httpURLConnection = (HttpURLConnection)(url).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            String respondCode = String.valueOf(httpURLConnection.getResponseCode());
            System.out.println(respondCode);
            assertTrue(respondCode.contains("200"));

        }
        catch (IOException e){
            throw new RuntimeException("time has run out");
        }











    }
}
