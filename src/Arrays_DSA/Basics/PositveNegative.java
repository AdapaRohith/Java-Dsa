package Arrays_DSA.Basics;

public class PositveNegative {
    public static void main(String[] args){
        int[] arr = {-10, 20, -5, 0, 15, -2, 8};
        int positive = 0;
        int negative = 0 ;
        int zero = 0;
        for(int i = 0;i<arr.length;i++){
            if(arr[i]>0){
                positive++;
            } else if (arr[i]==0) {
                zero++;
            }
            else {
                negative++;
            }
        }
        System.out.println("Positive Count: "+positive );
        System.out.println("Negative Count: "+negative );
        System.out.println("Zero Count: "+zero );

    }
}
