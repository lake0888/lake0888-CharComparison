public class CharComparison {
    /**
     * Given an array of char, determine if the array A belongs to the left or to the right of char array B lexigraphically.
     * That means its position in a dictionary, eg:
     * cat < dog < mouse
     * cat < car < care
     * You will need to compare an index of both arrays against each other as you iterate with a for loop.
     *
     * @param a an array of char.
     * @param b an array of char.
     * @return -1 if A is less than B, 1 if A is greater than B, and 0 if the two arrays are identical.
     */
    public int compare(char[] a, char[] b){
        int c_A = (a.length < b.length) ? 1 : 0;
        int c_B = (b.length < a.length) ? 1 : 0;
        int c_0 = 0;
        int size = Math.min(a.length, b.length);
        for (int i = 0; i < size; i++) {
            if (a[i] < b[i])
                c_B++;
            else if(a[i] > b[i])
                c_A++;
            else
                c_0++;
        }
        if (c_A < c_B) return -1;
        else if (c_A > c_B) return 1;
        return 0;
    }
    /*
    public int compare1(char[] a, char[] b){
        String s_a = "";
        String s_b = "";
        for (int i = 0; i < a.length; i++)
            s_a += a[i];
        for (int i = 0; i < b.length; i++)
            s_b += b[i];
        int comp = s_a.compareTo(s_b);
        if (comp < 0) return -1;
        else if (comp > 0) return 1;
        return 0;
    }*/
}
