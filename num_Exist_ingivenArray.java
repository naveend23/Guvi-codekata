import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        String userInput = obj.next();
        int N=Integer.parseInt(userInput);
        int K=obj.nextInt();
        int temp=0;
        int[] arr=new int[N];
        for(int i=0;i<N;i++){
            arr[i]=obj.nextInt();
            if(arr[i]==K)
                temp++;
        }
        if(temp==1)
            System.out.println("yes");
        else
            System.out.println("no");
    }
}
