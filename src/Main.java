import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int max=0;
        int min=0;
        System.out.println("Kaç sayı giriceksiniz:");
        int x = input.nextInt();
        System.out.println("sayıları arka arkaya giriniz!");
        for(int i =1;i<=x;i++) {
            System.out.println(i + ".sayıyı giriniz:");
            int n = input.nextInt();
            if (i == 1) {
                max = n;
                min = n;
            }

            if (n > max) {
                max = n;
            }
            if (n < min) {
                min = n;
            }
        }
            System.out.println("Girdiğiniz sayılar:");
            System.out.println("Maksimum:"+max);
            System.out.println("Minimum:"+min);

        }
    }

