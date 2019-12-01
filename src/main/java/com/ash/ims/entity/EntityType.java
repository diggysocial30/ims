package com.ash.ims.entity;

import java.util.Map;
import java.util.TreeMap;

import com.fasterxml.jackson.annotation.JsonValue;

public enum EntityType {

    PRODUCT,
    SKU,
    CATEGORY;

    private static Map<String, EntityType> typesMap = new TreeMap<>(String.CASE_INSENSITIVE_ORDER);

    static {
        typesMap.put("product", PRODUCT);
        typesMap.put("sku", SKU);
        typesMap.put("category", CATEGORY);
    }

    @JsonValue
    public String toValue() {
        for (Map.Entry<String, EntityType> entry : typesMap.entrySet()) {
            if (entry.getValue() == this)
                return entry.getKey().toUpperCase();
        }
        return null; // or fail
    }

    public static EntityType fromValue(String value) {
    	EntityType type = typesMap.get(value);
        if(type == null) {
            throw new IllegalArgumentException(
                    "Unknown entity type " + value );
        }
        return type;
    }


}
