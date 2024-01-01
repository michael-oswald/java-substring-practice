class SubstringWorksheetAnswers {

    public static void main(String[] args) {
        //Remove first character of string
        String removeFirst = "string";
        String removeFirstSubstring = removeFirst.substring(1);
        if (!removeFirstSubstring.equals("tring")) throw new RuntimeException("wrong answer");
        System.out.println(removeFirstSubstring);


        //Remove 4 character of string
        String removeFirstFour = "string";
        String removeFirstFourSubstring = removeFirst.substring(4);
        if (!removeFirstFourSubstring.equals("ng")) throw new RuntimeException("wrong answer");
        System.out.println(removeFirstFourSubstring);

        // Leave just "g" at the end of the string
        String leaveLastCharacter = "string";
        String leaveLastCharacterSubstring = leaveLastCharacter.substring(5);
        if (!leaveLastCharacterSubstring.equals("g")) throw new RuntimeException("wrong answer");
        System.out.println(leaveLastCharacterSubstring);



        // Leave just "in" characters in the string
        String leaveIN = "string";
        String leaveINSubstring = leaveIN.substring(3,5);
        if (!leaveINSubstring.equals("in")) throw new RuntimeException("wrong answer");
        System.out.println(leaveINSubstring);


        // Leave just "s" at the beginning of string (only leave first character)
        String leaveJustBeginningCharacter = "string";
        String leaveJustBeginningCharacterSubstring = leaveJustBeginningCharacter.substring(0,1);
        if (!leaveJustBeginningCharacterSubstring.equals("s")) throw new RuntimeException("wrong answer");
        System.out.println(leaveJustBeginningCharacterSubstring);


        //remove last character (leave "strin")
        String removeLastCharacter = "string";
        String removeLastCharacterSubstring = removeLastCharacter.substring(0, removeLastCharacter.length() - 1);
        if (!removeLastCharacterSubstring.equals("strin")) throw new RuntimeException("wrong answer");
        System.out.println(removeLastCharacterSubstring);

    }
}
