package domain;

import java.util.Date;

public class Comment {
    private final User user;
    private final String message;
    private final Date date;
    private final String avatarUrl;

    public Comment(User user, String message) {
        this.user = user;
        this.message = message;
        this.avatarUrl = user.getAvatarUrl();
        this.date = new Date();
    }
}
