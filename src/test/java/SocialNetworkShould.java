import org.junit.Before;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SocialNetworkShould {

    private ConsoleWriter console;
    private SocialNetwork socialNetwork;

    @Before
    public void setup() {
        console = mock(ConsoleWriter.class);
        socialNetwork = new SocialNetwork(console);
    }
    
    @Test
    public void post_single_message_and_read_for_a_user() {
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.read("Alice");

        verify(console).printLine("Hello world (5 minutes ago)");
    }

    @Test
    public void post_and_read_multiple_messages_for_a_user() {
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.execute("post", "Alice", new String[]{"Hello again"});
        socialNetwork.read("Alice");

        verify(console).printLine("Hello world (5 minutes ago)");
        verify(console).printLine("Hello again (5 minutes ago)");
    }
}
