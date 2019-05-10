package com.prokarma.bustest.model;

import com.google.gson.annotations.SerializedName;

import java.util.List;

public class PlayerResponse {

    @SerializedName("data")
    private List<DataItem> data;

    @SerializedName("meta")
    private Meta meta;

    public List<DataItem> getData() {
        return data;
    }

    public void setData(List<DataItem> data) {
        this.data = data;
    }

    public Meta getMeta() {
        return meta;
    }

    public void setMeta(Meta meta) {
        this.meta = meta;
    }

    @Override
    public String toString() {
        return
                "PlayerResponse{" +
                        "data = '" + data + '\'' +
                        ",meta = '" + meta + '\'' +
                        "}";
    }
}