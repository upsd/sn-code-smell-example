import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private final ConsoleWriter console;
    private final PostHandler postHandler;
    private List<String> posts = new ArrayList<>();


    public SocialNetwork(ConsoleWriter console) {
        this.console = console;
        this.postHandler = new PostHandler();
    }

    public void execute(String command, String username, String[] args) {

        if (command.equals("post")) {
            if (username == username.trim()) {
                postHandler.addPost(args[0]);
            }
        }

        if (command.equals("read")) {
            if (username == username.trim()) {
                postHandler.getAllPosts().forEach(p -> console.printLine(p + " (5 minutes ago)"));
            }
        }

        if (command.equals("wall")) {
            if (username == username.trim()) {
                postHandler.getAllPosts().forEach(p -> console.printLine(username + " - " + p +    " (5 minutes ago)"));
            }
        }
    }

    public void read(String username) {
    }

    public void deserializePostGenerationAndSaveToDatabase() {

    }
}
