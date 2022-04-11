package com.sofkaU.app.model;

import lombok.Data;

@Data
public class Category2 {
    private String question;

    public Category2(String question) {
        this.question = question;
    }

    public static void categoria2(){
        Category2 c2 = new Category2("\n Es un framework de Java\n" +
                "a. Laravel | b. express | c. springBoot | d. fast api");
        System.out.println(c2 + "\n");
    }

}
