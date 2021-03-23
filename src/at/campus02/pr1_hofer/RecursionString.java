package at.campus02.pr1_hofer;

public class RecursionString {
    public static void main(String[] args) {
        String s = "David Hasselhoff";
        //System.out.println(s.startsWith("Hassel"));
        //System.out.println(s.startsWith("Davi"));
        //System.out.println(s.startsWith("Daiv"));

        System.out.println(findString("Hallo", "allo"));
        System.out.println(findString("Hallo", "lo"));
        System.out.println(findString("Hallo", "xo"));
        System.out.println(findString("Hallo", "Ha"));
        System.out.println(findString("David Hasselhoff","Dav"));
        System.out.println(findString("David Hasselhoff","Hass"));
        System.out.println(findString("David Hasselhoff","Hellf"));
    }

    public static boolean findString(String wort, String wortTeil) {
        if (wort == null || wortTeil == null){
            return false;
        }
        if (wort.startsWith(wortTeil)) {
            return true;
        } else if (wort.length() > wortTeil.length()) {
            wort = wort.substring(1);
            return findString(wort, wortTeil);
        } else {
            return false;
        }
    }
}
