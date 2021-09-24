#include<iostream>
using namespace std;
int main()
	{
		int op1;int op2;char opt;int result;
		std::cout<<"Please input two operands: ";
		std::cin>>op1;
		std::cin>>op2;
	
		
		std::cout<<"Please input an operator: ";
		std::cin>>opt;

		switch (opt)
		{
			case '*' :
				result = op1 * op2;
				std::cout<<"Multiplying "<<op1<<" and "<<op2<<" = "<<result;

				break;

			case '+' :
				result = op1 + op2;
				std::cout<<"Adding "<<op1<<" and "<<op2<<" = "<<result;

				break;

		}
	}
				

