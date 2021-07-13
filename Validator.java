import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class Validator {
    public static String input;
    public static boolean rome;
    public static void input () {
        Scanner console = new Scanner (System.in);
        input = console.nextLine(); //вводим строку
        String regexArabian = "^^([1-9]|10)\\\\s[+-/*]\\\\s([1-9]|10)$"; //шаблон для арабских цифр
        String regexRome = "^((I{1}(I{0,2}|V{0,1}|X{0,1}))|(V{1}I{0,3})|X)\\s[+-/*]\\s((I{1}(I{0,2}|V{0,1}|X{0,1}))|(V{1}I{0,3})|X)$"; //шаблон для римских цифр
        Pattern patternArabian = Pattern.compile(regexArabian);
        Matcher matcherArabian = patternArabian.matcher(input);

        if (matcherArabian.find()) {    //проверяем строку по шаблону дл арабских цифр
            Transformer.changeArabian();



        }
        else {
            Pattern patternRome = Pattern.compile(regexRome);
            Matcher matcherRome = patternRome.matcher(input);
            if (matcherRome.find()){    //проверяем строку по шаблону для римских цифр
                rome = true;
                Transformer.changeRome();
            }

        }


    }
}
