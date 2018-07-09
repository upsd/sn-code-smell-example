import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

public class SocialNetwork {

    private final ConsoleWriter console;
    private List<String> posts = new ArrayList<>();

    public SocialNetwork(ConsoleWriter console) {
        this.console = console;
    }

    public void execute(String command, String username, String[] args) {

        if (command.equals("post")) {
            posts.add(args[0]);
        }

        if (command.equals("read")) {
            posts.forEach(p -> console.printLine(p + " (5 minutes ago)"));
        }

    }

    public void read(String username) {
    }
}
