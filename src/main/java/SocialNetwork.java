import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SocialNetwork {

    private final ConsoleWriter console;
    private List<String> posts = new ArrayList<>();

    public SocialNetwork(ConsoleWriter console) {
        this.console = console;
    }

    public void post(String username, String message) {
        posts.add(message);
    }

    public void read(String username) {
        posts.forEach(p -> console.printLine(p + " (5 minutes ago)"));
//        console.printLine("Hello World (5 minutes ago)");
    }
}
