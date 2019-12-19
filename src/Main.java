public class Main {
    public static void main(String[] args) {

        System.out.println(uToLower("Java"));
        System.out.println(uToUpper("Java"));
        System.out.println(setWidth("Java", 11));
        System.out.println(uTrim("      Java      ").length());
        System.out.println(uIndexOf("BMIRMOHAM", 'Q'));
    }

    //# Functions

    //05
    private static int uIndexOfEx(String input, String expression) {
        int startIndex = 0;
        int lastIndex = input.length() - expression.length();
        while (startIndex < lastIndex) {
            if (input.charAt(startIndex) == expression.charAt(startIndex))
                while (startIndex < expression.length()) {
                    startIndex+=1;
                }
            startIndex += 1;
        }
    }

    //04
    private static int uIndexOf(String input, char searchObject) {
        int i = 0;
        while (i < input.length()) {
            if (input.charAt(i) == searchObject) {
                return i;
            }
            i += 1;
        }
        return -1;
    }

    //03
    private static String uTrim(String input) {
        String output = "";
        int startPlace = 0;
        int lastIndex = input.length() - 1;
        while (input.charAt(startPlace) == ' ') {
            startPlace += 1;
        }
        while (input.charAt(lastIndex) == ' ') {
            lastIndex -= 1;
        }
        while (startPlace <= lastIndex) {
            output += input.charAt(startPlace);
            startPlace += 1;
        }
        return output;
    }

    //02
    private static String setWidth(String input, int margin) {
        int i = 0;
        StringBuilder output = new StringBuilder();
        while (i <= margin) {
            output.append(" ");
            i += 1;
        }
        output.append(input);


        return output.toString();
    }

    //01
    private static String uToUpper(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {

            if (ch <= 'z' && ch >= 'a') {
                output.append((char) (ch - 32));
            } else {
                output.append(ch);
            }

        }
        return output.toString();
    }

    //00
    private static String uToLower(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch : input.toCharArray()) {

            if (ch <= 'Z' && ch >= 'A') {
                output.append((char) (ch + 32));
            } else {
                output.append(ch);
            }

        }
        return output.toString();
    }

}
