package com.sofkaU.app.model;

import lombok.Data;

@Data
public class Category4 {
    private String question;

    public Category4(String question) {
        this.question = question;
    }

    public static void categoria4(){
        Category4 c4 = new Category4("\n ¿Cuál es el departamento más grande de Colombia?\n" +
                "a. Amazonas | b. Guaviare | c. Valle del Cauca | d. Cundinamarca");
        System.out.println(c4 + "\n");
    }

}
