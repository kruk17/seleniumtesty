package manager;

import konfiguracja.PropDefiner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

import static org.testng.Assert.assertTrue;

public class HttpRespond {

        public void isHttpResponseCorrect() throws MalformedURLException {
            HttpURLConnection httpURLConnection;
            URL url = new URL(JsExecutor.returnPageUrl());

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

    public String getHttpRespondCodeForGet() throws MalformedURLException {
        HttpURLConnection httpURLConnection;
        URL url = new URL(JsExecutor.returnPageUrl());
        String respondCode;

        try {
            httpURLConnection = (HttpURLConnection)(url).openConnection();
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            respondCode = String.valueOf(httpURLConnection.getResponseCode());


        }
        catch (IOException e){
            throw new RuntimeException("time has run out");
        }
        return respondCode;

    }


}
