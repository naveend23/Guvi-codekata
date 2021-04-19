import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        int N=Integer.parseInt(userInput);
        for(int i=1;i<=N;i++){
            if(i%2==0)
                System.out.println(i);
        }
    }
}
