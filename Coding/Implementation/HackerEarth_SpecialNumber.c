#include <stdio.h>

int digits(int n) {
    if (n == 0) return 1;
    int c = 0;
    while (n > 0) {
        c += (n%10);
        n /= 10; 
    }
    return c;
}

int main(){
	int t;
	scanf("%d", &t);              	                  
	while(t-- > 0){
		int num;
		scanf("%d",&num);
		while(digits(num)%4!=0){
			num+=1;
		}
		printf("%d\n",num);

	}
	return 0;
}
