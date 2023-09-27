package regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample2 {
    public static void main(String[] args) {

        String text = "Some words here.";
        //klasa \\w czyli znaki używane w słowach(word)
        //() -> tworzy grupe w regexie
        Pattern pattern = Pattern.compile(".*(w\\w*).*");   //coś przed + (w....) + coś po
        Matcher matcher = pattern.matcher(text);

        if(matcher.matches()){  //przed wywołaniem group trzeba wywołać matches żeby zadziałało!!!!
            int groupCounter = matcher.groupCount();    //liczy ile grup pasuje w texcie
            for(int i=0; i<=groupCounter; i++){
                System.out.printf("grupa nr %d: %s \n",i,matcher.group(i));
            }
        }

        Pattern pattern1 = Pattern.compile(".*--(\\w+)--.*");
        Matcher matcher1 = pattern1.matcher("Francis --Underwood-- został prezydentem USA");
        System.out.println(matcher1.matches());
        System.out.println(matcher1.group(1));

    }
}
