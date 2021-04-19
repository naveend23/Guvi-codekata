import java.util.Scanner;
import java.lang.Integer;
public class Main {
    public static void main(String[] args) {
       
        //Getting input via STDIN
        Scanner obj = new Scanner(System.in);
        double B=obj.nextDouble();
        double H=obj.nextDouble();
        double area=(B*H)/2;
        System.out.println(+area);
    }
}
