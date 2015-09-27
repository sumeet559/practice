#include<stdio.h>
int pair(int arr,int x,int n)
{
int M[100]={null};
for(int i=0;i<n;i++){
M[arr[i]]=1;
if(M[x-arr[i]]==1){
printf("%d %d",arr[i],x-arr[i]);
}
}
}
int main(){
int A[]={1,4,45,6,10,8};
int size=6;
int x=16;
pair(A,x,size);
}