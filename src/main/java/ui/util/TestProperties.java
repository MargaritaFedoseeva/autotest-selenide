package ui.util;

import java.util.Properties;

public class TestProperties {
    private final Properties properties = new Properties();

    private static TestProperties INSTANCE = null;

    private TestProperties() {
//        try {
//
//            if (System.getProperty("environment") == null) {
//                properties.load(new FileInputStream(new File("properties/" +  "application.properties")));
//            } else {
//                properties.load(new FileInputStream(new File("./" + System.getProperty("environment") + ".properties")));
//            }
//
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
    }

    public static TestProperties getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new TestProperties();
        }
        return INSTANCE;
    }

    public Properties getProperties() {
        return properties;
    }
}
