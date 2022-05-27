package com.expressionsstatementsmethods;

public class MegaBytesConverter {

    public static void printMegaBytesAndKiloBytes (int kilobytes) {
        int megabytes;
        if(kilobytes<0){
            System.out.println("Invalid Value");
        }
        else {
            megabytes = kilobytes/1024;
            int remainder = kilobytes%1024;
            System.out.format("%s KB = %s MB and %s KB",kilobytes,megabytes,remainder);
        }
    }
}