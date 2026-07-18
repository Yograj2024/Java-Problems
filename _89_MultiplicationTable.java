import java.util.Scanner;

class _89_MultiplicationTable{

    static void PrintTable(int n){
        for(int i=1; i<=10; i++){
            System.out.println(n + " * " + i + " = " + n * i);
        };
    };

    static void PrintMultiplicationMatrix(int n){
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print(i * j + " ");
            }
            System.out.print("\n");
        }
    };


    public static void main(String[] arga){
        Scanner sc = new Scanner(System.in);

        System.out.print("enter the number whose multiplication table you want :- ");
        int num = sc.nextInt();
        sc.nextLine();

        System.out.println("what do you want a multiplication matrix or a number table :");
        System.out.println(" 1. for matrix type matrix \n 2. for table type table");
        System.out.print("type yout choise : ");

        String choice = sc.nextLine();
        System.out.println("\nyour " + choice);
        System.out.println("");

        if(choice.equalsIgnoreCase("matrix"))
            PrintMultiplicationMatrix(num);
        else 
            PrintTable(num);

        sc.close();

    }
}