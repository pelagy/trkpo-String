//Напишите программу, отображающую переданную строку задом наперёд. Напишите тесты.


package com.trkpo;
public class Main {

    public static void main(String args[]) {
        String string = reverseString("мама мыла раму");
        System.out.println(string);
    }

    public static String reverseString(String str) {
        StringBuffer buffer = new StringBuffer(str);
        buffer.reverse();
        return buffer.toString();
    }
}