package org.learning;

public class snackThree {
    public static void main(String[] args) {
        int[] numbers = {1,2,3,4,5,6,7,8,9,10,11,12,13};

        int result = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(i % 2 == 0){
                result += numbers[i];
            }
        }
        System.out.println(result);
    }
}
