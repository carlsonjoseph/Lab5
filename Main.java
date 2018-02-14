import java.util.Scanner;
import java.lang.*;

public class Main {

    public static void main(String[] args) {


        Scanner scnr = new Scanner(System.in);
        System.out.print("Enter a hexadecimal number: ");
        String hexNum = scnr.next().toUpperCase();

        if (hexNum.contains("0X")) {
            hexNum = hexNum.replaceAll("0X", "");
        }

        long sum = 0;
        int power = 0;
        int index = hexNum.length() - 1;

        while (index >= 0) {
            char a = hexNum.charAt(index);

            if (a == '0') {
                a = 0;
            } else if (a == '1') {
2                a = 1;
            } else if (a == '2') {
                a = 2;
            } else if (a == '3') {
                a = 3;
            } else if (a == '4') {
                a = 4;
            } else if (a == '5') {
                a = 5;
            } else if (a == '6') {
                a = 6;
            } else if (a == '7') {
                a = 7;
            } else if (a == '8') {
                a = 8;

            } else if (a == '9') {
                a = 9;
            } else if (a == 'A') {
                a = 10;
            } else if (a == 'B') {
                a = 11;
            } else if (a == 'C') {
                a = 12;
            } else if (a == 'D') {
                a = 13;
            } else if (a == 'E') {
                a = 14;
            } else if (a == 'F') {
                a = 15;
            }


            sum += a * (Math.pow(16, power++));
            index--;
        }

        System.out.println("Your number is " + sum + " in decimal");
        
        //hello2


    }
}





