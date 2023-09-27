package com.sda.literature;

public class Author {
    private String firstname;
    private String surtname;
    private String nationality;

    private String getNationality() {
        return nationality;
    }

    public String getAuthorInfo() {
        return "Moja informacja o autorze:\n" + firstname;
    }
}
