package com.example.magicalarena;

import java.util.Random;

public class Player {
    private int health;
    private int strength;
    private int attack;

    public Player(int health, int strength, int attack) {
        this.health = health;
        this.strength = strength;
        this.attack = attack;
    }

    public boolean isAlive() {
        return health > 0;
    }

    public int getHealth() {
        return health;
    }

    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) {
            health = 0;
        }
    }

    public int attack() {
        Random rand = new Random();
        int attackRoll = rand.nextInt(6) + 1;
        return attack * attackRoll;
    }

    public int defend() {
        Random rand = new Random();
        int defendRoll = rand.nextInt(6) + 1;
        return strength * defendRoll;
    }
}
