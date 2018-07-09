import java.util.ArrayList;
import java.util.List;

public class PostStorer {

    private final List<String> posts;

    public PostStorer() {
        this.posts = new ArrayList<>();
    }

    public void store(String post) {
        this.posts.add(post);
    }

    public List<String> getAll() {
        return this.posts;
    }
}
