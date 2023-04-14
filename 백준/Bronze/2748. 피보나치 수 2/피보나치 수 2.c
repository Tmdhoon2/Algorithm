#include <stdio.h>
long long int vis[100] = {0};

long long int fivo(long long int v){
    if(v == 0) return 0;
    else if(v == 1 || v == 2) return 1;
    if (vis[v] != 0) {
        return vis[v];
    } else {
        vis[v] = fivo(v - 1) + fivo(v - 2);
        return vis[v];
    }
}

int main(){
    int a;
    scanf("%d", &a);
    printf("%lld", fivo(a));
}