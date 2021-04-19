import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        int N=obj.nextInt();
        int M=obj.nextInt();
        if(N==M)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
