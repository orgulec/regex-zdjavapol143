package com.sda;

import com.sda.literature.Author;
import com.sda.literature.Poem;

public class Main {
    public static void main(String[] args) {

        Author author = new Author();
        //author.firstName = "Adam"; //-> nie da się bo jest private!
        //author.getNationality();  //->nie da się bo jest prywatne!

        author.getAuthorInfo(); //-> można bo jest publiczne

        //a tu są dostępy domyślne...
        Poem poem = new Poem();
        //poem.stropheNumber = 1234;    //-> nie działa bo ma dostęp w obrębie pakietu (domyślny)
        //poem.title = "Do M*";  //-> nie działa bo ma dostęp w obrębie pakietu (domyślny)
        //poem.getTitle();


    }
}
