package com.everydots.cost.beans;

import java.util.UUID;

public class Record {

    private String id;

    public Record() {
        this.id = UUID.randomUUID().toString().replace("-", "");
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
}
