 class wideningTypecast {
    public static void main (String[]args)
    { 
           int a=10;
        float b=a;//implicit typecast
        int a1=10;
        float b1=(float)a1;//explicit typecast
        System.out.println(b);
        System.out.println(b1);
    }
    
}
/*
 compile time success
 runtime success
 10.0
 10.0
 */
