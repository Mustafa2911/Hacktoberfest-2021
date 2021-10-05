import java.util.*;  
import static java.lang.Math.*;  

public class NarcissisticNumberExample1  
{  
    
//function counts the number of digits   
int countDigits(int number)  
{  
if (number == 0)  
return 0;  
return 1 + countDigits(number / 10);  
}  


//function checks if the given number is a Narcissistic number or not  
boolean isNarcissistic(int number)  
{  
//count the number of digits  
int pwr = countDigits(number);  
//assigning the value of n in the variable n  
int n = number;  
//stores the sum   
int sum = 0;  
//loop executes until the condition becomes false  
while(n > 0)  
{  
//first it finds the last digit of the given number  
//then it calculates the power of the last digit  
//at last the result is added to the variable sum  
sum+= pow(n % 10, pwr);  
//removes the last digit from the given number  
n = n / 10;  
}  
//compares the sum with number  
return (number == sum);  
}  


//driver code  
public static void main(String args[])  
{  
NarcissisticNumberExample1 nrstic = new NarcissisticNumberExample1 ();  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter the number: ");  
//reads an integer from the user  
int number = sc.nextInt();  
//  
if (nrstic.isNarcissistic(number))  
System.out.println("The given number "+number+" is a narcissistic number.");  
else  
System.out.println("The given number "+number+" is not a narcissistic number.");  
}  
}
