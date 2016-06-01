package com.jr.weibo.bean;

import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class StatusesData {

    @SerializedName("statuses")
    @Expose
    private List<Status> statuses = new ArrayList<Status>();
    @SerializedName("ad")
    @Expose
    private List<Ad> ad = new ArrayList<Ad>();
    @SerializedName("previous_cursor")
    @Expose
    private int previousCursor;
    @SerializedName("next_cursor")
    @Expose
    private int nextCursor;
    @SerializedName("total_number")
    @Expose
    private int totalNumber;

    /**
     *
     * @return
     * The statuses
     */
    public List<Status> getStatuses() {
        return statuses;
    }

    /**
     *
     * @param statuses
     * The statuses
     */
    public void setStatuses(List<Status> statuses) {
        this.statuses = statuses;
    }

    /**
     *
     * @return
     * The ad
     */
    public List<Ad> getAd() {
        return ad;
    }

    /**
     *
     * @param ad
     * The ad
     */
    public void setAd(List<Ad> ad) {
        this.ad = ad;
    }

    /**
     *
     * @return
     * The previousCursor
     */
    public int getPreviousCursor() {
        return previousCursor;
    }

    /**
     *
     * @param previousCursor
     * The previous_cursor
     */
    public void setPreviousCursor(int previousCursor) {
        this.previousCursor = previousCursor;
    }

    /**
     *
     * @return
     * The nextCursor
     */
    public int getNextCursor() {
        return nextCursor;
    }

    /**
     *
     * @param nextCursor
     * The next_cursor
     */
    public void setNextCursor(int nextCursor) {
        this.nextCursor = nextCursor;
    }

    /**
     *
     * @return
     * The totalNumber
     */
    public int getTotalNumber() {
        return totalNumber;
    }

    /**
     *
     * @param totalNumber
     * The total_number
     */
    public void setTotalNumber(int totalNumber) {
        this.totalNumber = totalNumber;
    }

}