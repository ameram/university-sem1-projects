public class Main {
    public static void main(String[] args) {

    }

    //# Functions

    //06
    private static String uRemove(String input, String toRemove) {
        int startingPlace = uIndexOfEx(input, toRemove);
        StringBuilder output = new StringBuilder();
        int i = toRemove.length();
        int counter = 0;
        while (counter < input.length()) {
            if ((counter < startingPlace) || (counter > startingPlace + i - 1)) {
                output.append(input.charAt(counter));

            }
            counter += 1;
        }

        return output.toString();
    }

    //05
    private static int uIndexOfEx(String input, String expression) {
        int i = 0;

        int lastIndex = input.length() - expression.length();
        while (i < lastIndex) {
            int x = 0;
            while ((input.charAt(i + x) == expression.charAt(x))) {
                x += 1;
                if (x == expression.length() - 1) {
                    return i;
                }

            }
            i += 1;
        }
        return -1;
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
        StringBuilder output = new StringBuilder();
        int startPlace = 0;
        int lastIndex = input.length() - 1;
        while (input.charAt(startPlace) == ' ') {
            startPlace += 1;
        }
        while (input.charAt(lastIndex) == ' ') {
            lastIndex -= 1;
        }
        while (startPlace <= lastIndex) {
            output.append(input.charAt(startPlace));
            startPlace += 1;
        }
        return output.toString();
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
