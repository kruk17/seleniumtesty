package konfiguracja;

import java.util.Properties;

public class PropConfiguration {


    private PropConfiguration(){

    }
    private static Properties properties;


    public static void setProperties(Properties properties){
        PropConfiguration.properties = properties;
    }

    public static Properties getProperties(){
        return properties;
    }
}


