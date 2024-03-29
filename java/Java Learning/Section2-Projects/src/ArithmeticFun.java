public class ArithmeticFun {

    public static void main(String[] args) {

        int a = 56;
        int b = 75;
        // the a and b are the Operands and the + is the operator here
        int result = a + b;
        // examples of binary operator
        int difference = a - b;
        int product = a * b;
        int quotient = b / a;
        int remainder = b % a; // this is called modulus

        // However in the example below if the Operands are string then the + sign acts as a concatenation instead
        System.out.println("Result is..... " + result);
        System.out.println("Product is ..... " + product);
        System.out.println("diff is ..... " + difference);
        System.out.println("quotient is ..... " + quotient);
        System.out.println("remainder is ..... " + remainder);
        // The below is a UNIRARY operator
        result +=20; // this takes the result and adds a 20 to it. This is also one of the ways of doing it

        System.out.println("New Result is...." + result);
        result++; // We increment the result and then print it to learn more about operators. This is called increment operator
        System.out.println("result++ " + result);

        // Now the challenge code for this lesson is below

        int multipliedProduct;
        multipliedProduct = product * 2;
        System.out.println("Multiplied Product is ......" + multipliedProduct);

        // another alternative way is

        product *=2; // Using the compound operator

        System.out.println("New way to Multiplied Product is ......." + product);






    }

}
