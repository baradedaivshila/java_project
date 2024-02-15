public class CheakMarksPercentageGrade {
    public static void main(String[] args) {
        int Cs= 82;
        int AI= 74;
        int Wad= 90;
        int Dsbda= 72;
        int Cns= 92;
float total_marks=Cs+AI+Wad+Dsbda+Cns;//calculate total marks
System.out.println("total_marks:"+total_marks );
        float percentage=((total_marks)/500)*100;//calculate percentage
        System.out.println("percentage:" +percentage );
      
        int percentage1=(int) percentage;//using type cast operator
     
        //calculate grade using ternary operator
        char grade=(percentage1>=90 && percentage1<=100) ? ('A'):((percentage1<90 && percentage1>=75) ? ('B') :(percentage1<75 && percentage1>=55) ? ('C') :(percentage1<55 && percentage1>=35) ? ('E') : ('F'));
                     
        System.out.println("Grade: " + grade);
    }
}


                        /*output:-
                          compile Time = Success
                          Run Time = Sucess  
                          total_marks:410.0
                          percentage:82.0
                          Grade:B
                     */