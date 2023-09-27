package pl.sda.literature;

import com.sda.literature.Author;

public class Poem {
     private Author creator;
    private int stropheNumber;
    private String title;

    public Author getCreator() {
        return creator;
    }

    public int getStropheNumber() {
        return stropheNumber;
    }

    public void setCreator(Author creator) {
        this.creator = creator;
    }

    public void setStropheNumber(int stropheNumber) {
        this.stropheNumber = stropheNumber;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    String getTitle() {
        return title;
    }
}
