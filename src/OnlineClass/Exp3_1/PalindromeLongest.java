package OnlineClass.Exp3_1;

class PalindromeLongest
{
    public static String expand(String str, int down, int up)
    {
        int len = str.length();
        while (down >= 0 && up < len &&
                (str.charAt(down) == str.charAt(up))) {
            down--;
            up++;
        }
        return str.substring(down + 1, up);
    }
    public static String LargestPalindromicSubstring(String str, int len)
    {
        String max_str = "", curr_str;
        int max_length = 0, curr_length;
        for (int i = 0; i < len; i++)
        {
            curr_str = expand(str, i, i);


            curr_length = curr_str.length();
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
            curr_str = expand(str, i, i + 1);
            curr_length = curr_str.length();
            if (curr_length > max_length)
            {
                max_length = curr_length;
                max_str = curr_str;
            }
        }
        return max_str;
    }
    public static void main(String[] args)
    {
        String str = "hackerrekcahba";
        System.out.println("The largest palindromic substring of the given input "
                + str + " is "
                + LargestPalindromicSubstring(str, str.length() - 1));
    }
}
