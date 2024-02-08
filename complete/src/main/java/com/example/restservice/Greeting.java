package com.example.restservice;

//public record Greeting(long id, String content) { }

public class Greeting {
    private final long id;
    private final String content;

    public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
    }

    // Getter 메서드 등을 추가할 수 있음
}