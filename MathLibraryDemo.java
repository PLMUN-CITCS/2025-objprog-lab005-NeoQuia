public class MathLibraryDemo {
    public static void main(String[] args) {
    double base = 2;
    int exponent = 3;
    
    //calculate the power
    double powerResult = Math.pow(base, exponent);

    double numberForSqrt = 16;

    //calculate square root
    double sqrtResult = Math.sqrt(numberForSqrt);

    double decimalNumber = 5.67;

    //round a decimal number
    long roundedNumber = Math.round(decimalNumber);

    // generate random number
    double randomNumber = Math.random();

    System.out.println("Power: " + powerResult);
    System.out.println("Square Root: " + sqrtResult);
    System.out.println("Rounded Number: " + roundedNumber);
    System.out.println("Random Number: " + randomNumber);

    }
}