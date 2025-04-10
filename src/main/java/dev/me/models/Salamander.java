package dev.me.models;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.UUID;


public record Salamander(
        String name,
        int age,
        Color color,
        List<List<String>> environments,
        BigDecimal bd,
        Map<String, Map<String, String>> doubleMap
) {
        enum Color {
                RED,
                GREEN,
                BLUE
        }



}



