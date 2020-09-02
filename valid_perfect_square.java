public class valid_perfect_square {
    public boolean isPerfectSquare(int num) {
        if (num == 1)
            return true;
        if (!validLastDigit(num))
            return false;
        
        for (int i=0; i <= num/2; i++) {
            if (i*i == num)
                return true;
        }
        return false;
    }
    
    public boolean validLastDigit(int n) {
        return (n%10 == 0 || n%10 == 1 || n%10 == 4 || n%10 == 5 || n%10 == 6 || n%10 == 9);
    }
}
