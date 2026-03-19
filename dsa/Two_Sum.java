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








// public class TwoSumSorted {

//     static int[] twoSum(int[] arr, int target) {

//         int left = 0;
//         int right = arr.length - 1;

//         while (left < right) {

//             int sum = arr[left] + arr[right];

//             if (sum == target) {
//                 return new int[]{left, right};
//             }

//             if (sum < target) {
//                 left++;
//             } else {
//                 right--;
//             }
//         }

//         return new int[]{-1, -1};
//     }

//     public static void main(String[] args) {

//         int[] arr = {2, 7, 11, 15};
//         int target = 9;

//         int[] result = twoSum(arr, target);

//         System.out.println(result[0] + " " + result[1]);
//     }
// }