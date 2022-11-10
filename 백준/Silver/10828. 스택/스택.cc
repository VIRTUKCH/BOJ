#include<iostream>
#include<string>
using namespace std;

class Stack
{
public:
	int* value;
	int Size;
	int tos;

	Stack()
	{
		value = new int[10000];
		Size = 0;
		tos = -1;
	}
	~Stack()
	{
		delete [] value;
	}
};

void push(Stack *s, int X)
{
	s->Size++;
	s->value[++(s->tos)] = X;
}

void pop(Stack *s)
{
	if(s->tos == -1)
	{
		cout << "-1" << endl;
	}
	else
	{
		cout << s->value[s->tos] << endl;
		s->tos = s->tos - 1;
	}
}

void size(Stack *s)
{
	cout << (s->tos) + 1 << endl;
}

void empty(Stack *s)
{
	if(s->tos == -1)
	{
		cout << "1" << endl;
	}
	else
	{
		cout << "0" << endl;
	}
}

void top(Stack *s)
{
	if(s->tos == -1)
	{
		cout << "-1" << endl;
	}
	else
	{
		cout << s->value[s->tos] << endl;
	}
}

int main()
{
	int N, num;
	cin >> N;
	Stack s;

	string str;
	for(int i=0; i<N; i++)
	{
		cin >> str;
		if(str == "push")
		{
			cin >> num;
			push(&s, num);
		}
		else if(str == "top")
		{
			top(&s);
		}
		else if(str == "size")
		{
			size(&s);
		}
		else if(str == "empty")
		{
			empty(&s);
		}
		else if(str == "pop")
		{
			pop(&s);
		}
	}
}
