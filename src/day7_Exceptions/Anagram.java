package day7_Exceptions;

public class Anagram {

    public static void main(String[] args) {
        System.out.println(isAnagram("aabc","cbab"));
        System.out.println(1+2+"hello"+1+2);
    }

    public static boolean isAnagram(String one, String two) {
        // aabc
        // abc

        if(one.length() != two.length()) return false;

        for(int i=0; i < one.length(); i++) {

            two = two.replaceFirst("" + one.charAt(i),"");

        }

        return two.isEmpty();
    }

}