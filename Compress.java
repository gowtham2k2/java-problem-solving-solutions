public class Compress {
    public public static void main(String[] args) {

        compress("aabbc");

    }

    public static void compress(String str) {
        int i = 0;
        int j;
        int count = 0;
        StringBuilder out = new StringBuilder("");
        System.out.println(str.length());

        while (i < str.length()) {
            if (str.length() == 1) {
                System.out.println(str);
                break;
            }
            j = i;
            while (j < str.length() && str.charAt(j) == str.charAt(i)) {
                count++;
                j++;
            }
            if (count == 1) {
                out.append(str.charAt(i));

            } else {
                out.append(str.charAt(i) + "" + count);
            }
            i = j;
            count = 0;
        }

        System.out.println(out.toString());
    }

}
