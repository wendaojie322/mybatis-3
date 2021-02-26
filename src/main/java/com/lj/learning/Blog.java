package com.lj.learning;

/**
 * @author Jie.LJ.Liu
 * @date 2021/2/23 16:47
 */
public class Blog {
    private int id;
    private String username;
    private String description;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Blog{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
