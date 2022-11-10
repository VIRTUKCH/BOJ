#include<iostream>
#include<string>
#include<cstring>
using namespace std;

class Queue
{
public:
	int front;
	int rear;
	int* data;
	Queue()
	{
		front = rear = -1;
		data = new int[10000];
	}
	~Queue()
	{
		delete [] data;
	}
};

void push(Queue *q, int X)
{
	q->data[++q->rear] = X;
}

void pop(Queue *q)
{
	if(q->rear == q->front)
	{
		cout << "-1" << endl;
	}
	else
	{
		cout << q->data[++(q->front)] << endl;
	}
}

void size(Queue *q)
{
	cout << q->rear - q->front << endl;
}

void empty(Queue *q)
{
	if(q->rear == q->front)
	{
		cout << "1" << endl;
	}
	else
	{
		cout << "0" << endl;
	}
}

void front(Queue *q)
{
	if(q->front == q->rear)
	{
		cout << "-1" << endl;
	}
	else
	{
		cout << q->data[q->front+1] << endl;
	}
}

void back(Queue *q)
{
	if(q->front == q->rear)
	{
		cout << "-1" << endl;
	}
	else
	{
		cout << q->data[q->rear] << endl;
	}
}

int main()
{
	int N, num;
	cin >> N;
	Queue q;

	char str[10];
	for(int i=0; i<N; i++)
	{
		scanf("%s",str);
		if(strcmp(str,"push") == 0)
		{
			cin >> num;
			push(&q, num);
		}
		else if(strcmp(str,"front") == 0)
		{
			front(&q);
		}
		else if(strcmp(str,"back") == 0)
		{
			back(&q);
		}
		else if(strcmp(str,"size") == 0)
		{
			size(&q);
		}
		else if(strcmp(str,"empty") == 0)
		{
			empty(&q);
		}
		else if(strcmp(str,"pop") == 0)
		{
			pop(&q);
		}
	}
}
