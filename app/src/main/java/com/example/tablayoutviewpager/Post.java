package com.example.tablayoutviewpager;

public class Post {
    private String title;
    private String text;
    private  int imageUrl;

    public Post(String title, String text, int imageUrl) {
        this.title = title;
        this.text = text;
        this.imageUrl = imageUrl;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public int getImageUrl() {
        return imageUrl;
    }
}
