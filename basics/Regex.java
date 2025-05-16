//A regular expression is a pattern used for searching & manipulating strings.
// Use - import java.util.regex package
// The package includes the following classes:
// Pattern Class - Defines a pattern (to be used in a search)
// Matcher Class - Used to search for the pattern
// PatternSyntaxException Class - Indicates syntax error in a regular expression pattern

import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.regex.PatternSyntaxException;

public class Regex {
    public static void main(String[] args) {
        String pattern1 = "[a-z]+";
        String pattern2 = "[a-z++";
        String text = "java Language";

        System.out.println("Testing Pattern1 ->  " +  pattern1);
        try {
            Pattern p1 = Pattern.compile(pattern1); 
            Matcher m1 = p1.matcher(text);
            while (m1.find()) {
                System.out.println(" Match: "  + text.substring(m1.start(), m1.end()));
            }
        }
        catch (PatternSyntaxException e) {
            System.out.println("Pattern1 is invalid");
        }

        System.out.println("Testing Pattern2 ->  " + pattern2);
        try {
            Pattern p2 = Pattern.compile(pattern2);
            Matcher m2 = p2.matcher(text);
            while (m2.find()) {
                System.out.println("Match: " + text.substring(m2.start(), m2.end()));
            }
        }
        catch(PatternSyntaxException e) {
            System.out.println("Pattern2 is invalid");
            // System.out.println("Description: " + e.getDescription());
            // System.out.println("Message: " + e.getMessage());
            // System.out.println("Pattern: " + e.getPattern());
        }
           
   }
}

// Description: Unclosed character class
// Message: Unclosed character class near index 5 [a-z++      ^
// Pattern: [a-z++     
        
