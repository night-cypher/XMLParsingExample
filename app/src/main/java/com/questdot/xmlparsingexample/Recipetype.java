package com.questdot.xmlparsingexample;

import com.google.gson.annotations.SerializedName;

/**
 * Created by HP on 27/12/2016.
 */
public class Recipetype {
    @SerializedName("@id")
    private String id;
    private String name;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}