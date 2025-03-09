package dev.me.services;

import dev.me.interfaces.Engine;
import jakarta.inject.Singleton;

@Singleton
public class V8Engine implements Engine {
    private int cylinders = 8;
    @Override
    public int getCylinders() {
        return cylinders;
    }

    @Override
    public String start() {
        return "Starting V8 Engine...";
    }

    public void setCylinders(int cylinders) {
        this.cylinders = cylinders;
    }
}
