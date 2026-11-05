#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>

bool checkEven(int iNo)
{
    if((iNo % 2) == 0)
    {
        return true;
    }
    else
    {
        return false;
    }
}
int main()
{
    int iNum = 0;
    bool bRet = false;

    printf("Enter number : \n");
    scanf("%d", &iNum);

    bRet = checkEven(iNum);

    if(bRet == true)
    {
        printf("It is even number\n");
    }
    else
    {
        printf("It is odd number\n");
    }

    return EXIT_SUCCESS;
}