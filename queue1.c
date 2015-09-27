#include<stdio.h>
#define size 5
struct queue{
	int top;
	int bottom;
	int arr[size];
	}q;
int isEmpty(){
	if(q.top==-1)return 1;
	return 0;
	}
void enq(int data){
	if(isEmpty()==1){
		q.top++;
		q.bottom++;
		q.arr[q.top]=data;
		}
	else {
		q.top++;
		q.arr[q.top]=data;
		}
	}
int deq(){
	int r=q.arr[q.bottom];
	q.bottom--;
	return r;
	}
int main(){
	q.top=-1;
	q.bottom=-1;
	enq(5);
	enq(32);
	enq(54);
	printf("%d",deq());
	}