
package com.jr.weibo.bean;

import javax.annotation.Generated;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class User {

    @SerializedName("id")
    @Expose
    private Integer id;
    @SerializedName("screen_name")
    @Expose
    private String screenName;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("province")
    @Expose
    private String province;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("location")
    @Expose
    private String location;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("url")
    @Expose
    private String url;
    @SerializedName("profile_image_url")
    @Expose
    private String profileImageUrl;
    @SerializedName("domain")
    @Expose
    private String domain;
    @SerializedName("gender")
    @Expose
    private String gender;
    @SerializedName("followers_count")
    @Expose
    private Integer followersCount;
    @SerializedName("friends_count")
    @Expose
    private Integer friendsCount;
    @SerializedName("statuses_count")
    @Expose
    private Integer statusesCount;
    @SerializedName("favourites_count")
    @Expose
    private Integer favouritesCount;
    @SerializedName("created_at")
    @Expose
    private String createdAt;
    @SerializedName("following")
    @Expose
    private Boolean following;
    @SerializedName("allow_all_act_msg")
    @Expose
    private Boolean allowAllActMsg;
    @SerializedName("remark")
    @Expose
    private String remark;
    @SerializedName("geo_enabled")
    @Expose
    private Boolean geoEnabled;
    @SerializedName("verified")
    @Expose
    private Boolean verified;
    @SerializedName("allow_all_comment")
    @Expose
    private Boolean allowAllComment;
    @SerializedName("avatar_large")
    @Expose
    private String avatarLarge;
    @SerializedName("verified_reason")
    @Expose
    private String verifiedReason;
    @SerializedName("follow_me")
    @Expose
    private Boolean followMe;
    @SerializedName("online_status")
    @Expose
    private Integer onlineStatus;
    @SerializedName("bi_followers_count")
    @Expose
    private Integer biFollowersCount;

    /**
     * @return The id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id The id
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return The screenName
     */
    public String getScreenName() {
        return screenName;
    }

    /**
     * @param screenName The screen_name
     */
    public void setScreenName(String screenName) {
        this.screenName = screenName;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The province
     */
    public String getProvince() {
        return province;
    }

    /**
     * @param province The province
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The location
     */
    public String getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(String location) {
        this.location = location;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The url
     */
    public String getUrl() {
        return url;
    }

    /**
     * @param url The url
     */
    public void setUrl(String url) {
        this.url = url;
    }

    /**
     * @return The profileImageUrl
     */
    public String getProfileImageUrl() {
        return profileImageUrl;
    }

    /**
     * @param profileImageUrl The profile_image_url
     */
    public void setProfileImageUrl(String profileImageUrl) {
        this.profileImageUrl = profileImageUrl;
    }

    /**
     * @return The domain
     */
    public String getDomain() {
        return domain;
    }

    /**
     * @param domain The domain
     */
    public void setDomain(String domain) {
        this.domain = domain;
    }

    /**
     * @return The gender
     */
    public String getGender() {
        return gender;
    }

    /**
     * @param gender The gender
     */
    public void setGender(String gender) {
        this.gender = gender;
    }

    /**
     * @return The followersCount
     */
    public Integer getFollowersCount() {
        return followersCount;
    }

    /**
     * @param followersCount The followers_count
     */
    public void setFollowersCount(Integer followersCount) {
        this.followersCount = followersCount;
    }

    /**
     * @return The friendsCount
     */
    public Integer getFriendsCount() {
        return friendsCount;
    }

    /**
     * @param friendsCount The friends_count
     */
    public void setFriendsCount(Integer friendsCount) {
        this.friendsCount = friendsCount;
    }

    /**
     * @return The statusesCount
     */
    public Integer getStatusesCount() {
        return statusesCount;
    }

    /**
     * @param statusesCount The statuses_count
     */
    public void setStatusesCount(Integer statusesCount) {
        this.statusesCount = statusesCount;
    }

    /**
     * @return The favouritesCount
     */
    public Integer getFavouritesCount() {
        return favouritesCount;
    }

    /**
     * @param favouritesCount The favourites_count
     */
    public void setFavouritesCount(Integer favouritesCount) {
        this.favouritesCount = favouritesCount;
    }

    /**
     * @return The createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    /**
     * @param createdAt The created_at
     */
    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    /**
     * @return The following
     */
    public Boolean getFollowing() {
        return following;
    }

    /**
     * @param following The following
     */
    public void setFollowing(Boolean following) {
        this.following = following;
    }

    /**
     * @return The allowAllActMsg
     */
    public Boolean getAllowAllActMsg() {
        return allowAllActMsg;
    }

    /**
     * @param allowAllActMsg The allow_all_act_msg
     */
    public void setAllowAllActMsg(Boolean allowAllActMsg) {
        this.allowAllActMsg = allowAllActMsg;
    }

    /**
     * @return The remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark The remark
     */
    public void setRemark(String remark) {
        this.remark = remark;
    }

    /**
     * @return The geoEnabled
     */
    public Boolean getGeoEnabled() {
        return geoEnabled;
    }

    /**
     * @param geoEnabled The geo_enabled
     */
    public void setGeoEnabled(Boolean geoEnabled) {
        this.geoEnabled = geoEnabled;
    }

    /**
     * @return The verified
     */
    public Boolean getVerified() {
        return verified;
    }

    /**
     * @param verified The verified
     */
    public void setVerified(Boolean verified) {
        this.verified = verified;
    }

    /**
     * @return The allowAllComment
     */
    public Boolean getAllowAllComment() {
        return allowAllComment;
    }

    /**
     * @param allowAllComment The allow_all_comment
     */
    public void setAllowAllComment(Boolean allowAllComment) {
        this.allowAllComment = allowAllComment;
    }

    /**
     * @return The avatarLarge
     */
    public String getAvatarLarge() {
        return avatarLarge;
    }

    /**
     * @param avatarLarge The avatar_large
     */
    public void setAvatarLarge(String avatarLarge) {
        this.avatarLarge = avatarLarge;
    }

    /**
     * @return The verifiedReason
     */
    public String getVerifiedReason() {
        return verifiedReason;
    }

    /**
     * @param verifiedReason The verified_reason
     */
    public void setVerifiedReason(String verifiedReason) {
        this.verifiedReason = verifiedReason;
    }

    /**
     * @return The followMe
     */
    public Boolean getFollowMe() {
        return followMe;
    }

    /**
     * @param followMe The follow_me
     */
    public void setFollowMe(Boolean followMe) {
        this.followMe = followMe;
    }

    /**
     * @return The onlineStatus
     */
    public Integer getOnlineStatus() {
        return onlineStatus;
    }

    /**
     * @param onlineStatus The online_status
     */
    public void setOnlineStatus(Integer onlineStatus) {
        this.onlineStatus = onlineStatus;
    }

    /**
     * @return The biFollowersCount
     */
    public Integer getBiFollowersCount() {
        return biFollowersCount;
    }

    /**
     * @param biFollowersCount The bi_followers_count
     */
    public void setBiFollowersCount(Integer biFollowersCount) {
        this.biFollowersCount = biFollowersCount;
    }

}