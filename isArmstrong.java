/**
 * ARMSTRONG NUMBER - DEFINITION:
 * Ek Armstrong number wo number hota hai jiske har digit ko uski 
 * total digit-count ke power tak raise karke add kiya jaaye, toh 
 * sum wapas original number ke barabar aa jaata hai.
 *
 * Formula: agar number mein 'n' digits hain, toh
 * (digit1)^n + (digit2)^n + ... + (digitN)^n = original number
 *
 * Example: 153 (3 digits)
 * 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153 ✅ (Armstrong number hai)
 *
 * Example: 9474 (4 digits)
 * 9^4 + 4^4 + 7^4 + 4^4 = 6561 + 256 + 2401 + 256 = 9474 ✅
 */

import java.util.Scanner; // Scanner class import ki, taaki user se keyboard input le sakein

class isArmstrong {
    public static void main(String[] args){

        // Variables declare kiye:
        // digits    -> number mein total kitne digits hain, ye store karega
        // sum       -> har digit ko power(digits) tak raise karke unka total sum store karega
        // temp      -> original number 'n' ki copy, n ko safe rakhna hai kyunki last mein usse compare karna hai
        // remainder -> har iteration mein number ka last digit store karega
        // n         -> user ka original input number (isse final comparisson hoga)

        int digits = 0, sum = 0, temp, remainder, n;

        Scanner sc = new Scanner(System.in); // Scanner object banaya keyboard input lene ke liye

        System.out.print("enter your number to check if it is an armstrong or not :- ");
        n = sc.nextInt(); // user se number liya aur 'n' mein store kiya

        // ===== STEP 1: Number mein total kitne digits hain, wo count karo =====
        // Kyu? Kyunki Armstrong number ka rule hai: har digit ko power(total_digits) tak raise karna hota hai.

        temp = n; // n ki value temp mein copy ki (n ko change nahi karenge, baad mein use hoga)

        while( temp != 0 ){          // jab tak temp 0 nahi ho jaata (matlab saare digits process na ho jaayein)
            temp = temp/10;          // last digit hataya (integer division decimal ko cut kar deta hai)  jaise 153/10 = 15 (3 hat gaya)
            digits ++;                // ek digit count hui, isliye counter badhaya
        };

        // ===== STEP 2: Har digit ko power(digits) tak raise karke sum nikala =====

        temp = n; 
        // temp ko DOBARA reset kiya n se, kyunki Step 1 wale loop mein 
        // temp already 0 ho chuka tha, ab dobara use karna hai

        while( temp !=0 ){
            remainder = temp%10; 
            // temp%10 se last digit ki VALUE nikaali (jaise 153%10 = 3)
            // ye humein chahiye kyunki isi digit ko power tak raise karna hai

            sum = sum + (int)Math.pow(remainder, digits); 
            // Math.pow() hamesha DOUBLE return karta hai, isliye (int) laga ke 
            // usko integer mein convert kiya (taaki sum, jo int hai, usme add ho sake)
            temp = temp / 10;  // last digit hataya (jaise 153/10 = 15)
        }
        // Loop khatam hone tak 'sum' mein saare digits ki power ka total mil chuka hoga
        // Example: n=153 → sum = 1^3 + 5^3 + 3^3 = 1 + 125 + 27 = 153

        // ===== STEP 3: Original number aur calculated sum ko compare karo =====

        if( sum == n){
            System.out.println(n + " is an armstrong number"); // match hua → Armstrong hai
        }else {
            System.out.println(n + " is not an armstrong number"); // match nahi hua → Armstrong nahi hai
        }

    }
}