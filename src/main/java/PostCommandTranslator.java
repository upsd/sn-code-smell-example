public class PostCommandTranslator {
    public static String translate(String command) {

        String toReturn = "";

        if (command.equals("post")) {
            toReturn = "post";
        }

        if (command.equals("read")) {
            toReturn = "read";
        }

        if (command.equals("wall")) {
            toReturn = "wall";
        }

        return toReturn;
    }
}
