package org.testleaf.week3.day2.classroom;

public class ReverseSting {
    public static void main(String[] args) {
        String companyName="TestLeaf";
        char[] charArray = companyName.toCharArray();
        String reverse="";
        for (int i=charArray.length-1; i>=0; i--){
           reverse=reverse+charArray[i];
        }
        System.out.println("The reverse of the string is: "+reverse);
    }
}