package org.example.ch1;

public class c_Variable
{
    public static void main(String[] args)
    {
        String name;
        name = "김가은";

        int price;
        price = 100;

        int num;
        char chr;
        boolean bool;

        num = 10;
        chr = '와'; // char(단일문자)는 '' String(문자열)은 ""
        bool = true;

        System.out.println(name);

        int age;
        int Age; // age != Age;

        int height = 170;
        height = 160;

        System.out.println(height);

        final int number = 12345; //final이라 재할당 안됨

        int numberValue = 10;
        System.out.println(numberValue);
    }
}
