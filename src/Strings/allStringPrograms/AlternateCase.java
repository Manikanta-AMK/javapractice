package Strings.allStringPrograms;

public class AlternateCase {
    public static void main(String[] args) {
        String input = "manikanta arige";
        String result = "";
        String result1 = "";
        boolean isUpper = true;

        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);

            if (Character.isLetter(ch)) {
                if (isUpper) {
                    result += Character.toUpperCase(ch);
                } else {
                    result += Character.toLowerCase(ch);
                }
                isUpper = !isUpper; // toggle
            } else {
                result += ch; // keep space as it is
            }
        }

        System.out.println(result);
        
        for (int i = 0; i < input.length(); i++) {
        	result1=result+input.charAt(i);
        }
        System.out.println(result1);
    }
}








