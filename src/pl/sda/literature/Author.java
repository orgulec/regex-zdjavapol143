package pl.sda.literature;

public class Author {
    private String firstname;
    private String surname;
    private String nationality;

    public String getNationality() {
        return nationality;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getSurtname() {
        return surname;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getAuthorInfo() {
        return "Moja informacja o autorze:\n" + firstname;
    }

    public Author(String firstname, String surname){

    }
}
