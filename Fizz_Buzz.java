/*Purpose : a program that prints the numbers from 1 to 100. 
But for multiples of 3 it prints "Fizz" and for the multiples of 5 it prints "Buzz".
For numbers which are multiples of both 3 and 5 it prints "FizzBuzz".
@saiabhi29 Abhinav Penagalapati
Created on : 10/14/2020
*/public class Fizz_Buzz {
    public static void main(String []args){
        for (int i =1;i<=100;i++){
            if (i%3==0 && i%5==0){
                System.out.println("FizzBuzz");
            }
            else if (i%3==0){
                System.out.println("Fizz");
            }
            else if (i%5==0){
                System.out.println("Buzz");
            }
            else{
                System.out.println()
            }
        }
    }
}