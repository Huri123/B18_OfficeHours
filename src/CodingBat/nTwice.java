package CodingBat;

public class nTwice {
    public static void main(String[] args) {
        System.out.println( nTwice("Hello",1));
    }
    public static String nTwice(String str, int n) {
        String front = str.substring(0,n);
        String back = str.substring(str.length()-n);
        return front+back;
    }

}
