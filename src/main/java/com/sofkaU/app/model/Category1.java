package com.sofkaU.app.model;

import lombok.Data;

@Data
public class Category1 {
    private String question;

    public Category1(String question) {
        this.question = question;
    }

    public static void categoria1(){
        Category1 c1 = new Category1("\n 25 * 2 = ?\n" +
                "a. 23 | b. 34 | c. 50 | d. 48");
        System.out.println(c1 + "\n");
    }
}
