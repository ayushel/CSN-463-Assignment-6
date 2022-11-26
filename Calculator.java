import java.util.InputMismatchException;
import java.util.Scanner;

class Numbers {
    int first, second;

    public Numbers(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

public class Calculator {
    static void Add(Numbers obj) {
        try {
            if (obj.first < 0 || obj.second < 0) {
                throw new ArithmeticException();
            }
            int c = obj.first + obj.second;
            System.out.println("Result = " + c);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            System.out.println("Numbers should be positive");
        }
    }

    static void Subtract(Numbers obj) {
        try {
            if (obj.first < 0 || obj.second < 0) {
                throw new ArithmeticException();
            }
            int c = obj.first - obj.second;
            System.out.println("Result = " + c);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            System.out.println("Numbers should be positive");
        }
    }

    static void Multiply(Numbers obj) {
        try {
            if (obj.first == 0 || obj.second == 0) {
                throw new ArithmeticException();
            }
            int result = obj.first * obj.second;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            System.out.println("Numbers should be non-zero");
        }
    }

    static void Division(Numbers obj) {
        try {
            if (obj.first == 0 || obj.second == 0) {
                throw new ArithmeticException();
            }
            int result = obj.first / obj.second;
            System.out.println(result);
        } catch (ArithmeticException arithmeticException) {
            System.out.println(arithmeticException);
            System.out.println("Numbers should be non-zero");
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        try {
            int a = input.nextInt();
            int b = input.nextInt();
            Numbers obj = new Numbers(a, b);
            Add(obj);
            Subtract(obj);
            Multiply(obj);
            Division(obj);
        } catch (InputMismatchException inputMismatchException) {
            try {
                throw new NumberFormatException();
            } catch (NumberFormatException numberFormatException) {
                System.out.println("Numbers should be integers");
            }
        }
    }
}