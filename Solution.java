public class Solution {
    public static int result;
    public static void calculation () {
        if (Transformer.operator.equals("+")) {
            result = Transformer.first + Transformer.second;
        }
        else {
            if (Transformer.operator.equals("-")){
                result = Transformer.first - Transformer.second;
            }
            else {
                if (Transformer.operator.equals("*")){
                    result = Transformer.first * Transformer.second;
                }
                else {
                    result = Transformer.first / Transformer.second;
                }
            }
        }

    }
}
