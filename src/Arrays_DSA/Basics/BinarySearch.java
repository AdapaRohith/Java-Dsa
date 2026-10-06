package Arrays_DSA.Basics;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr = {10, 20, 30, 40, 50, 60, 70};
        int target = 50;
        int n =arr.length;
        int low = 0;
        int high = n-1;

        while (low<=high){
            int mid = (low+high)/2;
            if(arr[mid]==target){
                System.out.println(mid);
                break;
            } else if (arr[mid]<target) {
                low = mid+1;
            }
            else {
                high = mid -1;
            }
        }
    }
}
