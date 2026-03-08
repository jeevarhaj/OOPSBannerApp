import java.util.HashMap;

public class OOPSBannerApp {

    public static void main(String[] args) {

        // Step 1: Create character map
        HashMap<Character, String[]> charMap = createCharacterMap();

        // Step 2: Display banner for OOPS
        displayBanner("OOPS", charMap);
    }
    public static HashMap<Character, String[]> createCharacterMap() {

        HashMap<Character, String[]> charMap = new HashMap<>();

        // O pattern
        charMap.put('O', new String[]{
                " *** ",
                "*   *",
                "*   *",
                "*   *",
                " *** "
        });

        // P pattern
        charMap.put('P', new String[]{
                "**** ",
                "*   *",
                "**** ",
                "*    ",
                "*    "
        });

        // S pattern
        charMap.put('S', new String[]{
                " ****",
                "*    ",
                " *** ",
                "    *",
                "**** "
        });

        return charMap;
    }
    public static void displayBanner(String message,
                                     HashMap<Character, String[]> charMap) {

        int patternHeight = charMap.get('O').length;

        for (int line = 0; line < patternHeight; line++) {

            StringBuilder sb = new StringBuilder();

            for (char ch : message.toCharArray()) {

                String[] pattern = charMap.get(ch);

                if (pattern != null) {
                    sb.append(pattern[line]).append(" ");
                }
            }

            System.out.println(sb.toString());
        }
    }
}