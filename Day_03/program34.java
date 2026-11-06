//Approach 2
import java.util.Scanner;

class program34
{
    public int addition(int iNo1, int iNo2)
    {
        int iAns = 0;
        iAns = iNo1 + iNo2;
        return iAns;
    }
    public static void main(String[] args)
    {
        Scanner scanner = null;
        int iValue1 = 0, iValue2 = 0, iResult = 0;

        scanner = new Scanner(System.in);

        System.out.println("Enter first number : ");
        iValue1 = scanner.nextInt();

        System.out.println("Enter second number : ");
        iValue2 = scanner.nextInt();

        iResult = addition(iValue1, iValue2);   //error: non-static method addition(int,int) cannot be referenced from a static context

        System.out.println("Addition is " + iResult);
            

    }
}