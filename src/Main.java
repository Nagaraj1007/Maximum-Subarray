
public class Main {

    public static int maximumSubarraySum(int array[], int maxSum){
        int maxSubarraySum = 0;
        for (int iterator1 = 0 ; iterator1 < array.length; iterator1++){
            for (int iterator2 = iterator1 ; iterator2 < array.length ; iterator2++){
                int subarraySum = 0;
                for (int iterator3 = iterator1 ; iterator3 <= iterator2 ; iterator3++){
                    subarraySum += array[iterator3];
                    if (subarraySum <= maxSum){
                        maxSubarraySum = Math.max(maxSubarraySum, subarraySum);
                    }
                }
            }
        }
        return maxSubarraySum;
    }

    public static void main(String[] args) {
        System.out.println(maximumSubarraySum(new int[]{2,1,3,4,5}, 12));
    }
}