package com.practise.jackson;

import org.codehaus.jackson.annotate.JsonBackReference;

import java.util.ArrayList;
import java.util.List;

public class UserWithRef {

    public int id;
    public String name;

    public List<ItemWithRef> userItems;

    public UserWithRef() {

    }

    public UserWithRef(int id, String name) {
        this.id = id;
        this.name = name;

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<ItemWithRef> getUserItems() {
        return userItems;
    }

    public void setUserItems(List<ItemWithRef> userItems) {
        this.userItems = userItems;
    }

    public void addItem(ItemWithRef item) {
        if (userItems == null) {
            userItems = new ArrayList<ItemWithRef>();
        }
        userItems.add(item);
    }
}
