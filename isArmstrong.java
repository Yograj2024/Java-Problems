import java.util.Scanner;

class isArmstrong {
    public static void main(String[] args){
        int digits = 0, sum = 0, temp, remainder, n;
        Scanner sc = new Scanner(System.in);

        System.out.print("enter your number to check if it is an armstrong or not :- ");
        n = sc.nextInt();

        temp = n;
        while( temp != 0 ){
            temp = temp/10;
            digits ++;
        };

        temp = n;
        while( temp !=0 ){
            remainder = temp%10;
            sum = sum + (int)Math.pow(remainder, digits);
            temp = temp / 10;
        }

        if( sum == n){
            System.out.println(n + " is an armstrong number");
        }else {
            System.out.println(n + " is not an armstrong number");
        }

    }
}