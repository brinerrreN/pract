package org.example;

public class ReverseLetter {
    public static void main(String[] args) {
        String input = "J@va the be$t!123";
        String result = reverseLetters(input);
        System.out.println(result);
    }

    public static String reverseLetters(String s) {
        if (s == null || s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (!Character.isLetter(chars[left])) {
                left++;
                continue;
            }
            if (!Character.isLetter(chars[right])) {
                right--;
                continue;
            }
            char temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }


        return new String(chars);
    }
}
