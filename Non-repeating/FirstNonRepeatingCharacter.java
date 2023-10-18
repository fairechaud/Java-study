public class FirstNonRepeatingCharacter {

    public static void main(String[] args) {
        String str1 = "codingblocks";
        String str2 = "abbac";
        String str3 = "java";
        String str4 = "ccdd";

        System.out.println(getFirstNonRepeatingCharacter(str1)); // d
        System.out.println(getFirstNonRepeatingCharacter(str2)); // c
        System.out.println(getFirstNonRepeatingCharacter(str3)); // j
        System.out.println(getFirstNonRepeatingCharacter(str4)); // -1
    }

    private static char getFirstNonRepeatingCharacter(String str) {
        int[] count = new int[256];
        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)]++;
        }

        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)] == 1) {
                return str.charAt(i);
            }
        }

        return '-';
    }
}
