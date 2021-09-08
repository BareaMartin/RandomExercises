package encontrarfraseigual;

public class EncontrarFraseIgual {

    public static void main(String[] args) {

        System.out.println("Is aaa palindrom?: "
                + isPalindromString("aaa"));
    }

    public static boolean isPalindromString(String text) {
        String reverse = reverse(text);
        return text.equals(reverse);
    }

    public static String reverse(String input) {
        if (input == null || input.isEmpty()) {
            return input;
        }
        return input.charAt(input.length() - 1) + reverse(input.substring(0, input.length() - 1));
    }

}
