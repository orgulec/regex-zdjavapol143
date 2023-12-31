package regex;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/*
Napisz program, który pobiera od użytkownika tekst i sprawdza,
czy w podanym tekście wystąpiła data w formacie YYYY-MM-DD.
Jeśli jest więcej niż jedna data, to wypisz wszystkie dopasowania.
 */
public class Regex005 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String userInput = scan.nextLine();

        Pattern p = Pattern.compile(("(\\d{4}-\\d{2}-\\d{2})"));
        Matcher matcher = p.matcher(userInput);

        while(matcher.find()){
            System.out.println(matcher.group(0));
        }

    }
}
