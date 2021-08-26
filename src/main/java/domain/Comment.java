package domain;

import java.util.Date;

public class Comment {
    private final User user;
    private final String message;
    private final Date date;
    private final String avatar_url;

    public Comment(User user, String message) {
        this.user = user;
        this.message = message;
        this.avatar_url = user.getAvatar_url();
        this.date = new Date();
    }
}
