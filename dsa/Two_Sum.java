import java.util.HashMap;

public class Two_Sum {

    public static int[] twoSum(int[] arr, int target) {

        HashMap<Integer, Integer> mpp = new HashMap<>();

        for(int i = 0; i < arr.length; i++) {
            int more = target - arr[i];

            if(mpp.containsKey(more)) {
                return new int[]{mpp.get(more), i};
            }

            mpp.put(arr[i], i);
        }

        return new int[]{-1, -1};
    }

    public static void main(String[] args) {

        int arr[] = {2,7,9,5,3};
        int target = 9;

        int[] result = twoSum(arr, target);

        System.out.println(result[0] + " " + result[1]);
    }
}