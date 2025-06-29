package practice;

public class reverseword2 {
public static void main(String[] args) {
  String name = "welcome to java";
  String[] words = name.split(" ");
  StringBuilder result = new StringBuilder();
                                                                                                                                                                                                                                                                                                      
  for (String word : words) {
      if (word.equals("java")) {
          // Reverse only the word "java"
          String reversed = new StringBuilder(word).reverse().toString();
          result.append(reversed);
      } else {
          result.append(word);
      }
      result.append(" ");
  }

  // Trim extra space and print
  System.out.println(result.toString().trim());
}
}
