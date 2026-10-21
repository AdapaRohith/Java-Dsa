package Arrays_DSA.Basics;

public class SortedArray_Duplicate {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,4,5};
        if(arr.length==0){
            System.out.println(0);
            return;
        }
        int i =0;
        for(int j=1;j<arr.length;j++){
            if(arr[i]!=arr[j]){
                i++;
                arr[i]=arr[j];
            }
        }
        int k = i+1;
        System.out.println("Unique count: " + k);
    }
}
