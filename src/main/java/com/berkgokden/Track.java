package com.berkgokden;

import java.io.Serializable;
import java.util.Map;

/**
 * Created by berkgokden on 12/29/14.
 */
public class Track {

    String title;
    String singer;
    private Map<String, Serializable> list;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSinger() {
        return singer;
    }

    public void setSinger(String singer) {
        this.singer = singer;
    }

    @Override
    public String toString() {
        return "Track [title=" + title + ", singer=" + singer + "]";
    }

    public Map<String, Serializable> getList() {
        return list;
    }

    public void setList(Map<String, Serializable> list) {
        this.list = list;
    }
}
