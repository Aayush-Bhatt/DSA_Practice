// to find max and minimum of an array

public class MaxInArray {

    public static void main(String []args){

        int arr[] = {800,500,200,1000,400};
        int max = arr[0];
        int min = arr[0];
        for (int i =0; i< arr.length;i++){
            if(max<arr[i] ){
                max = arr[i];
            }
            if(min>arr[i] ){
                min = arr[i];
            }
        }
        System.out.println("The maximum number is " + max);
        System.out.println("The minimum number is " + min);
    }

}
