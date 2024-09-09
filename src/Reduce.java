public class Reduce {
    public static void main(String[] args) {
        int steps = 0;
        int initial = 100;
        while (initial > 0) {
            if (initial % 2 == 0) {
                initial = initial / 2;
            }
            else {
                initial = initial - 1;
            }
            steps++;
        }
        System.out.println(steps);
    }
}
