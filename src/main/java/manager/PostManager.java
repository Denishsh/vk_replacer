package manager;

import domain.Post;

import java.util.ArrayList;

public class PostManager {
    private ArrayList<Post> posts;

    public Post[] search(int ownerId, String domain, String query, boolean owners_only, byte count, int offset, boolean extended, String fields) {
        return null;
    }

    public void delete(int ownerId, int postId) {
    }

    public ArrayList<Post> getPosts() {
        return posts;
    }

    public void setPosts(ArrayList<Post> posts) {
        this.posts = posts;
    }
}
