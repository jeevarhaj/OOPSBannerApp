public class OOPSBannerApp {

    public static void main(String[] args) {

        // Inline initialization using String.join()
        String[] lines = {
            String.join(" ", " *** ", " *** ", " ***** ", " ***** "),
            String.join(" ", "** **", "** **", "**  **", "**    "),
            String.join(" ", "** **", "** **", "**  **", "**    "),
            String.join(" ", "** **", "** **", "***** ", "***** "),
            String.join(" ", "** **", "** **", "**    ", "   ** "),
            String.join(" ", "** **", "** **", "**    ", "   ** "),
            String.join(" ", " *** ", " *** ", "**    ", "***** ")
        };

        // Print banner using for-each loop
        for (String line : lines) {
            System.out.println(line);
        }
    }
}
