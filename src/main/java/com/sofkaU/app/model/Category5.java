package com.sofkaU.app.model;

import lombok.Data;

@Data
public class Category5 {
    private String question;

    public Category5(String question) {
        this.question = question;
    }

    public static void categoria5(){
        Category5 c5 = new Category5("\n ¿en que año murio Freddie Mercury?\n" +
                "a. 1991 | b. 1987 | c. 1994 | d. 1989");
        System.out.println(c5 + " \n");
    }

}
