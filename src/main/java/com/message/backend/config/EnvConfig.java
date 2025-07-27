package com.message.backend.config;

import io.github.cdimascio.dotenv.Dotenv;

public class EnvConfig {
    private static final Dotenv dotenv = Dotenv.configure()
            .ignoreIfMissing() // para que no falle si no encuentra el archivo
            .load();

    public static String get(String key) {
        return dotenv.get(key);
    }
}
