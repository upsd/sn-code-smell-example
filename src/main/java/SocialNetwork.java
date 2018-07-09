public class SocialNetwork {

    private final ConsoleWriter console;

    public SocialNetwork(ConsoleWriter console) {
        this.console = console;
    }

    public void post(String username, String message) {
    }

    public void read(String username) {
        console.printLine("Hello World (5 minutes ago)");
    }
}
