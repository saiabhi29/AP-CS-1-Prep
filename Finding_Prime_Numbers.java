/*Purpose : A program that prints prime for every prime number from 3 to 100
@saiabhi29 Abhinav Penagalapati
Created on : 10/15/2020
*/
public class Finding_Prime_Numbers {
    public static boolean isPrime( int n ){
        boolean a = false;
        for (int i =2;i<=n-1;i++){
            if (n%i==0){
                a = false;
                return a;
            }
            else{
                a = true;
            }
        }
        return a;
    }
    public static void main(String []args){
        boolean d = true;
        for (int i =3;i<=100;i++){
            d = isPrime(i);
            if (d ==  false){
                System.out.println(i);
            }
            else{
            System.out.println("prime");
            }
        }
    }
}
