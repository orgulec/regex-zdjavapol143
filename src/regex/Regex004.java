package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
    sprawdzanie daty wg wzoru "YYYY-MM-DD"
 */
public class Regex004 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wprowadź tekst z datą:");
        String text = scan.nextLine();
        String p = ".?\\d{4}-\\d{2}-\\d{2}?";   //uproszczony
        RegexTester dateString = new RegexTester(p);

        Pattern pattern = Pattern.compile(p);
        Matcher matcher = pattern.matcher(text);

        if(matcher.find()){
            System.out.println("Znalazłem datę w tekście");
        } else{
            System.out.println("Nie ma daty w tekście");
        }

    }
}
/*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra = [0-9]
    \\D - jakikolwiek znak nie będący cyfrą
    \\w - znak używany w słowach (word) = [a-zA-Z0-9_]
    \\W - jakikolwiek znak który nie jest używany w słowach (przeciwieństwo \\w)
    \\s - białę znaki (spacja, tab, itp) = [\t\n\r\f\x0B] (znaki niewidoczne)
 */