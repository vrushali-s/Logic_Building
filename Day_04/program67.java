import java.util.Scanner;

class program66
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int iValue = 0;
        
        Iteration iteration = new Iteration();

        System.out.println("Enter the frequency : ");
        iValue = scanner.nextInt();

        iteration.display(iValue);
    }
}

class Iteration
{
    public void display(int iNo)
    {
        int iCnt = 0;                       
        
        iCnt = 1;                   //1     
        do        
        {
            System.out.println("-----------------");            //4    
            System.out.println(iCnt + " Jay Ganesh...");               
            System.out.println("-----------------");

            iCnt++;         //3
        }while(iCnt <= iNo);        //2
    }
}