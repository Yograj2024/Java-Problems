import java.util.Scanner;

class _87_ReverseInput{

    static String ReverseStr(String str){
        String revStr = "";
        for(int i = str.length() - 1; i>=0; i--){
            revStr += str.charAt(i);
        }
        return revStr;
    }

    static int ReverseInt(int num){
        int revInt = 0 ;

        while(num > 0){
            revInt = (revInt * 10) + (num % 10);
            num = num/10;
        }
        return revInt;
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.println(" ");
        System.out.println("choose what your want to reverse :- \n  1. type str for string. \n  2. type num for a number.\n");
        
        System.out.print("your chooice :- ");
        String choice = sc.nextLine();


        if(choice.equalsIgnoreCase("str")){
            System.out.print("please enter your string :- ");
            String str = sc.nextLine();
            System.out.print(ReverseStr(str));
        }else if(choice.equalsIgnoreCase("num")){
            System.out.print("please enter your number :- ");
            int num = sc.nextInt();
            System.out.print(ReverseInt(num));
        }else{
            System.out.print("please enter right choice.");
        }

    }
}