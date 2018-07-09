import java.util.ArrayList;
import java.util.List;

public class PostHandler {

    private final List<String> posts;

    public PostHandler() {
        this.posts = new ArrayList<>();
    }

    public void addPost(String post) {
        this.posts.add(post);
    }

    public List<String> getAllPosts() {
        return this.posts;
    }
}
