
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int number;
        int k;
        Scanner input = new Scanner(System.in);
        System.out.print("Sayı giriniz:");
        number = input.nextInt();
        k = pattern(number);
        pattern2(k,number);
    }
    static int pattern(int n){
        System.out.print(" " +n);
        if(n<=0) {
            return n+5;
        }
        return pattern(n-5);
    }
    static int pattern2(int x,int number1){
        System.out.print(" " +x);
        if(x >= number1){
            return x;
        }
        return pattern2(x+5,number1);
    }
}