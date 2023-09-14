package org.example;

import java.util.HashMap;
import java.util.Map;

public class ConfigManager {
    private static ConfigManager instance = new ConfigManager();
    private Map<String, Usuario> settings = new HashMap<>();

    private ConfigManager() {
    }

    public static ConfigManager getInstance() {
        return instance;
    }

    public void set(String key, Usuario usuario) {
        settings.put(key, usuario);
    }

    public Object get (String key) {
        return settings.get(key);
    }
}
