package pl.sda;

import pl.sda.literature.Author;
import pl.sda.literature.Poem;

public class Main {
    public static void main(String[] args) {
        Author mickiewicz = new Author("Adam", "Mickiewicz");
        mickiewicz.setNationality("Polska");

        Author slowacki = new Author("Juliusz", "Słowacki");
        Author ckn = new Author("Cyprian", "Norwid");
        Author kpt = new Author("Kazimierz", "Tetmajer");

        System.out.println(mickiewicz);

        Poem hymn = new Poem();
        hymn.setCreator(slowacki);
        hymn.setTitle("Hymn");
        hymn.setStropheNumbers(17);

        Poem doM = new Poem();
        doM.setTitle("Do M*");
        doM.setStropheNumbers(52);
        doM.setCreator(mickiewicz);

        Poem romantycznosc = new Poem();
        romantycznosc.setTitle("Romantyczność");
        romantycznosc.setStropheNumbers(128);
        romantycznosc.setCreator(mickiewicz);

        Poem[] poems = new Poem[3];
        poems[0] = hymn;
        poems[1] = doM;
        poems[2] = romantycznosc;

        //zakładamy że najdłuższy poem to ten zerowy
        Poem longestPoem = poems[0];

        for (int i = 1; i < poems.length; i++) {
            Poem currentPoem = poems[i];
            if (currentPoem.getStropheNumbers() > longestPoem.getStropheNumbers()) {
                longestPoem = currentPoem;
            }
        }

        Author longestPoemCreator = longestPoem.getCreator();

        System.out.println("Najdłuższy wiersz napisał: " + longestPoemCreator.getSurname() );

    }
}
