/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ADMIN
 */
public class NumberProcessor implements INumberUtilities {

    @Override
    // return the first even number of the list
    public int findFirstEvenNumber(String number) {
        if (number == null || number.isEmpty()){
            return -1;
        }
        String [] splittedNumber = number.trim().split("\\s+");
        for (String s : splittedNumber) {
            int num = Integer.parseInt(s);
            if(num % 2 == 0) {
                return num;
            }
        }
        return -1;
    }

    @Override
    //return the sum of all number ( if negative number, processes the absolute value of the number )
    public int sumOfDigits(int number) {
         number = Math.abs(number);
         int sum = 0;
         for (; number > 0; number /= 10) {
            sum += number %10;
        }
         return sum;
    }
    
}
