import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        
        for(int i=0;i<5;i++)
            System.out.println(userInput);
    }
}
