public class D221220 {
    public static void main(String[] args) {
        String s = "abcabcadc";
        StringBuilder sb = new StringBuilder();
        int[] count = new int[26];

        for(int i=0; i<s.length();i++)
            count[s.charAt(i)-'a']++;

        for(int i=0; i<26; i++) {
            if(count[i] == 1)
                sb.append((char)('a'+i));
        }
        System.out.println(sb);
    }
}
