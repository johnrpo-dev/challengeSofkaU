package com.sofkaU.app.model;

import lombok.Data;

@Data
public class Category3 {
    private String question;

    public Category3(String question) {
        this.question = question;
    }

    public static void categoria3(){
        Category1 c3 = new Category1("\n Escritor de Bitácora del naufragio\n" +
                "a. Stephen King | b. Mario Mendoza | c. George R.R Martin | d. Elon Musk\n");
        System.out.println(c3 + "\n");
    }

}
