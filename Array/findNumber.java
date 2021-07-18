// To find whether a number is present in a given array or not

import java.util.Scanner;
public class findNumber {

    public static void main(String [] args){
        int array[] = {40,50,60,70,80};
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        boolean isInArray = false;
        for ( int i =0; i<array.length; i++ ) {
            if (array[i] == n) {
                isInArray = true;
                break;
            }
        }
        if(isInArray){
            System.out.println("Number present");
        }
        else{
            System.out.println("Number not present");
        }
        }

    }
