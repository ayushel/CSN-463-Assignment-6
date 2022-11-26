import java.util.Scanner;

class Numbers {
    int first, second;

    public Numbers(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Calculator {
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
}

public class first {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Numbers obj = new Numbers(a, b);
        Calculator.Multiply(obj);
        Calculator.Division(obj);
    }
}
