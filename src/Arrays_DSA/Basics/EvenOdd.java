package Arrays_DSA.Basics;

public class EvenOdd {
   public static void main(String[] args) {
        int[] arr = {10, 15, 22, 7, 8, 13, 20};
        int even = 0;
        int odd =0;
        for(int i=0;i< arr.length;i++){
            if(arr[i]%2==0){
                even++;
            }
            else {
            odd++;
            }
        }
        System.out.println("Even Count: "+even);
        System.out.println("Odd Count: "+odd);
    }
}
