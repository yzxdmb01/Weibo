package com.jr.weibo.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Status {

    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("text")
    @Expose
    private String text;
    @SerializedName("source")
    @Expose
    private String source;
    @SerializedName("favorited")
    @Expose
    private boolean favorited;
    @SerializedName("truncated")
    @Expose
    private boolean truncated;
    @SerializedName("in_reply_to_status_id")
    @Expose
    private String inReplyToStatusId;
    @SerializedName("in_reply_to_user_id")
    @Expose
    private String inReplyToUserId;
    @SerializedName("in_reply_to_screen_name")
    @Expose
    private String inReplyToScreenName;
    @SerializedName("geo")
    @Expose
    private Object geo;
    @SerializedName("mid")
    @Expose
    private String mid;
    @SerializedName("reposts_count")
    @Expose
    private int repostsCount;
    @SerializedName("comments_count")
    @Expose
    private int commentsCount;
    @SerializedName("annotations")
    @Expose
    private List<Object> annotations = new ArrayList<Object>();
    @SerializedName("user")
    @Expose
    private User user;

    /**
     *
     * @return
     * The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     *
     * @param createdAt
     * The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     *
     * @return
     * The id
     */
    public int getId() {
        return id;
    }

    /**
     *
     * @param id
     * The id
     */
    public void setId(int id) {
        this.id = id;
    }

    /**
     *
     * @return
     * The text
     */
    public String getText() {
        return text;
    }

    /**
     *
     * @param text
     * The text
     */
    public void setText(String text) {
        this.text = text;
    }

    /**
     *
     * @return
     * The source
     */
    public String getSource() {
        return source;
    }

    /**
     *
     * @param source
     * The source
     */
    public void setSource(String source) {
        this.source = source;
    }

    /**
     *
     * @return
     * The favorited
     */
    public boolean isFavorited() {
        return favorited;
    }

    /**
     *
     * @param favorited
     * The favorited
     */
    public void setFavorited(boolean favorited) {
        this.favorited = favorited;
    }

    /**
     *
     * @return
     * The truncated
     */
    public boolean isTruncated() {
        return truncated;
    }

    /**
     *
     * @param truncated
     * The truncated
     */
    public void setTruncated(boolean truncated) {
        this.truncated = truncated;
    }

    /**
     *
     * @return
     * The inReplyToStatusId
     */
    public String getInReplyToStatusId() {
        return inReplyToStatusId;
    }

    /**
     *
     * @param inReplyToStatusId
     * The in_reply_to_status_id
     */
    public void setInReplyToStatusId(String inReplyToStatusId) {
        this.inReplyToStatusId = inReplyToStatusId;
    }

    /**
     *
     * @return
     * The inReplyToUserId
     */
    public String getInReplyToUserId() {
        return inReplyToUserId;
    }

    /**
     *
     * @param inReplyToUserId
     * The in_reply_to_user_id
     */
    public void setInReplyToUserId(String inReplyToUserId) {
        this.inReplyToUserId = inReplyToUserId;
    }

    /**
     *
     * @return
     * The inReplyToScreenName
     */
    public String getInReplyToScreenName() {
        return inReplyToScreenName;
    }

    /**
     *
     * @param inReplyToScreenName
     * The in_reply_to_screen_name
     */
    public void setInReplyToScreenName(String inReplyToScreenName) {
        this.inReplyToScreenName = inReplyToScreenName;
    }

    /**
     *
     * @return
     * The geo
     */
    public Object getGeo() {
        return geo;
    }

    /**
     *
     * @param geo
     * The geo
     */
    public void setGeo(Object geo) {
        this.geo = geo;
    }

    /**
     *
     * @return
     * The mid
     */
    public String getMid() {
        return mid;
    }

    /**
     *
     * @param mid
     * The mid
     */
    public void setMid(String mid) {
        this.mid = mid;
    }

    /**
     *
     * @return
     * The repostsCount
     */
    public int getRepostsCount() {
        return repostsCount;
    }

    /**
     *
     * @param repostsCount
     * The reposts_count
     */
    public void setRepostsCount(int repostsCount) {
        this.repostsCount = repostsCount;
    }

    /**
     *
     * @return
     * The commentsCount
     */
    public int getCommentsCount() {
        return commentsCount;
    }

    /**
     *
     * @param commentsCount
     * The comments_count
     */
    public void setCommentsCount(int commentsCount) {
        this.commentsCount = commentsCount;
    }

    /**
     *
     * @return
     * The annotations
     */
    public List<Object> getAnnotations() {
        return annotations;
    }

    /**
     *
     * @param annotations
     * The annotations
     */
    public void setAnnotations(List<Object> annotations) {
        this.annotations = annotations;
    }

    /**
     *
     * @return
     * The user
     */
    public User getUser() {
        return user;
    }

    /**
     *
     * @param user
     * The user
     */
    public void setUser(User user) {
        this.user = user;
    }

}