package CodingBat;

public class StringMiddle {
    public String middleTwo(String str) {

        //return "" + str.charAt(str.length() / 2 - 1) + str.charAt(str.length() / 2);


        // 2.yol
        int mid1 = str.length() / 2 - 1;
        int mid2 = str.length() / 2;

        //String word = "" + str.charAt(mid1) + str.charAt(mid2);
       // return word;

        //3.yol
        return str.substring(mid1,mid2+1);
    }

}
