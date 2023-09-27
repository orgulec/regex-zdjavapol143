package pl.sda.literature;

public class Author {
    private String firstname;
    private String surName;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurname() {
        return surName;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAuthorInfo() {
        return "Moja informacja o autorze:\n" + firstname;
    }

    public Author(String firstname, String surName){
        this.firstname = firstname;
        this.surName = surName;
    }

    @Override
    public String toString() {
        return "Author{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surName + '\'' +
                ", nationality='" + nationality + '\'' +
                '}';
    }
}
