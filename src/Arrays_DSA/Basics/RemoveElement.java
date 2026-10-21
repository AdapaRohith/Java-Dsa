package Arrays_DSA.Basics;

public class RemoveElement {
    public static void main(String[] args) {
        int[] arr = {1,1,2,2,3,3,4,5,6};
        int val= 3;
        if(arr.length==0){
            System.out.println(0);
            return;
        }
        int i =0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=val){
                arr[i] = arr[j];
                i++;
            }
        }
        int k = i;
        System.out.println(i);
    }
}
