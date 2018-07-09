import java.util.ArrayList;
import java.util.List;

public class PostHandler {

    private final List<String> posts;   // for storing posts
    private final PostStorer postStorer;

    public PostHandler() {
        this.posts = new ArrayList<>();
        this.postStorer = new PostStorer();
    }

    public void addPost(String post) {
        postStorer.store(post);
//        this.posts.add(post);
    }

    public List<String> getAllPosts() {
        return postStorer.getAll();
//        return this.posts;
    }
}
