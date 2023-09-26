package regex;
/*
    Predefiniowane klasy:
    \\d - jakakolwiek cyfra = [0-9]
    \\D - jakikolwiek znak nie będący cyfrą
    \\w - znak używany w słowach (word) = [a-zA-Z0-9_]
    \\W - jakikolwiek znak który nie jest używany w słowach (przeciwieństwo \\w)
    \\s - białę znaki (spacja, tab, itp) = [\t\n\r\f\x0B] (znaki niewidoczne)
 */
public class RegexExample {
    public static void main(String[] args) {

        String yearPattern = "\\d{4}"; //(liczba 4-cyfrowa)
        RegexTester tester = new RegexTester(yearPattern);

        tester.validate("1984");
        tester.validate("2023");
        tester.validate("1912384");
        tester.validate("184");

        String p = "\\D*";
        RegexTester tester2 = new RegexTester(p);
        tester2.validate("uigsdiufygiu");
        tester2.validate("uygsadf6khjg9");
        tester2.validate("345sdfgsdf345");

        String t = "\\d\\w\\d";
        RegexTester tester3 = new RegexTester(t);
        tester3.validate("1_6");
        tester3.validate("0X4");
        tester3.validate("a7b");
        tester3.validate("0 3");
    }
}
