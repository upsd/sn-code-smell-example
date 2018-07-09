public class SocialNetworkApp {
    public static void main(String[] args) {
        SocialNetwork socialNetwork = new SocialNetwork(new ConsoleWriter());
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.execute("read", "Alice", new String[]{});
    }
}
