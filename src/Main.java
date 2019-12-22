public class Main {
    public static void main(String[] args) {
        String userInput = "What??Where??Why??When??";
        String userExpression = "??";
        int loopConstant = indexCounter(userInput, userExpression);
        for (int i = 0; i < loopConstant; i += 1) {
            userInput = uSplitter(userInput, userExpression);
            System.out.printf("Cut Version is: %s\n", userInput);
        }
    }

    //# Functions

    //08
    private static int indexCounter(String input, String expression) {
        int counter= 1;
        String outString = input;
        while (uIndexOfEx(outString, expression) > 0){
            outString = uRemove(outString,expression);
            counter+=1;
        }

        return counter;
    }

    //07
    private static String uSplitter(String input, String expressionToRemove) {
        //System.out.printf("%s\n", input);
        StringBuilder output = new StringBuilder();
        int i = 0;

        while (i < input.length()) {
            if (i != uIndexOfEx(input, expressionToRemove)) {
                output.append(input.charAt(i));
                i+=1;
            } else {
                //System.out.println(uIndexOfEx(input, expressionToRemove));
                //System.out.println("Else");
                output.append(" ");
                i += expressionToRemove.length();
            }

        }
        return output.toString();


    }

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
