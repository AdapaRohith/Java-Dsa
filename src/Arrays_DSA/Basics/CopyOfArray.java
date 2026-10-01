package Arrays_DSA.Basics;

public class CopyOfArray {
    public static void main(String[] args){
        int[] arr = {10, 20, 30, 40, 50};
        int [] copyArr = new int[arr.length];

        for (int i =0;i<arr.length;i++){
            copyArr[i] = arr[i];
        }
        for(int x:copyArr){
            System.out.print(x+" ");
        }
    }
}
