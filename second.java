import java.util.Scanner;

class Numbers {
    int first, second;

    public Numbers(int first, int second) {
        this.first = first;
        this.second = second;
    }
}

class Calculator {
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
}

public class second {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int a = input.nextInt();
        int b = input.nextInt();
        Numbers obj = new Numbers(a, b);
        Calculator.Add(obj);
        Calculator.Subtract(obj);
    }
}
