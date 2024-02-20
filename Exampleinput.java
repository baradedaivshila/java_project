import java.util.Scanner;
class Exampleinput {
    public static void main(String[]args)
    {
        //object of scanner class
        //To call inbuilt method for Scanner class
        Scanner sc =new Scanner(System.in);
        System.out.println("enter int value");
        int a = sc.nextInt();
        String b=(a%2!=0)?("The number is odd"):("The number is even");
        System.out.println(b);

    }
    
}
/*
 compile time successful
 runtime successful
 enter int value
 12
 the number is even
 */
