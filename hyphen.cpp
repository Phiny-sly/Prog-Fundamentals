#include<iostream>
#include<cstring>
using namespace std;


int main()
{
	string input;
	int len;
	

	cout<<"Type a sentence with hyphens between each word: ";
	cin>>input;
	len= input.length();
	char word[len];

	strcpy(word,input.c_str());
	
	for(int i=0;i<len;i++)
	{
		if(word[i]=='-')
		{
			word[i]=' ';
			cout<<word[i];
		}
		else
		{
			cout<<word[i];
		}
	}

}
