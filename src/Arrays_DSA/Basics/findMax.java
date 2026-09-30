package Arrays_DSA.Basics;

public class findMax {
   public static void main(String[] args) {
       int[] arr = {10, 45, 23, 89, 12, 67};
       int max = arr[0];

       for(int i = 0 ; i< arr.length;i++){
           if(arr[i]>max){
               max = arr[i];
           }
       }
       System.out.println(max);
    }
}
