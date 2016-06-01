package com.jr.weibo.bean;

import javax.annotation.Generated;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("org.jsonschema2pojo")
public class Ad {

    @SerializedName("id")
    @Expose
    private int id;
    @SerializedName("mark")
    @Expose
    private String mark;

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
     * The mark
     */
    public String getMark() {
        return mark;
    }

    /**
     *
     * @param mark
     * The mark
     */
    public void setMark(String mark) {
        this.mark = mark;
    }

}