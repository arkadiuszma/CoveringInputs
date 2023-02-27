import java.io.IOException;
import java.util.Map;

public class Main {
    private static final String name = UserInputHandler.getName();
    private static final String login = UserInputHandler.getLogin();
    private static final String password = UserInputHandler.getPassword();
    private static final String eMail = UserInputHandler.getEmail();
    private static final long cardNumber = UserInputHandler.getCardNumber();

    public static void main(String[] args) throws IOException {
        char coveringSign = FileHandler.getChar();
        User user = new User(name, login, password, eMail, cardNumber);
        Map<String, String> userMap = UserPropertiesMap.createUserDataMap(user);
        UserPropertiesMap.printUserData(userMap, coveringSign);
    }
}
