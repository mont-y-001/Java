public class MaxSum_Sub {
       public static void main(String[] args) {
        int arr[] = {4,1,5,1,3,6};
        int k = 3;
        int windowSum = 0;
        for(int i = 0;i<k;i++){
             windowSum += arr[i];
        }
        int maxSum = windowSum;
        for(int i = k;i<arr.length;i++){
            windowSum = windowSum + arr[i] - arr[i-k];
            if(windowSum>maxSum){
                maxSum = windowSum;
            }
        } 
        System.out.println("MaxSum SubArray is->" + maxSum);
       }    
}
