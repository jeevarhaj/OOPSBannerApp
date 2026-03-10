public class OOPSBannerApp {

    static class CharacterPatternMap {
        private char character;
        private String[] pattern;

        public CharacterPatternMap(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        public char getCharacter() {
            return character;
        }

        public String[] getPattern() {
            return pattern;
        }
    }

    public static CharacterPatternMap[] createCharacterPatternMaps() {

        String[] O = {
            " *** ",
            "** **",
            "** **",
            "** **",
            "** **",
            "** **",
            " *** "
        };

        String[] P = {
            "**** ",
            "** **",
            "** **",
            "**** ",
            "**   ",
            "**   ",
            "**   "
        };

        String[] S = {
            " ****",
            "**   ",
            "**   ",
            " *** ",
            "   **",
            "   **",
            "**** "
        };

        String[] SPACE = {
            "     ","     ","     ","     ","     ","     ","     "
        };

        return new CharacterPatternMap[]{
            new CharacterPatternMap('O', O),
            new CharacterPatternMap('P', P),
            new CharacterPatternMap('S', S),
            new CharacterPatternMap(' ', SPACE)
        };
    }

    public static String[] getCharacterPattern(char ch, CharacterPatternMap[] maps) {
        for (CharacterPatternMap m : maps) {
            if (m.getCharacter() == ch) {
                return m.getPattern();
            }
        }
        return maps[maps.length - 1].getPattern(); 
    }

  
    public static void printMessage(String message, CharacterPatternMap[] maps) {

        int height = 7;

        for (int row = 0; row < height; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray()) {
                String[] pattern = getCharacterPattern(ch, maps);
                line.append(pattern[row]).append("  ");
            }

            System.out.println(line);
        }
    }

    
    public static void main(String[] args) {

        CharacterPatternMap[] maps = createCharacterPatternMaps();
        String message = "OOPS";

        printMessage(message, maps);
    }
}
