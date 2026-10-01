package Arrays_DSA.Basics;

public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10, 25, 30, 45, 50, 60};
        int target = 45;
        boolean found = false;
        for(int i =0;i<arr.length;i++){
            if(arr[i]==target){
                found = true;
            }
        }
        if(found){
            System.out.println("Found");
        }
        else{
            System.out.println("Not found");
        }
    }
}
