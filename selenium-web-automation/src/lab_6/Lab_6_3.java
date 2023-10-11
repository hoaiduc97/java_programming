package lab_6;

public class Lab_6_3 {
    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] chars = myStr.toCharArray();
        String newStr = "";
        for (char aChar : chars) {
            if(Character.isDigit(aChar)){
                newStr +=aChar;
            }
        }
        System.out.println(newStr);
    }
}
