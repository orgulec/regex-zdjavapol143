package pl.sda.literature;

public class Poem {
     private Author creator;
    private int stropheNumbers;
    private String title;

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumbers() {
        return stropheNumbers;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumbers(int stropheNumber) {
        this.stropheNumbers = stropheNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString(){
        return ":: "+title+" ::"+stropheNumbers;
    }
}
