#include<stdio.h>
#include<stdlib.h>
struct node
{
	int data;
	struct node* next;
};
void push(struct node** headref,int data1)
{
	struct node* new_node= (struct node*) malloc(sizeof(struct node));
	new_node->data = data1;
	new_node->next=*headref;
	*headref=new_node;
	
}
void print(struct node* headref)
{
while(headref!=NULL){
	printf("%d ",headref->data);
	headref=headref->next;
	}
}
int getmid(struct node* headref)
{
	struct node* fastptr=headref;
	struct node* slowptr=headref;
	while(fastptr!=NULL && fastptr->next!=NULL){
	slowptr=slowptr->next;
	fastptr=fastptr->next->next;
	}
	return slowptr->data;
}
/*void delete(struct node** headref){
    struct node* current=*headref;
	struct node* next1;
	while(current!=NULL){next1=current->next;
	    free(current);
	    current=next1;
	}
	*headref=NULL;
}*/
int nth_from_end(struct node* headref,int n)
{
	struct node* fastptr=headref;
	struct node* slowptr=headref;
	int i=0;
	while(i<n){fastptr=fastptr->next;i++;}
	while(fastptr!=NULL){fastptr=fastptr->next;
	slowptr=slowptr->next;
	}
	return slowptr->data;
}
void reverse(struct node** headref)
{
	struct node* prev=NULL;
	struct node* now=*headref;
	struct node* next2=NULL;
	while(now!=NULL){next2=now->next;
	now->next=prev;
	prev=now;
	now=next2;
	}
	*headref=prev;
	return;
}void swap(int* a,int* b);
void pirwiseswap(struct node* headref)
{
	struct node* ptr=headref;
	while(ptr!=NULL && ptr->next!=NULL){
	swap(&ptr->data,&ptr->next->data);
	ptr=ptr->next->next;
	}
}
void swap(int* a,int* b)
{
	int temp;
	temp=*a;
	*a=*b;
	*b=temp;
	return;
}

/*int detect_loop(struct node* headref)
{
	struct node* fastptr=headref;
	struct node* slowptr=headref;
while(slowptr && fastptr && fastptr->next){
	slowptr=slowptr->next;
	fastptr=fastptr->next->next;
	if(slowptr==fastptr)
		printf("loop found");
	}
}*/
void dup_unsorted(struct node* headref)
{
	int arr[1000]={0};
	struct node* ptr=headref;
	struct node* prev;
	while(ptr!=NULL){if(arr[ptr->data]==1){prev->next=ptr->next;free(ptr);}
	arr[ptr->data]=1;
	prev=ptr;
	ptr=ptr->next;
	}
}
void move_last_to_first(struct node** headref)
{
	struct node* ptr=*headref;
	struct node* prev;
	while(ptr!=NULL){prev=ptr;ptr=ptr->next;}
	prev->next=NULL;
	ptr->next=*headref;
	*headref=ptr;
}
void delete_alternate(struct node* headref)
{
	struct node* prev=headref;
	struct node* current=headref->next;
	while(prev!=NULL && current!=NULL){
		prev->next=current->next;
		free(current);
		prev=prev->next; if(prev != NULL)
        current = prev->next;
	}
}
/*struct node* merge_sorted(struct node* headref1,struct node* headref2)
{	struct node* source=NULL;
	struct node* ptr1=headref1;
	struct node* ptr2=headref2;
	while(ptr1!=NULL || ptr2!=NULL){
		if(ptr1->data < ptr2->data){
			push(&source,ptr1->data);printf("$%d #%d",ptr1->data,ptr2->data);ptr1=ptr1->next;
			}
			else {push(&source,ptr2->data);ptr2=ptr2->next;}

		return source;
	}*/
int identicalLL(struct node* headref1,struct node* headref2)
{int t=0;
	while(headref1!=NULL || headref2!=NULL){
			if(headref1->data == headref2->data){
					continue;
				}
				else {t=0;break;}
		}
		return t;
	}
void reverse_in_groups(struct node** headref)
{	
	struct node* ptr=*headref;
	struct node* prev=NULL;
	struct node* next4;
	
		while(ptr!=NULL){
			next4=ptr->next;
			ptr->next=prev;
			prev=ptr;
			ptr=next4;			
			}
		*headref=NULL;
}
void yuhi(struct node* headref)
{
	struct node* ptr=headref;
	struct node* ptr2=headref;
	struct node* temp;
	while(ptr!=NULL && ptr->next!=NULL){
		if(ptr->next->data < ptr2->data){temp=ptr->next;ptr->next=temp->next;free(temp);}
		else {ptr=ptr->next;ptr2=ptr;}
		}
	}

int main(){
struct node* head1=NULL;
//struct node* head2=NULL;
//struct node* source=NULL;
push(&head1,547);
push(&head1,555);
push(&head1,600);
push(&head1,253);
push(&head1,700);
/*push(&head2,599);
push(&head2,578);
push(&head2,289);
push(&head2,265);
push(&head2,101);*/
//int r=getmid(head1);
//printf("%d %d",r,nth_from_end(head,2));
//delete(&head);
//dup_unsorted(head);
//pirwiseswap(head);
//move_last_to_first(&head);
//delete_alternate(head);
print(head1);
reverse(&head1);
yuhi(head1);
reverse(&head1);
print(head1);
//print(head2);
//int d=identicalLL(head1,head2);
//if(d==1)printf("yes identical");
//else printf("not identical");
//merge_sorted(head1,head2);
//struct node* hello= merge_sorted(head1,head2);
//print(hello);

}



