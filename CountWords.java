import java.util.*;

public class CountWords {
    public static void main(String[] args) {
        String str;
        Scanner sc = new Scanner(System.in);
        char ch;
        int i;
        int count = 0;
        int length;
        boolean isaPunctuation = false;
        System.out.print("Enter a string >> ");
        str = sc.nextLine();
        length = str.length();
        for (i = 0; i < length; i++) {
            ch = str.charAt(i);
            if (ch == ' ' || ch == '.' || ch == ';' || ch == ',' ||
                    ch == '!' || ch == '-') {
                ++count;
                if (isaPunctuation)
                    --count;
                isaPunctuation = true;
            } else
                isaPunctuation = false;
        }
        if (!isaPunctuation)
            ++count;

        System.out.println("There are " + count + " words in the string");
    }
}
