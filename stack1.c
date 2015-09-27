#include<stdio.h>
#include<stdlib.h>
#define size 5
struct stack{
	int top;
	int arr[size];}stack;
int isFull(){
	if(stack.top==size-1)
	return 1;
	else return 0;
	}
int isEmpty(){
	if (stack.top==-1)return 1;
	else return 0;
	}
void push(int data)
{	
	if(isFull()==1)return;
	stack.top++;
	stack.arr[stack.top]=data;
}
int pop(){
	int item= stack.arr[stack.top];
	stack.top--;
	return item;	
}
int main(){
	stack.top=-1;
	push(4);
	push(98);
	printf("%d",pop());
	printf("%d",pop());
	}