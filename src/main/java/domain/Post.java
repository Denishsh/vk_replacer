package domain;

import java.util.ArrayList;
import java.util.Date;

public class Post {
    private String avatar_url;
    private String header;
    private String description;
    private Date date;
    private ArrayList<Comment> comments;
    private ArrayList<User> repostedToUsers;
    private ArrayList<User> likedByUsers;
    private int likesCount;
    private int repostsCount;
    private int viewsCount;
    private String type;
    private String[] attachments;
    private String geo;
    private boolean canEdit;
    private boolean canDelete;

    public String[] getAttachments() {
        return attachments;
    }

    public void setAttachments(String[] attachments) {
        this.attachments = attachments;
    }

    public String getGeo() {
        return geo;
    }

    public void setGeo(String geo) {
        this.geo = geo;
    }

    public boolean isCanEdit() {
        return canEdit;
    }

    public void setCanEdit(boolean canEdit) {
        this.canEdit = canEdit;
    }

    public boolean isCanDelete() {
        return canDelete;
    }

    public void setCanDelete(boolean canDelete) {
        this.canDelete = canDelete;
    }

    public void comment(User user, String message) {
        comments.add(new Comment(user, message));
    }

    public void viewPost(User user) {
        viewsCount++;
    }

    public void addToBookmarks(User user) {

    }

    public boolean like(User user) {
        if (!likedByUsers.contains(user)) {
            likesCount++;
            likedByUsers.add(user);
            return true;
        }
        return false;
    }

    public boolean isLiked(User user) {
        return likedByUsers.contains(user);
    }

    public boolean makeRepost(User user) {
        if (!repostedToUsers.contains(user)) {
            repostsCount++;
            repostedToUsers.add(user);
            return true;
        }
        return false;
    }

    public String getAvatar_url() {
        return avatar_url;
    }

    public void setAvatar_url(String avatar_url) {
        this.avatar_url = avatar_url;
    }

    public String getHeader() {
        return header;
    }

    public void setHeader(String header) {
        this.header = header;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public ArrayList<Comment> getComments() {
        return comments;
    }

    public void setComments(ArrayList<Comment> comments) {
        this.comments = comments;
    }

    public int getLikesCount() {
        return likesCount;
    }

    public void setLikesCount(int likesCount) {
        this.likesCount = likesCount;
    }

    public int getViewsCount() {
        return viewsCount;
    }

    public void setViewsCount(int viewsCount) {
        this.viewsCount = viewsCount;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ArrayList<User> getRepostedToUsers() {
        return repostedToUsers;
    }

    public void setRepostedToUsers(ArrayList<User> repostedToUsers) {
        this.repostedToUsers = repostedToUsers;
    }

    public ArrayList<User> getLikedByUsers() {
        return likedByUsers;
    }

    public void setLikedByUsers(ArrayList<User> likedByUsers) {
        this.likedByUsers = likedByUsers;
    }

    public int getRepostsCount() {
        return repostsCount;
    }

    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }
}
