public class Transformer {
    public static int first;
    public static int second;
    public static String operator;
    public static String romeResult;
    public static String[] romeDigit = new String []{"I", "II", "III", "IV", "V", "VI", "VII", "VIII", "IX", "X"};

    public static void changeArabian (){ //раскладываем строку на отдельные элементы
        String[] subStr = Validator.input.split(" ");
        first = Integer.parseInt (subStr[0]);
        second = Integer.parseInt (subStr[2]);
        operator = subStr[1];
    }

    public static void changeRome () { //раскладываем строку на отдельные элементы, переводим римские цифры в арабские
        String[] subStr = Validator.input.split(" ");
        for (int i = 0; i < 10; i++){
            if (subStr[0].equals(romeDigit[i])){
                first = i + 1;
            }
        }
        for (int i = 0; i < 10; i++){
            if (subStr[2].equals(romeDigit[i])){
                second = i + 1;
            }
        }
        operator = subStr[1];

    }

    public static void translateToRome (){ //переводим результат в арабских цифрах обратно в римские
        if (Solution.result <= 10){
            romeResult = romeDigit[Solution.result - 1];
        }
        else {
            if ((Solution.result > 10) && (Solution.result <= 20)){
                romeResult = "X"+romeDigit[Solution.result - 11];
            }
            else {
                if ((Solution.result > 20) && (Solution.result <= 30)){
                    romeResult = "XX"+romeDigit[Solution.result - 21];
                }
                else {
                    if ((Solution.result > 30) && (Solution.result < 40)) {
                        romeResult = "XXX" + romeDigit[Solution.result - 31];
                    }
                    else {
                        if (Solution.result == 40) {
                            romeResult = "XL";
                        }
                        else {
                            if ((Solution.result > 40) && (Solution.result < 50)) {
                                romeResult = "XL" + romeDigit[Solution.result - 41];
                            }
                            else {
                                if (Solution.result == 50){
                                    romeResult = "L";
                                }
                                else {
                                    if ((Solution.result > 50) && (Solution.result <= 60)) {
                                        romeResult = "L"+romeDigit[Solution.result - 51];
                                    }
                                    else {
                                        if ((Solution.result > 60) && (Solution.result <= 70)){
                                            romeResult = "LX"+romeDigit[Solution.result - 61];
                                        }
                                        else {
                                            if ((Solution.result >70) && (Solution.result <= 80)) {
                                                romeResult = "LXX"+romeDigit[Solution.result - 71];
                                            }
                                            else {
                                                if ((Solution.result > 80) && (Solution.result < 90)) {
                                                    romeResult = "LXXX"+romeDigit[Solution.result - 81];
                                                }
                                                else {
                                                    if (Solution.result == 90){
                                                        romeResult = "XC";
                                                    }
                                                    else {
                                                        if ((Solution.result > 90) && (Solution.result < 100)){
                                                            romeResult = "XC"+romeDigit[Solution.result - 91];
                                                        }
                                                        else {
                                                            if (Solution.result == 100){
                                                                romeResult = "C";
                                                            }
                                                        }

                                                    }
                                                }
                                            }
                                        }
                                    }

                                }
                            }
                        }

                    }

                }
            }
        }
    }

}
