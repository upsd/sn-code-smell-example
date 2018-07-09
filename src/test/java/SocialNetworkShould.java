import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SocialNetworkShould {
    
    @Test
    public void post_and_read_message_for_a_user() {
        ConsoleWriter console = mock(ConsoleWriter.class);
        SocialNetwork socialNetwork = new SocialNetwork(console);

        socialNetwork.post("Alice", "Hello world");
        socialNetwork.read("Alice");

        verify(console).printLine("Hello World (5 minutes ago)");
    }
}
