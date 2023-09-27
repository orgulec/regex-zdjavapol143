package com.sda.literature;

public class TestInPacage {
    public static void main(String[] args) {

        Author author = new Author();
        //author.firstName = "Adam"; //-> nie da się bo jest private!
        //author.getNationality();  //->nie da się bo jest prywatne!

        author.getAuthorInfo(); //-> można bo jest publiczne

        //a tu są dostępy domyślne!
        Poem poem = new Poem();
        poem.stropheNumber = 1234;
        poem.title = "Do M*";
        poem.getTitle();


    }
}
