#include<stdio.h>
#define size 5
struct stack{
	int top;
	char arr[size];
	}ss;
int isFull(){
	if(ss.top==size-1)return 1;
	else return 0;}
void push(char data){
	if(isFull()==1)return;
	ss.top++;
	ss.arr[ss.top]=data; 
}
char pop(){
	char item=ss.arr[ss.top];
	ss.top--;
	return item;
	}
int main(){int i;ss.top=-1;
	char a[]="hello";
	for(i=0;i<5;i++){
		push(a[i]);
		} 
	for(i=0;i<5;i++){
		printf("%c",pop());
		}
	}