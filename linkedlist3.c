#include <stdio.h>
#include <stdlib.h>
struct node
{
  int data;
  struct node *next;
};
void push(struct node** head_ref, int new_data)
{
    struct node* new_node = (struct node*) malloc(sizeof(struct node));
    new_node->data  = new_data;
    new_node->next = (*head_ref);
    (*head_ref)    = new_node;
}
void insertAfter(struct node* prev_node, int new_data)
{
    if (prev_node == NULL)
    {
      printf("the given previous node cannot be NULL");
      return;
    }
    struct node* new_node =(struct node*) malloc(sizeof(struct node));
    new_node->data  = new_data;
    new_node->next = prev_node->next;
    prev_node->next = new_node;
}
void append(struct node** head_ref, int new_data)
{
    struct node* new_node = (struct node*) malloc(sizeof(struct node));

    struct node *last = *head_ref;
    new_node->data  = new_data;
    new_node->next = NULL;
    if (*head_ref == NULL)
    {
       *head_ref = new_node;
       return;
    }
    while (last->next != NULL)
        last = last->next;
    last->next = new_node;
    return;
}
void printList(struct node *node)
{
  while (node != NULL)
  {
     printf(" %d ", node->data);
     node = node->next;
  }
}
int size(struct node* headref)
{
	if(headref==NULL)return 0;
	return 1+size(headref->next);
	}
int search(struct node* headref,int data1){
	if(headref->data=data1 && headref!=NULL)return 1;
	int e=search(headref->next,data1);
	return e;
	}
int nthnode(struct node* headref,int n)
{	int cnt=0;
	while(cnt!=n){
		headref=headref->next;cnt++;
		}
		return headref->data;
	}

int main()
{
  
  struct node* head = NULL;


  append(&head, 6);

  
  push(&head, 7);

 
  push(&head, 1);

  
  append(&head, 4);

  
  insertAfter(head->next, 8);
  printf("%d %d %d",size(head),search(head,7),nthnode(head,2));

  printf("\n Created Linked list is: ");
  printList(head);

  getchar();
  return 0;
}