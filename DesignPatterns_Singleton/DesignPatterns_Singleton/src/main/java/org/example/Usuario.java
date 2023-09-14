package org.example;

import java.util.HashMap;
import java.util.Map;

public class Usuario {
    private static Usuario instance = new Usuario();
    private Map<String, Object> settings = new HashMap<>();

    private Usuario() {
    }

    public static Usuario getInstance() {
        return instance;
    }

    public void set(String key, Object value) {
        settings.put(key, value);
    }

    public Object get (String key) {
        return settings.get(key);
    }
}
