////public class exam {
////    public static void main(String[] args) {
////        int number = 5;
////        int factorial = 1;
////
////        for (int i = 1; i <= number; i++) {
////            factorial *= i;
////        }
////
////        System.out.println("Factorial of " + number + " is: " + factorial);
////    }
////}
//public class exam {
//    public static void main(String[] args) {
//        int n = 10;
//        int a = 0, b = 1;
//
//        System.out.print("Fibonacci Series up to " + n + ": ");
//        for (int i = 1; i <= n; i++) {
//            System.out.print(a + " ");
//
//            int sum = a + b;
//            a = b;
//            b = sum;
//        }
//    }
//}
public class exam {
    public static void main(String[] args) {
        int number = 12321;
        int temp = number;
        int reversedNumber = 0;

        while (temp != 0) {
            int remainder = temp % 10;
            reversedNumber = reversedNumber * 10 + remainder;
            temp /= 10;
        }

        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
    }
}
