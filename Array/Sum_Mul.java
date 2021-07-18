//sum and multiplication of all the elements present in an array;

public class Sum_Mul {
    public static void main(String []args){

        int marks[] = {1,2,3,5};
        int sum=0;
        int mul = 1;
        for (int i=0; i<marks.length; i++){
            sum += marks[i];
            mul *= marks[i];
        }
    System.out.println(sum);
        System.out.println(mul);
    }
}
