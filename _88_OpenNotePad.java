
// IOException class use karne ke liye import kiya gaya hai.
import java.io.*;

class _88_OpenNotePad {

    // Program execution yahi se start hota hai.
    public static void main(String[] args) {

        // Runtime class ka current Runtime object return karta hai.
        // Isi object ki help se hum external programs run kar sakte hain.
        Runtime rs = Runtime.getRuntime();

        // Exception handle karne ke liye try block.
        // Kyuki exec() IOException throw kar sakta hai.
        try {

            // Windows ka Notepad open karega.
            // exec() operating system ko command bhejta hai.
            rs.exec("notepad");
            // calc => calculater

        }
        // Agar Notepad open karte waqt koi error aaye
        // to ye catch block execute hoga.
        catch (IOException e) {

            // Error ko console par print karega.
            System.out.print(e);
        }
    }
}