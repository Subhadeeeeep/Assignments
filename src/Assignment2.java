import java.util.*;
public class Assignment2 {
    public static void main(String[] args) {
        // 1. TAKE USER INPUT REVERSE OF A STRING ( PRINT BOTH STRINGS )
        /*Scanner c=new Scanner(System.in);
        System.out.println("Enter a string: ");
        String str=c.next();
        System.out.println(str);
        String rev="";
        int i;
        char ch;
        for (i=0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }
        System.out.println(rev);
        */

        //2. SWAP TWO VARIABLES WITHOUT USING 3RD VARIABLE
        /*Scanner c=new Scanner(System.in);
        System.out.println("Enter value of X ");
        int x=c.nextInt();
        System.out.println("Enter value of Y");
        int y=c.nextInt();
        x=x+y;
        y=x-y;
        x=x-y;
        System.out.println("Value of X = "+x);
        System.out.println("Value of Y = "+y);
        */

        //3.  PRINT THE FIBONACCI SERIES TILL 'N'.
        /*int f = 0, s = 1;
        Scanner c=new Scanner(System.in);
        System.out.println("Enter value of X ");
        int n=c.nextInt();

        while (f <= n) {
            System.out.print(f + ", ");

            int nextTerm = f + s;
            f = s;
            s = nextTerm;
        */

        //4.PALINDROME OF A STRING.
        /*String str, rev = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string:");
        str = sc.nextLine();
        String str1 = str.toLowerCase();

        int length = str1.length();
        int i;
        for (i=length-1;i>=0;i--) {
            rev = rev + str1.charAt(i);
        }
        if (str1.equals(rev))
            System.out.println(str1+" is a palindrome");
        else
            System.out.println(str1+" is not a palindrome");
        */

        //5. TAKE 10 INPUTS FROM USER AND SORT IT.
        /*Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store: ");
        int n=sc.nextInt();
        int[] array = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array[i]=sc.nextInt();
        }
        Arrays.sort(array);
        System.out.println("\nThe sorted array is: ");
        for (int num : array) {
            System.out.print(num + " ");
        }
        */
        //6. TAKE INPUT FROM USER AND THE PRINT THE FACTORIAL OF IT
        /*int i, fact = 1;
        Scanner c = new Scanner(System.in);
        System.out.println("enter a no.");
        int n = c.nextInt();
        for (i = 1; i <= n; i++) {
            fact = fact * i;
        }
        System.out.println("Factorial of " + n + " is: " + fact);
        */

        //7. CONVERT A NUMBER FROM STRING TO INTEGER AND VICE VERSA.
        /*Scanner c = new Scanner(System.in);
        System.out.println("enter a string");
        String str = c.next();
        int num = Integer.parseInt(str);
        System.out.println("INTEGER "+num);
        String st = Integer.toString(num);
        System.out.println("STRING "+st);
        */

        //8. TAKE INPUT AS STRING FROM USER AND REMOVE THE INPUT CHARACTER.
        /*Scanner c = new Scanner(System.in);
        System.out.println("enter a string");
        String str = c.next();
        System.out.println("enter a char you want to remove ");
        String r = c.next();
        System.out.println(str.replace(r,""));
        */

        //9. DEFINE ENUM AND PRINT IT.
        /*
        Level X = Level.DUDE;
        System.out.println(X);
    }
    enum Level {
        HEY,
        HELLO,
        DUDE
    }
    */
        // 10. Enter 2 arrays and merge them
        Scanner c = new Scanner(System.in);
        System.out.print("Enter the number of elements you want to store in 1st array: ");
        int n=c.nextInt();
        int[] array1 = new int[n];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<n; i++) {
            array1[i]=c.nextInt();
        }
        System.out.print("Enter the number of elements you want to store in 2nd array: ");
        int m=c.nextInt();
        int[] array2 = new int[m];
        System.out.println("Enter the elements of the array: ");
        for(int i=0; i<m; i++) {
            array2[i]=c.nextInt();
        }
        int len=n+m;
        int[] result = new int[len];
        int p = 0;
        for (int ele: array1) {
            result[p] = ele;
            p++;
        }
        for (int ele: array2) {
            result[p] = ele;
            p++;
        }
        System.out.println("After Merging : ");
        System.out.println(Arrays.toString(result));
    }
}

