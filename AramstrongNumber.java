public class AramstrongNumber {
    public static void main(String[]args)
    {
        int number=153;
        int numcopy=number;
        int numcopy1=number;
        int count=0;
        while(number>0) // finding power or count
        {
            count++;
            number=number/10;
            
        }
        //fetching each digit

        int result=0;
       while(numcopy>0)
       {
        int base=numcopy%10;
        //calculating power of each digit power is count
        int product=1;
        for(int i=1;i<=count;i++)
        {
            product=product*base;
        }
        numcopy=numcopy/10;
        System.out.println(product);
        result=result+product;
       }//ends
       if(numcopy1==result)
       {
        System.out.println("given num is armstrong num");
       }
       else
       {
        System.out.println("given num is not armstrong num");
       }
       
    }
    
}
/*
 compile time successful
 runtime successful
 27
125
1
given num is armstrong num
 */