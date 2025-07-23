
import java.util.Scanner;


public class ReverseNumber {
 public static void main(String[] args) {
     int n; // Declare int n to store the input

     Scanner scanner = new Scanner(System.in);//Prompt the user to enter the no.
     System.err.println("Enter the Number:");
     n = scanner.nextInt();
    
    int revNum =0;
    //Initialize a variable 'revNum' to
    // store the reverse of the input integer.

    while(n>0){
        int ld =n%10;
        revNum =(revNum*10)+ld;
        n=n/10;
   }
   System.out.println(revNum);
 }
}