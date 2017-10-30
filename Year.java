import java.util.Scanner;

public class Year {
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        if (a%400==0){
            System.out.println("Bissextile year");
        }else if (a%100==0){
            System.out.println("Common year");
        }else if (a%4==0){
            System.out.println("Bissextile year");
        }else{
            System.out.println("Common year");
        }
    }
}
