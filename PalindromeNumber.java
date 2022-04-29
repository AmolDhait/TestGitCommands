import java.util.Scanner;

public class PalindromeNumber {
    public static void main(String args[]){
        int r,sum=0,temp;
        int num;
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter the number: ");
        num = inp.nextInt();

        temp=num;

        while(num!=0){
            r=num%10;
            sum=(sum*10)+r;
            num=num/10;
        }
        if(temp==sum)
            System.out.println("palindrome number ");
        else
            System.out.println("not palindrome");
    }
}
