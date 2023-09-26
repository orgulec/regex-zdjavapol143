package regex;
/*
Napisz 2 regexy:
1 - > sprawdza poprawność imienia
2 - > sprawdza poprawność nazwiska
(weź pod uwagę nazwiska wieloczłonowe) //bez polskich znakow
np. Bachleda-Curus, von der Leyen, de Silva
 */
public class Regex003 {
    public static void main(String[] args) {

        String name = "[A-Z][a-złóżąćęńćź]+";
        RegexTester tester = new RegexTester(name);

        tester.validate("Urszula");
        tester.validate("Tomek");
        tester.validate("Janusz");
        tester.validate("Jan");
        System.out.println();

//        String surname = "[a-zA-ZŁ]{2,}(\s?-?[a-zA-ZŁóńążęŻńćźŹĆ']{2,})*";
        //RegexTester tester2 = new RegexTester(surname);
        //RegexTester tester2 = new RegexTester("[A-ZŁdv][a-złóńążęŻńćźŹĆ]+(\s?-?[A-Z'a-zŁóńążęŻńćźŹĆ]{2,})*"); //mój
        RegexTester tester2 = new RegexTester("[a-zA-Z]+(['\\- ][a-zA-Z]+)*");  //Rafała :)
        tester2.validate("Kowalski");
        tester2.validate("von der Leyen");
        tester2.validate("von der Leyen Aasd");
        tester2.validate("Bachleda-Curus");
        tester2.validate("da Silva");
        tester2.validate("2435234");
        tester2.validate("Janek002");
        tester2.validate("2");
        tester2.validate("!@#$:");
        tester2.validate("Kowalska-");
        tester2.validate("-Nowak");
        tester2.validate("kowalski");
        tester2.validate("Bachleda--Curus");
        tester2.validate("O'Haara");
        tester2.validate("van von der de Die Das");

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
