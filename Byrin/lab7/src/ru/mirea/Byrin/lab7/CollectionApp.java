package ru.mirea.Byrin.lab7;

import java.util.ArrayList;

public class CollectionApp {
    private String name;

    public CollectionApp(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person {" +
                "name='" + name + '\'' +
                '}';
    }
}
