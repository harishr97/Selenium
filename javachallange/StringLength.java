package org.testleaf.javachallange;

public class StringLength {

    public static int lengthOfLastWord(String s) {
        int length = 0;
        
        int i = s.length() - 1;
        while (i >= 0 && s.charAt(i) == ' ') {
            i--;
        }

        while (i >= 0 && s.charAt(i) != ' ') {
            length++;
            i--;
        }
        return length;
    }
    public static void main(String[] args) {
        String s = "Hello World";
        int result = lengthOfLastWord(s);
        System.out.println("Length of last word: " + result);

        String s1 = "fly me   to   the moon";
        int result1 = lengthOfLastWord(s1);
        System.out.println("Length of last word: " + result1);

        String s2 = "luffy is still joyboy";
        int result2 = lengthOfLastWord(s2);
        System.out.println("Length of last word: " + result2);   
    }
}

