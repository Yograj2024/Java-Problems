import java.util.Scanner;

class _94_SumAndProduct {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Work with a positive copy so negative numbers don't break the loop
        int n = Math.abs(num);

        int sum = 0;
        int product = 1;

        if (n == 0) {
            // Special case: the number 0 has a single digit, 0
            sum = 0;
            product = 0;
        } else {
            while (n > 0) {
                int digit = n % 10;   // extract last digit
                sum += digit;         // add to sum
                product *= digit;     // multiply into product
                n /= 10;               // remove last digit
            }
        }

        System.out.println("Sum of digits: " + sum);
        System.out.println("Product of digits: " + product);

        sc.close();
    }
}