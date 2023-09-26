package regex;
/*
 Napisz regex, który znajdzie ciągi(napisy),
 w których po jednej dużej literze następują małe litery
 (conajmniej jedna).
 */
public class Regex002 {
    public static void main(String[] args) {
        String p = "[A-Z][a-z]{1,}";
        RegexTester tester = new RegexTester(p);

        tester.validate("Java");//true
        tester.validate("Ja");//true
        tester.validate("java");//false
        tester.validate("javA");//false
        tester.validate("JAVa");//false
        tester.validate("J");//false
        tester.validate("aJ");//false

    }
}
