package com.ash.ims.entity;

import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.annotation.JsonValue;

public enum UserRole {

    ADMIN,
    VIEWER,
    OPERATOR;

    private static Map<String, UserRole> typesMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    static {
        typesMap.put("admin", ADMIN);
        typesMap.put("viewer", VIEWER);
        typesMap.put("operator", OPERATOR);
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, UserRole> entry : typesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey().toUpperCase();
        }
        return null; // or fail
    }

    public static UserRole fromValue(String value) {
    	UserRole type = typesMap.get(value);
        if(type == null) {
            throw new IllegalArgumentException(
                    "Unknown entity type " + value );
        }
        return type;
    }


}
