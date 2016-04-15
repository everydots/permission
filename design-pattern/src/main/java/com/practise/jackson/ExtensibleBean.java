package com.practise.jackson;

import org.codehaus.jackson.annotate.JsonAnyGetter;
import org.codehaus.jackson.annotate.JsonAnySetter;
import org.codehaus.jackson.annotate.JsonSetter;

import java.util.HashMap;
import java.util.Map;

public class ExtensibleBean {


    public String name;
    private Map<String, String> properties = new HashMap<String, String>();

    @JsonSetter("name")
    public void setFirstNameInValue(String name) {
        this.name = name;
    }

    public ExtensibleBean() {
    }

    public ExtensibleBean(String name) {
        this.name = name;
    }

    public ExtensibleBean(String name, Map<String, String> properties) {
        this.name = name;
        this.properties = properties;
    }

    @JsonAnyGetter
    public Map<String, String> getProperties() {
        return properties;
    }


    @JsonAnySetter
    public void add(String key, String value) {
        properties.put(key, value);
    }

    public String getName() {
        return name;
    }

    public void setProperties(Map<String, String> properties) {
        this.properties = properties;
    }
}
