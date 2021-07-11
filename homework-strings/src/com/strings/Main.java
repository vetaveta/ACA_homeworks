package com.strings;

import java.util.Scanner;

import static com.strings.Strings_Methods.capitalizeString;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        String b = sc.next();
        System.out.println(a.length() + b.length());
        boolean compareString = Strings_Methods.isAnagram(a, b);
        System.out.println(compareString);
        String cap = capitalizeString("hello", "aca");
        System.out.println(cap);
    }


}
