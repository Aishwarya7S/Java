public class Strings {
    public static void main(String[] args) {
        String name = "Java";
        System.out.println(name);

        System.out.println(name.length());

        System.out.println(name.charAt(1));

        System.out.println(name.substring(1, 3));

        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        System.out.println(name.startsWith("Ja"));
        System.out.println(name.endsWith("a"));

        System.out.println(name.isEmpty());

        String input = "Hello";
        System.out.println(input.equalsIgnoreCase("hello"));
        
        System.out.println(input.replace("l", "o"));

        String text = "Have a happy day";
        System.out.println(text.indexOf("happy"));

        System.out.println(text.contains("day"));

        String fullName = name.concat("Language");
        System.out.println(fullName);

        String a = "Code";
        String b = "Code";
        String c = new String("Code");
        // .equals -> content cmp  == -> reference cmp
        System.out.println(a == b);         //t  
        System.out.println(a == c);         // f    
        System.out.println(a.equals(c));    //t

        String formattedText = String.format("Name: %s, Age: %d", "Asha", 22);
        System.out.println(formattedText);

   }
    
}
