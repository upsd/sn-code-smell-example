import java.util.ArrayList;
import java.util.List;

public class SocialNetwork {

    private final ConsoleWriter console;
    private final PostHandler postHandler;
    // Super important variable
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
                TimeDifferenceCalculator timeDifferenceCalculator = new TimeDifferenceCalculator();
                postHandler.getAllPosts().forEach(p -> console.printLine(p + " " + timeDifferenceCalculator.difference().convert().asText()));
            }
        }

        if (command.equals("wall")) {
            if (username == username.trim()) {
                TimeDifferenceCalculator timeDifferenceCalculator = new TimeDifferenceCalculator();
                postHandler.getAllPosts().forEach(p -> console.printLine(username + " - " + p + " " + timeDifferenceCalculator.difference().convert().asText()));
            }
        }
    }

    public void read(String username) {
    }

    public void deserializePostGenerationAndSaveToDatabase() {
        Database database = new Database("blah", "pwd", "name", "unicode", 26);
        database.save("something");
    }

    public boolean isUserTheSame(String userOne, String userTwo) {
        return userOne.equals(userTwo);
    }
}
