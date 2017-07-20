package com.company;

/**
 * Created by Anton Ilchenko on 19.07.2017.
 */
public abstract class Player {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
