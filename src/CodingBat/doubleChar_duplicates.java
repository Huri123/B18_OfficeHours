package CodingBat;

public class doubleChar_duplicates {
    public String doubleChar(String str) {
        String result="";
        for(int i=0;i<str.length();i++){
            // result+=""+str.charAt(i)+str.charAt(i);
            result+=str.substring(i,i+1)+str.substring(i,i+1);
        }
        return result;

    }
}
