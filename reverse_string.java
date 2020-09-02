public class reverse_string {
    public void reverseString(char[] s) {
        reverse(s, 0, s.length - 1);
    }
    
    public void reverse(char[] s, int i, int e) {
        if (e <= i)
            return;
        reverse(s, i+1, e-1);
        swap(s, i, e);
    }
    
    public void swap(char[] s, int a, int b) {
        char tmp = s[a];
        s[a] = s[b];
        s[b] = tmp;
    }
}
