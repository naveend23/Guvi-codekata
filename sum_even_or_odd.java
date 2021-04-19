import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();
        int M=obj.nextInt();
        int sum=N+M;
        if(sum%2==0)
            System.out.println("even");
        else
            System.out.println("odd");
    }
}
