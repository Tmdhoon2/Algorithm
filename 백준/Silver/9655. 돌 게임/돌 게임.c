#include <stdio.h>

int main(void){
    
    int N;
    
    scanf("%d", &N);
    
    if(N%2==0){
        printf("CY");
    }
    else if(N%2==1){
        printf("SK");
    }
    
    return 0;
}    