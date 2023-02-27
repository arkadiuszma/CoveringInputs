import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class FileHandler {

    private static Properties loadFile(String path) throws IOException {
        InputStream criteriaVariables = null;
        Properties properties = null;
        try {
            criteriaVariables = ClassLoader.getSystemClassLoader().getResourceAsStream(path);
            properties = new Properties();
            properties.load(criteriaVariables);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            assert criteriaVariables != null;
            criteriaVariables.close();
        }
        return properties;
    }

    protected static char getChar(String path) throws IOException {
        Properties variables = FileHandler.loadFile(path);
        char[] chars = variables.getProperty("coveringSign").toCharArray();
        return chars[0];
    }

    protected static String[] getSensitiveKeys(String path) throws IOException {
        Properties variables = FileHandler.loadFile(path);
        return variables.getProperty("sensitiveKeys").split(",");
    }
}