import java.security.PublicKey;
import java.util.*;
public class JavaTutorial {
    public static void main(String[] args) {
        //System.out.println("hello world");

        /*int x=10;
        int y=20;
        System.out.print(x);
        System.out.print(y);*/

        /*Scanner sc=new Scanner(System.in);
        int a,b;
        System.out.println("Enter 2 integers");
        a=sc.nextInt();
        b=sc.nextInt();
        int s=a+b;
        System.out.println("Sum of 2 numbers= "+s);*/

        // input 5 nos. print the percentage

        /*int x=90, y=80, z=70, a=85, b=95;
        int p=(x+y+z+a+b);
        float marks=p/5;
        System.out.println("Percentage is "+marks);
        */

        /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int a = sc.nextInt();
        int b = sc.nextInt();
        float c = (a + b) / 2;
        System.out.println("Average is " + c);
        */

        // input 2 var. name and marks. output Mr name have recieved this marks

        /* Scanner c=new Scanner(System.in);
        System.out.println("Enter name");
        String n=c.next();
        System.out.println("Enter marks");
        int m=c.nextInt();
        System.out.println("Mr. "+n+" has received "+m);
        */

        /*Scanner c=new Scanner(System.in);
        System.out.println("enter 2 numbers");
        int a=c.nextInt();
        int b=c.nextInt();
        System.out.println("Remainder is "+ a%b);
         */

        /*String name="Subhadeep Kundu";
        System.out.println(name.length());
        System.out.println(name.indexOf('e'));
        System.out.println(name);
        int x=name.indexOf('e');
        System.out.println(x);
        String k=name.toUpperCase();
        System.out.println(k);
        String l=name.toLowerCase();
        System.out.println(l);
        */

        /*WIDENING ( INT TO FLOAT )
        int x=20;
        double y=x;
        System.out.println(x);
        System.out.println(y);
        */

        /*NARROWING
        double x=20.00;
        int y=(int)x;
        System.out.println(x);
        System.out.println(y);
        */

        /* Char typecasting
        int x=66;
        char y=(char)x;
        System.out.println(x);
        System.out.println(y);
        */

        /*Scanner c=new Scanner(System.in);
        System.out.println("enter 1 number");
        int x=c.nextInt();
        if (x<10)
            System.out.println(x*2);
        else if (x>=10 && x<20)
            System.out.println(x*3);
        else if (x>=20 && x<30)
            System.out.println(x*4);
        else
            System.out.println(x*5);


         */
        // take values from length and breadth. check square or rectangle
        /*Scanner c=new Scanner(System.in);
        System.out.println("enter length and breadth");
        int l=c.nextInt();
        int b=c.nextInt();
        if (l==b)
            System.out.println("Square");
        else
            System.out.println("Rectangle");
        */
        
        /*take 3 inputs. print the greatest
        Scanner c=new Scanner(System.in);
        System.out.println("enter 3 numbers");
        int a=c.nextInt();
        int b=c.nextInt();
        int d=c.nextInt();
        if (a>b && a>d)
            System.out.println(a+" is the greatest");
        else if (b>a && b>d)
            System.out.println(b+" is the greatest");
        else
            System.out.println(d+" is the greatest");
        */

        /*leap year
        Scanner c=new Scanner(System.in);
        System.out.println("enter the year");
        int y=c.nextInt();
        if (y%4==0 && y%100!=0 || y%400==0 )
            System.out.println("leap year");
        else
            System.out.println("Not a leap year");
        */

        /*Scanner c=new Scanner(System.in);
        System.out.println("1. ADD  2. SUBTRACT  3. MULTIPLICATION  4. DIVISION ");
        System.out.println("Enter 2 numbers ");
        int a=c.nextInt();
        int b=c.nextInt();
        System.out.println("Enter choice");
        int ch=c.nextInt();
        switch (ch) {
            case 1: {
                System.out.println("Sum is "+(a+b));
                break; }
            case 2: {
                System.out.println("Subtraction is "+(a-b));
                break; }
            case 3: {
                System.out.println("Multiplication is "+(a*b));
                break; }
            case 4: {
                System.out.println("Division is "+(a/b));
                break;}
            default:
                System.out.println("Wrong Input");
            */
        /*
        int i;
        for (i=1; i<=5;i++) {
            System.out.println(i);
        */

        /*int i=0;
        do {
            i+=1;
            System.out.println(i);
        } while (i<5);
         */

        /*int i,s=0;
        for (i=1;i<=10;i++){
            s+=i;
        }
        System.out.println("Sum is "+s);
        */

        /*int i, n=5;
        for (i=1;i<=10;i++){
            System.out.println(n+" X "+i+" = "+ (n*i));
        }
        */

        /*int i,j;
        for (i=1;i<=5;i++){
            for (j=1;j<=i;j++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        */
        /*int i,j;
        for (i=5;i>=1;i--){
            for (j=i;j>=1;j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /*int i,j,k,r=6;
        for (i=1;i<=r;i++){
            for (j=1;j<=r-i;j++){
                System.out.print("   ");
            }
            for (k=1;k<=(2*i-1);k++){
                System.out.print(" * ");
            }
            System.out.println();
        }
        */

        /* palindrome number
        int t,r=0,d=0;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter a number ");
        int a=c.nextInt();
        t=a;
        while (a>0) {
            d=a%10;
            r=(r*10)+d;
            a=a/10;
        }
        if (r==t)
            System.out.println("Palindrome");
        else
            System.out.println("Not palindrome");
        */
        /*
        int a[]=new int[3],i;
        a[0]=10;
        a[1]=20;
        a[2]=30;
        for (i=0;i<a.length;i++) {
            System.out.println(a[i]);*/

        /*int[] a=new int[11];
        int i;
        System.out.println("Enter 10 marks");
        Scanner c=new Scanner(System.in);
        for (i=1;i<=10;i++){
            a[i]=c.nextInt();
        }
        for (i=1;i<=10;i++) {
            System.out.println(a[i]);
        }
        */
        /*
        Scanner c=new Scanner(System.in);
        System.out.println("Enter name : ");
        String n=c.next();
        System.out.println("Enter age : ");
        int a=c.nextInt();
        System.out.println("Your name is "+n);
        System.out.println("Your age is "+a);
        */

        /* CURRENCY CONVERTER
        INR INPUT
        US$
        Pound
        ZEN
        */
        /*
        Scanner c=new Scanner(System.in);
        System.out.println("Enter amount in INR: ");
        float a=c.nextFloat();
        float u=a/79;
        float p=a/111;
        float z=a/70;
        System.out.println("Amount in US$ : "+u);
        System.out.println("Amount in Pound : "+p);
        System.out.println("Amount in Zen : "+z);
        */

        /*Scanner c=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=c.next();
        String rev="";
        int i;
        char ch;
        for (i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
        */
        /*Scanner c=new Scanner(System.in);
        try {
            int i;
            int[] arr = new int[5];
            for (i = 1; i < 10; i++) {
                arr[i] = c.nextInt();
            }
        }
        catch(Exception e) {
            System.out.println("Something went wrong");
        }
        */
        /*double a=25;
        double x=Math.sqrt(a);
        System.out.println(x);
        */
/*
        sum(23,34);
        sum(23.0f,34.0f);
    }
    public static void sum(int a,int b) {
        int sum=a+b;
        System.out.println("Sum in int : "+sum);
    }
    public static void sum(float a,float b) {
        float sum=a+b;
        System.out.println("Sum in float : "+sum);
    }
    */



    }
}
