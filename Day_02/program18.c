#include<stdio.h>
#include<stdlib.h>

void checkEven(int iNo)
{
    if((iNo % 2) == 0)
    {
        printf("It is even number\n");
    }
    else
    {
        printf("It is odd number\n");
    }
}
int main()
{
    int iNum = 0;

    printf("Enter number : \n");
    scanf("%d", &iNum);

    checkEven(iNum);

    return EXIT_SUCCESS;
}