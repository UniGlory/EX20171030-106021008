import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int a = scn.nextInt();
        if (a > 100 || a < 0) {
            System.out.println("Error");
        } else {
            if (a <=100 && a >= 90) {
                System.out.println("A");
            } else if (a < 90 && a >= 80) {
                System.out.println("B");
            } else if (a < 80 && a >= 70) {
                System.out.println("C");
            } else if (a < 70 && a >= 60) {
                System.out.println("D");
            } else if (a < 60) {
                System.out.println("E");
            }
//        if(a>100 || a<0){
//            System.out.println("Error");
//        }else {if (a>=60){
//            System.out.print("及格"); }
//            else {
//            System.out.print("不及格");
//        }
//
//        }
//        if(a<=100&&a>=0){if (a>=60){
//            System.out.print("及格");
//        }else {
//            System.out.print("不及格");
//        }
//
//        }else {
//            System.out.println("Error");
//        }

        }
    }
}
