import java.util.Scanner;

public class Triangle {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();
        if(a + b > c && b + c > a && a + c > b){
            if(a == b && a == c) System.out.println("等边三角形");
            else if(a == b || b == c || a == c) System.out.println("等腰三角形");
            else System.out.println("一般三角形");
        }
        else {
            System.out.println("非三角形");
        }
    }
}
