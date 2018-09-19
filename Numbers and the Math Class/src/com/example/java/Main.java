package com.example.java;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        double input = 1;
        double total = 0;
        double tax, totaltax, rectip;
        String tout, taout, ttout, rtout;

        while (input != 0)
        {
            input = getInput("Enter price of item: ");
            total += input;

        }
        NumberFormat tnf = NumberFormat.getNumberInstance();
        tnf.setGroupingUsed(true);
        tnf.setMaximumFractionDigits(2);
        tnf.setMinimumFractionDigits(2);
        tout = tnf.format(total);
        System.out.println("Your total is $" + tout);

        tax = total*0.025;
        NumberFormat tanf = NumberFormat.getNumberInstance();
        tanf.setGroupingUsed(true);
        tanf.setMaximumFractionDigits(2);
        tanf.setMinimumFractionDigits(2);
        taout = tanf.format(tax);
        System.out.println("Tax is $" + taout);

        totaltax = total+tax;
        NumberFormat ttnf = NumberFormat.getNumberInstance();
        ttnf.setGroupingUsed(true);
        ttnf.setMaximumFractionDigits(2);
        ttnf.setMinimumFractionDigits(2);
        ttout = tnf.format(totaltax);
        System.out.println("Your total with tax is $" + ttout);

        rectip = totaltax*0.175;
        NumberFormat rtnf = NumberFormat.getNumberInstance();
        rtnf.setGroupingUsed(true);
        rtnf.setMaximumFractionDigits(2);
        rtnf.setMinimumFractionDigits(2);
        rtout = tnf.format(rectip);
        System.out.println("It is recommended to pay a 17.5% tip, or $" + rtout);

    }
    private static double getInput(String item){
        double result;
        Scanner sc = new Scanner(System.in);
        System.out.println(item);
        result = sc.nextDouble();
        return result;
    }
}
