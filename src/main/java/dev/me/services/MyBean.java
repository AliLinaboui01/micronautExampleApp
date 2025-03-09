package dev.me.services;

import dev.me.interfaces.Engine;
import jakarta.inject.Singleton;

@Singleton
public class MyBean  {

    private final Engine engine;

    public MyBean(Engine engine) {
        this.engine = engine;
    }

    public String start() {
        return engine.start();
    }
}
