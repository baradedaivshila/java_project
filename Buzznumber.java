 import java.util.Scanner;
    public class Buzznumber {


public static  void main(String[] args)
{
//object of scanner class
Scanner sc=new Scanner(System.in);
System.out.println(" enter the number");
int num=sc.nextInt();
String result=(num<=99&&num>=10)?((num%7==0||num%10==7)?("The given number is Buzz"):("The given number is not Buzz")):("invalid number");

System.out.println(result);

}

}
    
/*
 compile time successful
 runtime successful
 enter the number
 27
 the given number is Buzz
 */
