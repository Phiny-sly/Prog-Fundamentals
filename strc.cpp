#include<iostream>
#include<cstring>

int main()
{      
       	int len;
	char word[(len)];
	std::string input;
	std::cout<<"Input a word: ";
	std::cin>>input;
	len = input.length();

	strcpy(word,input.c_str());

	for(int i=0;i<=len;i++)
	{
		std::cout<<"\n"<<word[i];
	}

	



}
