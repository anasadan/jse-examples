package core.assignment;

public class StringReverseMain {

    /**
     * @param args
     */
    private static StringBuffer recursive = new StringBuffer();
    private static StringBuilder strReverse = new StringBuilder();

    public static void main(String...args) {
        final String NAME = "Himnansu Nayak";
        reverseString(NAME);
        System.out.println(strReverseDell("DELL"));
        revereStringRecursive(NAME);
        System.out.println(recursive);
        System.out.println(strRevRecursiveDell("DELL"));
    }

    public static void reverseString(String string) {
        StringBuffer reverseName = new StringBuffer(string.length());
        for (int index = string.length() - 1; index >= 0; index--) {
            reverseName.append(string.charAt(index));
        }
        System.out.println(reverseName.toString());
    }

    public static void revereStringRecursive(String string) {
        recursive.append(string.charAt(string.length() - 1));
        if (string.length() == 1) {
            return;
        } else {
            revereStringRecursive(string.substring(0, string.length() - 1));
        }
    }

    public static String strRevRecursiveDell(final String string){
        if(string == null){
            throw new IllegalArgumentException("string is null or empty");
        }else if(string.isEmpty()){
            return string;
        }else{
            strReverse.append(string.charAt(string.length() - 1));
            strRevRecursiveDell(string.substring(0, string.length() - 1));
            return strReverse.toString();
        }
    }

    public static String strReverseDell(final String string){
        if(string == null || string.isEmpty()){
            throw new IllegalArgumentException("string is null or empty");
        }else {
            final StringBuilder stringReverse = new StringBuilder();
            for(int i = string.length() - 1; i >= 0 ; i--){
                stringReverse.append(string.charAt(i));
            }
            return stringReverse.toString();
        }

    }





}
