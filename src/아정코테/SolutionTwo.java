package 아정코테;

public class SolutionTwo {

    public static void main(String[] args) {
        int solution = solution(10000000, 9, 13000000);
        System.out.println(solution);
    }

    public static int solution2(int p, int m, int d){















        return 1;
    }



    public static int solution(int p, int m, int d) {

        int minRate = 0;
        int maxRate = 100;
        int result = -1;

        while (minRate <= maxRate) {
            int midRate = (minRate + maxRate) / 2;
            long currentAmount = p;

            for (int i = 0; i < m; i++) {
                currentAmount += (currentAmount * midRate) / 100;
            }

            if (currentAmount >= d) {
                result = midRate;
                maxRate = midRate - 1;
            } else {
                minRate = midRate + 1;
            }
        }

        return result;
    }
}
