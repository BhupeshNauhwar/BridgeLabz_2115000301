import java.util.Scanner;

public class PositiveNegativeZero {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int num=sc.nextInt();
        if (num==0) {
            System.out.println("Zero");
        }else if (num<0) {
            System.out.println("Negative");
        }else{
            System.out.println("Positive");
        }
    }
}
