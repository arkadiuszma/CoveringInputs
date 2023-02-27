import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class UserPropertiesMap {
    private final static String[] sensitiveKeys = {"Password", "Card number"};

    protected static Map<String, String> createUserDataMap(User user) {
        Map<String, String> userMap = new HashMap<>();
        userMap.put("Name", user.name());
        userMap.put("Login", user.login());
        userMap.put("Password", user.password());
        userMap.put("E-mail", user.eMail());
        userMap.put("Card number", String.valueOf(user.cardNumber()));
        return userMap;
    }

    protected static void printUserData(Map<String, String> userMap, char coveringSign) {
        Arrays.stream(sensitiveKeys).forEach(param -> userMap.computeIfPresent(param, (k, v) -> coveringInput(v, coveringSign)));
        System.out.println(userMap);
    }

    private static String coveringInput(String input, char coveringSign) {
        ArrayList<Character> characters = IntStream.range(0, input.length()).mapToObj(i -> coveringSign).collect(Collectors.toCollection(ArrayList::new));
        return characters.stream().map(String::valueOf).collect(Collectors.joining());
    }
}

