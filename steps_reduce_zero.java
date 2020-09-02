public class steps_reduce_zero {
    public int numberOfSteps (int num) {
        if (num == 0)
            return 0;
        else if (num % 2 == 0)
            num = num/2;
        else
            num--;

        return 1 + numberOfSteps(num);
    }
}
