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

     /* 
        =======================================================
         Method 2: Division ke baad multiply karke check karna
        =======================================================
        Idea: agar number ko 2 se divide karke (integer division, decimal cut hoga)
        wapas 2 se multiply karein, aur result original number ke barabar aaye,
        to matlab number bina remainder ke divide hua tha -> number "even" hai
        Agar result original number se match nahi karta, to number "odd" hai  

    */
        if ((inputNo / 2) * 2 == inputNo) System.out.println("(Division-Multiply method) entered number is even");
        else System.out.println("(Division-Multiply method) entered number is odd");
        
    }
}