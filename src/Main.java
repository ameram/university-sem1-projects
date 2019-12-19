public class Main {
    public static void main(String[] args) {

        System.out.println(uToLower("Amir"));
        System.out.println(uToUpper("Amir"));
    }

    private static String uToLower(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch: input.toCharArray()) {

            if (ch <= 'Z' && ch >= 'A'){
                output.append((char) (ch + 32));
            } else {
                output.append(ch);
            }

        }
        return output.toString();
    }

    private static String uToUpper(String input) {
        StringBuilder output = new StringBuilder();
        for (char ch: input.toCharArray()) {

            if (ch <= 'z' && ch >= 'a'){
                output.append((char) (ch - 32));
            } else {
                output.append(ch);
            }

        }
        return output.toString();
    }


}
