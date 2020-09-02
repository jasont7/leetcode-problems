public class number_complement {
    public int findComplement(int n) {
        String binary = Integer.toBinaryString(n);
        StringBuilder complement = new StringBuilder();

        for (int c=0; c < binary.length(); c++) {
            if (binary.charAt(c) == '1')
                complement.append('0');
            else complement.append('1');
        }

        int out = Integer.parseInt(complement.toString(), 2);
        return out;
    }
}
