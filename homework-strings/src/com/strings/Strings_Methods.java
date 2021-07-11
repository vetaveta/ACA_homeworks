package com.strings;

import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class Strings_Methods {
    public static String capitalizeString(String a, String b) {
        a = a.substring(0, 1).toUpperCase() + a.substring(1);
        b = b.substring(0, 1).toUpperCase() + b.substring(1);
        return a + " " + b;
    }

    public static boolean isAnagram(String a, String b) {
        char[] aChars = a.toLowerCase().toCharArray();
        char[] bChars = b.toLowerCase().toCharArray();
        Arrays.sort(aChars);
        Arrays.sort(bChars);
        return Arrays.equals(aChars, bChars);
    }
}


