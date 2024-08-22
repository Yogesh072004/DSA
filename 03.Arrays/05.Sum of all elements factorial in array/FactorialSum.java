public class FactorialSum {
    
    
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }


    public static long sumOfFactorials(int[] arr) {
        long sum = 0;
        for (int num : arr) {
            sum += factorial(num);
        }
        return sum;
    }

    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5}; 
        long sum = sumOfFactorials(array);
        System.out.println("The sum of factorials of the array elements is: " + sum);
    }
}
