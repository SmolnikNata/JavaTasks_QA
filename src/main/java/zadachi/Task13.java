package zadachi;

public class Task13 {
    public static void main(String[] args) {
//        Задача 13
//        Найти сумму положительных нечетных чисел, меньших 50. Написать на это код
       int[]ar = { 3,35,1,4,57,2,1,85,90};
        System.out.println(sumUneven(ar));

    }
    public static int sumUneven(int[]arr){
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<50 && arr[i]%2 !=0){
                sum+=arr[i];
            }
        }
        return sum;


    }

}
