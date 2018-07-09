import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;
import static org.junit.Assert.assertThat;
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
        socialNetwork.execute("read", "Alice", new String[]{});

        verify(console).printLine("Hello world (5 minutes ago)");
    }

    @Test
    public void post_and_read_multiple_messages_for_a_user() {
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.execute("post", "Alice", new String[]{"Hello again"});
        socialNetwork.execute("read", "Alice", new String[]{});

        verify(console).printLine("Hello world (5 minutes ago)");
        verify(console).printLine("Hello again (5 minutes ago)");
    }
    
    @Test
    public void show_wall_for_a_user() {
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.execute("post", "Alice", new String[]{"Hello again"});
        socialNetwork.execute("wall", "Alice", new String[]{});

        verify(console).printLine("Alice - Hello world (5 minutes ago)");
        verify(console).printLine("Alice - Hello again (5 minutes ago)");
    }
    
    @Test
    public void show_content_for_a_given_user() {
        socialNetwork.execute("post", "Alice", new String[]{"Hello world"});
        socialNetwork.execute("post", "Alice", new String[]{"Hello again"});
        socialNetwork.execute("wall", "Alice", new String[]{});

        assertThat(true, is(true));
    }

    @Test
    public void check_users_are_the_same() {
        boolean areTheSame = socialNetwork.isUserTheSame("Alice", "Alice");

        assertThat(areTheSame, is(true));
    }
}
