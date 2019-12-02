public class base2 {
    public static boolean isSquare(int input){
        if(input < 1 || input > 10000){
            throw new IllegalArgumentException("Input out of bounds, must be between 1 and 10000");
        }
        int quotient = input;
        int denominator = 1;
        int remainder = quotient % denominator;
        while(denominator <= quotient){
            if(quotient == denominator && remainder == 0){
                return true;
            }
            denominator++;
            quotient = input / denominator;
            remainder = input % denominator;
        }
        return false;
    }
}
