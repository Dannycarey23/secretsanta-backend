package models;

import java.util.ArrayList;

public class Pool {

    private String name;
    private int capacity;
    private int game_length;
    private ArrayList<User> players;

    public Pool(String name, int capacity, int game_length, ArrayList<User> players) {
        this.name = name;
        this.capacity = capacity;
        this.game_length = game_length;
        this.players = players;
    }

    public Pool(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getGame_length() {
        return game_length;
    }

    public void setGame_length(int game_length) {
        this.game_length = game_length;
    }

    public ArrayList<User> getPlayers() {
        return players;
    }

    public void setPlayers(ArrayList<User> players) {
        this.players = players;
    }
}
