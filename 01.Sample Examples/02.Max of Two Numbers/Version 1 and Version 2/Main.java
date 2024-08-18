import java.util.Scanner;

class Demo {
    static int max_version1(int a, int b) {
        // Manual code
        return (a > b) ? a : b;
    }

    static int max_version2(int a, int b) {
        // Predefined library
        return Math.max(a, b);
    }
}

class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        
        System.out.println("Enter a value:");
        int a = obj.nextInt();
        
        System.out.println("Enter b value:");
        int b = obj.nextInt();
        
        System.out.println("Max value from version1 = " + Demo.max_version1(a, b));
        System.out.println("Max value from version2 = " + Demo.max_version2(a, b));
    }
}