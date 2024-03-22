package 아정코테;

public class SolutionThree {

    public static int solution(int[] numbers) {
        return countZeroSum(numbers, 0, 0);
    }

    private static int countZeroSum(int[] numbers, int index, int sum) {
        if (index == numbers.length) {
            return sum == 0 ? 1 : 0;
        }

        // 현재 숫자를 양수로 추가하는 경우와 음수로 추가하는 경우를 모두 시도
        int positiveCount = countZeroSum(numbers, index + 1, sum + numbers[index]);
        int negativeCount = countZeroSum(numbers, index + 1, sum - numbers[index]);

        return positiveCount + negativeCount;
    }

    public static int solutionTwo(int[] numbers){
       return countSign(numbers, 0, 0);
    }

    public static int countSign(int[] number, int index, int sum){
        if( index == number.length ){
            return sum == 0 ? 1 : 0;
        }

        int positiveCount = countSign(number, index +1, number[index] + sum);
        int negativeCount = countSign(number, index+1, number[index] - sum);

        return positiveCount + negativeCount;
    }





















    public static void main(String[] args) {
        int[] numbers = {1, 1, 1, 1};
        System.out.println(solutionTwo(numbers));
    }
}
