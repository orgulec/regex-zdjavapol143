package regex;

public class RegexReplaceSplit  {
    public static void main(String[] args) {
        //zastępowanie textów/znaków
        String text = "The quick brown fox jumps over the lazy dog.";
        String replaced = text.replaceAll("\\w+","***");

        System.out.println("text: "+text);
        System.out.println("text: "+replaced);

        //splitowanie
        String text2 = "Rozdzielaj po dowolnym\nbiałym\tznaku.";
        System.out.println("\n"+text2);
        String[] split = text2.split("\\s");
        for(String s:split){
            System.out.println("-> "+s);
        }

    }
}
