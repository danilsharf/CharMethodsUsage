public class Main {
    public static void main(String[] args) {
        // https://www.tutorialspoint.com/java/java_characters.htm
        System.out.println("------Char--------");

        // Char Declaration:
        String aStr = "StringTest";
        char[] charArray = aStr.toCharArray();
        for (char c : charArray) {
            System.out.print(c + ", ");
        }
        char varChar = '\u039A';
        // Or char ch = 'K';
        // If created as object with Character wrapper, you can use char methods.
        char varCharObj2 = new Character('A');
        char varCharNum = '1';

        // CHARACTER METHODS:
        // Char Numbers:
        Character.isDigit(varCharNum);
        int num = Character.getNumericValue(varCharNum);
        int charLength = Character.charCount(varCharNum);
        System.out.println("charLength: " + charLength);
        // Character ch = 'a'; // Automatically converts to object Character.

        // If you pass char to a method that expects Char, compiler will do autoboxing for you.

        System.out.println("varChar: " + varChar);
        System.out.println("varChar2: " + varCharObj2);
    }
}
