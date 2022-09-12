import java.util.*;
public class AssignmentDiamond {
    public static void main(String[] args) {
        int i,j,n,s=1;
        System.out.println("Enter number of rows: ");
        Scanner c=new Scanner(System.in);
        n=c.nextInt();
        s=n-1;
        for (j=1;j<=n;j++) {
            for (i=1;i<=s;i++) {
                System.out.print("   ");
            }
            s--;
            for (i=1;i<=(2*j-1);i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
        s=1;
        for(j=1;j<=n;j++) {
            for (i=1;i<=s;i++) {
                System.out.print("   ");
            }
            s++;
            for (i=1;i<=2*(n-j)-1;i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
