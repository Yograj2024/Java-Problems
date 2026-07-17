import java.util.Scanner;

class _90_Factorial {

    static int factorial(int n){
        // base case
        // Base Case wo condition hoti hai jahan recursion ruk jata hai.
        if(n == 1){
            return 1;
        }

        // recursive case
        // Recursive Case wo part hota hai jahan function khud ko dobara call karta hai.
        // Yahan function khud ko chhoti problem ke saath call karega.
        return n * factorial(n-1);
        // Current number (n) ko usse ek chhote number (n-1) ke factorial se multiply karke result return karo.


        /* 
            Visual Call Stack
            Function Calls

            factorial(5)  
                ↓  5 * factorial(4)
            factorial(4)
                ↓  5 * (4 * factorial(3))
            factorial(3)
                ↓ 5 * (4 * (3 * factorial(2)))
            factorial(2)
                ↓  5 * (4 * (3 * (2 * factorial(1))))
            factorial(1)  => Sabse niche Base Case mila 1 return karega.


            Returns
            factorial(1)
            returns 1
                ↑ 5 * (4 * (3 * (2 * 1)))
            factorial(2)
            returns 2
                ↑ 5 * (4 * (3 * 2))
            factorial(3)
            returns 6
                ↑
            factorial(4)
            returns 24
                ↑ 5 * (4 * 6)
            factorial(5)
                ↑ 5 * 24
            returns 120
        
         */
    }

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;

        System.out.print("enter the number :- ");
        int num = sc.nextInt();
        int copyNUM = num;

        /*   Hum factorial ko loop aur recursion dono se calculate kar rahe the.
            Code me humne user se input liya:
            Loop ke andar num har iteration me 1 se kam hota gaya.   5 → 4 → 3 → 2 → 1 → 0
          

            eske baad Ab humne recursion ko call kiya:
            loop itoration ke baad num (user input) ki value 0 ho gayi
            Isliye actual call hui:  factorial(0);

            Execution kuch is tarah chalta raha:
                factorial(0)
                    ↓
                factorial(-1)
                    ↓
                factorial(-2)
                    ↓
                factorial(-3)
                    ↓
                .........

            esliye hamara base case kabhi execute hi nahi hota or recursin chalta rahega
            Aakhir me Java ki Call Stack bhar gayi aur error aaya: StackOverflowError

            Is Problem ka Reason

            Loop ne original input (num) ko modify kar diya tha.
            Jab recursion call hui, tab uske paas original value nahi thi.
            Uske paas 0 thi.
            Solution : Original input ki copy create kar ke function call ke time copy pass karo  */


        while( num > 0){
            fact *= num;
            num--;
        }


        // through recursion
        int result = factorial(copyNUM);

        System.out.println("Factorial of Given no. through loop is :" + fact);
        System.out.println("Factorial of Given no. through recursion is :" + result);


    }
}