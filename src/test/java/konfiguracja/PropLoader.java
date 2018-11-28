package konfiguracja;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropLoader {


    public Properties getPropertiesFromFile(String nameOfFile) {
        InputStream inputStream = null;

        Properties properties = new Properties();


        try {
            inputStream = getClass().getClassLoader().getResourceAsStream(nameOfFile);

            if (inputStream != null) {
                properties.load(inputStream);
            } else
                throw new FileNotFoundException("load not empty file");
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage());
        } finally {

            try {
                inputStream.close();
            } catch (IOException io) {
                io.getMessage();
            }

        }
        return properties;
    }


}
