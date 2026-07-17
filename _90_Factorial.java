import java.util.Scanner;

class _90_Factorial {

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int fact = 1;

        System.out.print("enter the number :- ");
        int num = sc.nextInt();
        
        while( num > 0){
            fact *= num;
            num--;
        }

        System.out.println("Factorial of Given no. through loop is :" + fact);
    
    }
}