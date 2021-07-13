public class Calculator {

    public static void main (String[]args){
        Validator.input(); //запускаем ввод строки и ее валидацию
        Solution.calculation(); //производим вычисления
        if (Validator.rome){ //если строка содержала римские цифры, полученны результат переводим в римские
            Transformer.translateToRome();
            System.out.println(Transformer.romeResult); //выводим на экран результат в римских цифрах
        }
        else{
            System.out.println(Solution.result); //выводим на экран результат в арабских цифрах
        }



    }

}
