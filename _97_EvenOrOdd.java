import java.util.Scanner; // Scanner class import kar rahe hain jisse user se input le sakein

class _97_EvenOrOdd {
    public static void main(String[] args){

        // Scanner object banya jo keyboard se input read karega
        Scanner sc = new Scanner(System.in);

        // User ke liye message, number enter karne ke liye
        System.out.print("enter your number:- ");

        // User se ek integer number input liya aur "inputNo" variable me store kar rahe hain
        int inputNo = sc.nextInt();

        // Check kar rahe hain ki number 2 se divide hone pe remainder 0 hai ya nahi
        // Agar remainder 0 hai to number "even" hai
        if (inputNo % 2 == 0) System.out.println("entered number is even");   

        // Agar remainder 0 nahi to number "odd" hai
        else System.out.println("entered number is odd");    
    }
}