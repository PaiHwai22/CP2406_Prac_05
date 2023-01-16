import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String myStr;
        Scanner sc = new Scanner(System.in);
        char ch;
        int i;
        int count_words = 0;
        int length;
        boolean isaPunctuation = false;
        System.out.print("Enter a string >> ");
        myStr = sc.nextLine();
        length = myStr.length();
        for (i = 0; i < length; i++) {
            ch = myStr.charAt(i);
            if (ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
                    ch == '!' || ch == '-') {
                ++count_words;
                if (isaPunctuation)
                    --count_words;
                isaPunctuation = true;
            } else
                isaPunctuation = false;
        }
        if (!isaPunctuation)
            ++count_words;

        System.out.println("There are " + count_words + " words in the string");
    }
}
