import java.util.Scanner;

public class Circle {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        if (a<=100 && a>=-100){
            System.out.println("inside");
        }else if (b<=100 && b>=-100){
            System.out.println("inside");
        }else{
            System.out.println("outside");
        }
    }
}
