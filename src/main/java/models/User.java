package models;

import java.util.ArrayList;

public class User {
    private String name;
    private int age;
    private String email;
    private Long id;
    private ArrayList<String> likes;
    private ArrayList<String> dislikes;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.likes = new ArrayList<>();
        this.dislikes = new ArrayList<>();
    }

    public User(){}

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public ArrayList<String> getLikes() {
        return likes;
    }

    public void setLikes(ArrayList<String> likes) {
        this.likes = likes;
    }

    public ArrayList<String> getDislikes() {
        return dislikes;
    }

    public void setDislikes(ArrayList<String> dislikes) {
        this.dislikes = dislikes;
    }
}
