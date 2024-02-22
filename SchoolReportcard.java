 import java.util.Scanner;
    public class SchoolReportcard {
    public static void main(String[]src){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Student Name:");
        String name=sc.nextLine();
        System.out.println("Enter Student Roll Number:");
        int roll =sc.nextInt();
        System.out.println("Enter Exam Name:");
        String exam=sc.next();
        System.out.println("Enter Subject Marks:");


        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        int e=sc.nextInt();

        int total=(a+b+c+d+e);
        float percent=(total/5);
        System.out.println(percent);

       int per=(int)percent;
        char grade=(per<=100&&per>=75)?('A'):((per<75&&per>=60)?('B'):((per<60&&per>=45)?('C'):((per<45&&per>=35)?('D'):('F'))));

        String remark=(grade=='A')?("** Very Good **"):((grade=='B')?("* Good *"):((grade=='C')?("$ Need Improvement $"):((grade=='D')?("Work Hard"):("Better Luck Next Time"))));

        System.out.println("");
        System.out.println("============================================= Report Card ======================================");
        System.out.println("");
        System.out.println("::::::::::::::::::::::::::::::::::::::::::: M.G.School.karmala ::::::::::::::::::::::::::::::::");
        System.out.println("");
        System.out.println("''''''''''''''''''''''''''''''''''''''''''''''   C.B.S.E  ''''''''''''''''''''''''''''''''''''''");
        System.out.println("================================================================================================");
        System.out.println("");
        System.out.println("Student Name:"+name+"                                                            "+"Date:03/11/2003");
        System.out.println("");
        System.out.println("Roll Number:"+roll+"                                                             "+"Exam Name:"+exam );
        System.out.println("");
        System.out.println("************************************************************************************************");
        System.out.println("");
        System.out.println("------------------------------------------------------------------------------------------------");
      System.out.println("Subject                                    Out Of                                  Mark Obtained");
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Chemistry                                    100                                            "+a);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("physics                                      100                                            "+b);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Biology                                      100                                            "+c);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("Math                                         100                                            "+d);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("English                                      100                                            "+e);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("Total                                        500                                            "+total);
        System.out.println("------------------------------------------------------------------------------------------------");
        System.out.println("");
        System.out.println("");
        System.out.println("================================================================================================");
        System.out.println("Percentage:"+percent+"                                                                          Grade:"+grade);
        System.out.println("");
        System.out.println(remark);
        System.out.println("================================================================================================");
        System.out.println("");
        System.out.println("");



    }

    
}

/*output:

 Enter Student Name:
Daivshila barade
Enter Student Roll Number:
5305
Enter Exam Name:
Insem

Enter Subject Marks:
85
78
83
68
98
82.0

============================================= Report Card ======================================

::::::::::::::::::::::::::::::::::::::::::: M.G.School.karmala ::::::::::::::::::::::::::::::::

''''''''''''''''''''''''''''''''''''''''''''''   C.B.S.E  ''''''''''''''''''''''''''''''''''''''
================================================================================================

Student Name:Daivshila barade                                                            Date:03/11/2003

Roll Number:5305                                                             Exam Name:Insem

************************************************************************************************

------------------------------------------------------------------------------------------------
Subject                                    Out Of                                  Mark Obtained
------------------------------------------------------------------------------------------------
Chemistry                                    100                                            85
------------------------------------------------------------------------------------------------
physics                                      100                                            78
------------------------------------------------------------------------------------------------
Biology                                      100                                            83
------------------------------------------------------------------------------------------------
Math                                         100                                            68
------------------------------------------------------------------------------------------------
English                                      100                                            98
------------------------------------------------------------------------------------------------

Total                                        500                                            412
------------------------------------------------------------------------------------------------


================================================================================================
Percentage:82.0                                                                          Grade:A

** Very Good **
================================================================================================

 */