// to check whether a given array is sorted or not.
public class sortOrnot {
            public static void main(String []args){

            int arr[] = {100,200,800,500,200,1000,400};
            boolean isSorted = true;
            for (int i =0; i< arr.length-1;i++){
             if(arr[i] > arr[i+1]){
                 isSorted=false;
                 break;
             }


            }if(isSorted){
                    System.out.println("Array is sorted");
                }
                else{
                    System.out.println("Array is not sorted");
                }
        }

    }

