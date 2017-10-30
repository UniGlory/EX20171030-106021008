import java.util.Scanner;

public class Star{
    public static void main(String args[]){
        Scanner scn=new Scanner(System.in);
        int a=scn.nextInt();
        int b=scn.nextInt();
        if (a==1 &&b>=21&&b<=31 || a==2&&b>0&&b<=18){
            System.out.println("Aquarius");
        }else if (a==2&&b>=19&&b<=28 || a==3&&b>0&&b<=20){
            System.out.println("Pisces");
        }else if (a==3&&b>=21&&b<=31 || a==4&&b>0&&b<=20){
            System.out.println("Aries");
        }else if (a==4&&b>=21&&b<=30 || a==5&&b>0&&b<=21){
            System.out.println("Taurus");
        }else if (a==5&&b>=22&&b<=31 || a==6&&b>0&&b<=21){
            System.out.println("Gemini");
        }else if (a==6&&b>=22&&b<=30 || a==7&&b>0&&b<=22){
            System.out.println("Cancer");
        }else if (a==7&&b>=23&&b<=31 || a==8&&b>0&&b<=23){
            System.out.println("Leo");
        }else if (a==8&&b>=24&&b<=30 || a==9&&b>0&&b<=23){
            System.out.println("Virgo");
        }else if (a==9&&b>=24&&b<=31 || a==10&&b>0&&b<=23){
            System.out.println("Libra");
        }else if (a==10&&b>=24&&b<=30 || a==11&&b>0&&b<=22){
            System.out.println("Scorpio");
        }else if (a==11&&b>=23&&b<=31 || a==12&&b>0&&b<=21){
            System.out.println("Sagittarius");
        }else if (a==12&&b>=22&&b<=30 || a==1&&b>0&&b<=20){
            System.out.println("Capricorn");
        }else{
            System.out.println("Error");
        }
    }
}
