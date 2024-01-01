class SubstringWorksheet {

    /*
    *
    * What is a substring?
    *  - substring means a portion of a string or all of a string. For example sub string of "string" are:
    *       - "strin", "tring", "ring", "in", "g", or entire string: "string"
    *
    * What is a Java's substring method do?
    *  - it let's you create a substring for any given Java string
    *
    * */

    public static void main(String[] args) {
        //Remove first character of string
        String removeFirst = "string";
        String removeFirstSubstring = removeFirst.substring(/* TODO: answer here */);
        if (!removeFirstSubstring.equals("tring")) throw new RuntimeException("wrong answer");
        System.out.println(removeFirstSubstring);


        //Remove 4 character of string
        String removeFirstFour = "string";
        String removeFirstFourSubstring = removeFirst.substring(/* TODO: answer here */);
        if (!removeFirstFourSubstring.equals("ng")) throw new RuntimeException("wrong answer");
        System.out.println(removeFirstFourSubstring);

        // Leave just "g" at the end of the string
        String leaveLastCharacter = "string";
        String leaveLastCharacterSubstring = leaveLastCharacter.substring(/* TODO: answer here */);
        if (!leaveLastCharacterSubstring.equals("g")) throw new RuntimeException("wrong answer");
        System.out.println(leaveLastCharacterSubstring);


        // Leave just "in" characters in the string
        String leaveIN = "string";
        String leaveINSubstring = leaveIN.substring(/* TODO: answer here */);
        if (!leaveINSubstring.equals("in")) throw new RuntimeException("wrong answer");
        System.out.println(leaveINSubstring);


        // Leave just "s" at the beginning of string (only leave first character)
        String leaveJustBeginningCharacter = "string";
        String leaveJustBeginningCharacterSubstring = leaveJustBeginningCharacter.substring(/* TODO: answer here */);
        if (!leaveJustBeginningCharacterSubstring.equals("s")) throw new RuntimeException("wrong answer");
        System.out.println(leaveJustBeginningCharacterSubstring);


        //remove last character (leave "strin")
        String removeLastCharacter = "string";
        String removeLastCharacterSubstring = removeLastCharacter.substring(/* TODO: answer here */);
        if (!removeLastCharacterSubstring.equals("strin")) throw new RuntimeException("wrong answer");
        System.out.println(removeLastCharacterSubstring);

    }

}
