import java.util.Scanner;

public class Main {

    /*
            Выяснить является ли число палиндромом

            к примеру:
            3223 - число палиндром
            123 - число не палиндром

     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int num = input.nextInt();
//        int num = -2;

        if(num == 0 || (num < 10 && num > 0) || (num > -10 && num < 0)) {
            System.out.println("Число не палиндром");
            return;
        }

        int count = 0;
        int numTmp = num;

        while (numTmp != 0){
            numTmp = numTmp / 10;
            count++;
        }

        int[] arrayNums = new int[count];
        for (int i = 0; i < arrayNums.length; i++) {
            arrayNums[i] = num % 10;
            num = num / 10;
        }
        for (int i = 0; i < arrayNums.length; i++) {
            if(arrayNums[i] != arrayNums[arrayNums.length -1 - i ]){
                System.out.println("Число не палиндром");
                return;
            }
        }

        System.out.println("Число палиндром");



    }


}  
