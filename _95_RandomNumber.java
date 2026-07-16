import java.util.Scanner;

class _95_RandomNumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int min = 0, max;
        System.out.print("How many random numbers do you want to generate: "); // Kitne random numbers generate karne hain
        int no = sc.nextInt();


        System.out.print("Do you want a range..? (yes/no): ");   // User se puchna hai ki custom range chahiye ya nahi
        String isRange = sc.next();

        // equalsIgnoreCase -> case ignore karta hai (YES, Yes, yes sab match honge), "y" bhi accept karne ke liye OR (||) laga diya
        if (isRange.equalsIgnoreCase("yes") || isRange.equalsIgnoreCase("y")) {

            System.out.print("Enter the minimum value: ");
            min = sc.nextInt();

            System.out.print("Enter the maximum value: ");
            max = sc.nextInt();
           
            if (min > max) {   // Edge case: min, max se bada nahi hona chahiye
                System.out.println("Minimum value cannot be greater than maximum value.");
                sc.close();
                return;
            }

        } else {
            System.out.print("Generate random numbers less than: ");  // Range nahi chahiye to sirf upper limit lo, min 0 hi rahega
            max = sc.nextInt();
        }

        sc.close();

        System.out.print("\nGenerated Random Numbers: ");
        generateRandomNumbers(no, min, max);
    }

    // logic ek jagah rakh taaki dono cases (range wala aur bina range wala) ek method se handle ho jaayein,
    static void generateRandomNumbers(int count, int min, int max) {
        for (int i = 0; i < count; i++) {

            // Formula: (int)(Math.random() * (max - min + 1)) + min
            // -> min se max tak (dono inclusive) random whole number deta hai
            // Agar min = 0 hai (bina range wale case me), to ye 0 se max-1 tak number dega
            int random = (int) (Math.random() * (max - min + 1)) + min;

            System.out.print(random + (i == count-1 ? " " : ", " ));
        }
    }
}