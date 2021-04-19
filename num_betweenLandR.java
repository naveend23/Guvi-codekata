import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        int N=Integer.parseInt(userInput);
        int L=obj.nextInt();
        int R=obj.nextInt();
        if(N>L && N<R)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
