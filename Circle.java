import java.util.Scanner;

public class Circle {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        if (a>=200 || a<0){
            System.out.println("outside");
        }else if (b>=200 || b<0){
            System.out.println("outside");
        }else{
            System.out.println("inside");
        }
    }
}
